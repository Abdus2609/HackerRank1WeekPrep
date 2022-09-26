public class P17LegoBlocks {
    
    public static int legoBlocks(int n, int m) {
        int md = 1000000007;
        
        long[] solidWallArr = new long[1001];
        long[] arrayNMWallCombs = new long[1001];
        long[] array1MWallCombs = new long[1001];

        for (int i = 1; i <= m; i++) {

            array1MWallCombs[i] = switch (i) {
                case 1 -> 1;
                case 2 -> 2;
                case 3 -> 4;
                case 4 -> 8;
                default -> ((array1MWallCombs[i - 1] % md) 
                         + (array1MWallCombs[i - 2] % md) 
                         + (array1MWallCombs[i - 3] % md) 
                         + (array1MWallCombs[i - 4] % md)) % md;
            };

            long temp = 1;  

            for (int j = 1; j <= n; j++) {
                temp = modMult(array1MWallCombs[i], temp, md);
            }

            arrayNMWallCombs[i] = temp;
        }

        for (int i = 1; i <= m; i++) {

            switch (i) {
                case 1 -> solidWallArr[i] = 1;
                case 2 -> solidWallArr[i] = (getModPowerOf2(n, md) - 1) % md;
                case 3 -> solidWallArr[i] = (getModPowerOf2(2 * n, md) - 2 * getModPowerOf2(n, md) + 1) % md;
                case 4 -> solidWallArr[i] = (getModPowerOf2(3 * n, md) - 3 * getModPowerOf2(2 * n, md) + 3 * getModPowerOf2(n, md) - 1) % md;
                default -> {    
                    solidWallArr[i] = arrayNMWallCombs[i];
                    for (int j = 1; j <= i - 1; j++) {
                        solidWallArr[i] -= (solidWallArr[j] * arrayNMWallCombs[i - j]) % md;  
                    }
                }
            };

            while (solidWallArr[i] < 0) {
                solidWallArr[i] += md;
            }

        }

        return (int) solidWallArr[m];

    }

    private static long modMult(long x, long y, long md){
		
		long tempX = x > md ? x % md : x;
		long tempy = y > md ? y % md : y;
		long tempResult = tempX * tempy;
		
		return tempResult > md ? tempResult % md : tempResult;
	}
	
	private static long getModPowerOf2(int n, long md){
		
		long result = 2;
		
		for(int i = 1; i < n; i++){	
			result %= md;
			result <<= 1;
		}
		
		return result;
	}
}
