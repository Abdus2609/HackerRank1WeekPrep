
import java.util.List;

public class TruckTour {
    
    public static int truckTour(List<List<Integer>> petrolpumps) {

        for (int i = 0; i < petrolpumps.size(); i++) { 
            int tank = 0;
            int startingPump = i;

            for (int j = 0; j < petrolpumps.size(); j++) {
                int currPump = (startingPump + j) % petrolpumps.size();
                tank += petrolpumps.get(currPump).get(0) - petrolpumps.get(currPump).get(1);
                if (tank < 0) {
                    break;
                }

                if (j == petrolpumps.size() - 1) {
                    return startingPump;
                }
            }
            
        }

        return -1;
    }
}
