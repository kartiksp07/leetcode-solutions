class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int tank = 0;
        int currGas = 0;

        for (int i = 0; i < gas.length; i++) {
            int fuelGain = gas[i] - cost[i];
            tank += fuelGain;
            currGas += fuelGain;

            if (currGas < 0) {
                currGas = 0;
                start = i + 1;
            }
        }

        return tank < 0 ? -1 : start;        
    }
}