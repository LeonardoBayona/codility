import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    // Results:
    //

    // Source code with unit tests:
    // https://github.com/LeonardoBayona/codility/tree/master/L4-MaxCounters

    public int[] solution(int N, int[] A) {
        return calculateMaxCounters(N, A);
    }

    public int[] calculateMaxCounters(int numCounters, int[] operations) {
        int finalBaseValue = 0;
        HashMap<Integer, Integer> currentValues = new HashMap<>();
        finalBaseValue = calculateFinalCountersValues(numCounters, operations, currentValues);
        return buildFinalValuesFullResponse(numCounters, finalBaseValue, currentValues);
    }

    /*
        Return counters with differences against default base value (last max operation, or 0 if there is no
        any max operation).
     */
    private int calculateFinalCountersValues(
            int numCounters,
            int[] operations,
            HashMap<Integer, Integer> currentValues
    ) {
        int finalBaseValue;
        int currentBaseValue = 0;
        int currentMax = 0;
        for(int i = 0; i < operations.length; i++) {
            int currentCounter = operations[i];
            if(currentCounter > numCounters) {
                // new base max default value, current values set to empty
                currentValues.clear();
                currentBaseValue = currentMax;
            }
            else {
                // update current counter, and current max if applies
                int currentCounterValue = currentValues.getOrDefault(currentCounter, currentBaseValue);
                currentCounterValue++;
                currentValues.put(currentCounter, currentCounterValue);
                if (currentCounterValue > currentMax) {
                    currentMax = currentCounterValue;
                }
            }
        }
        finalBaseValue = currentBaseValue;
        return finalBaseValue;
    }

    /*
    Build full response array based on counters with differences in its values against last base value.
     */
    private int[] buildFinalValuesFullResponse(int numCounters, int finalBaseValue,
            HashMap<Integer, Integer> currentValues
    ) {
        int[] finalCountersValues = new int[numCounters];
        for(int k = 0; k < numCounters; k++) {
            finalCountersValues[k] = currentValues.getOrDefault(k + 1, finalBaseValue);
        }

        return finalCountersValues;
    }

}
