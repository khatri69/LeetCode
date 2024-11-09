class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int sum_gas=0;
        int sum_cost=0;
        int current=0;
        for(int i=0; i<gas.length; i++){
            sum_gas = sum_gas + gas[i];
            sum_cost = sum_cost + cost[i];
    }
    if(sum_gas < sum_cost){
        return -1;
    }

    for(int i=0; i<gas.length; i++){
        current = current + (gas[i] - cost[i]);
        if(current < 0){
            start = i+1;
            current=0;
            }
        }
    return start;

    }
}