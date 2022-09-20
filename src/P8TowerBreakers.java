public class P9TowerBreakers {
    
    public static int towerBreakers(int n, int m) {

       return (n % 2 == 0 || m == 1) ? 2 : 1;
    }
}
