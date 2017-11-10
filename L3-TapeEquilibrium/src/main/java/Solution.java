
public class Solution {

    // Source code with unit tests:
    // https://github.com/LeonardoBayona/codility/tree/master/L2-TapeEquilibrium

    // Results:
    //

    public int solution(int[] A) {
        return calculateTapeEquilibrium(A);
    }

    public int calculateTapeEquilibrium(int[] array) {
        assert array.length >= 2;

        long[] firstSums = new long[array.length];
        long[] lastSums = new long[array.length];
        calculateSums(array, firstSums, lastSums);
        return findMinDifference(array, firstSums, lastSums);
    }

    private void calculateSums(int[] array, long[] firstSums, long[] lastSums) {
        long firstSum = 0;
        long lastSum = 0;
        for(int i = 1; i < array.length; i++) {
            firstSum += array[i - 1];
            lastSum += array[array.length - i];

            firstSums[i] = firstSum;
            lastSums[array.length - i] = lastSum;
        }
    }

    private int findMinDifference(int[] array, long[] firstSums, long[] lastSums) {
        long minDiff = Long.MAX_VALUE;
        for(int k = 1; k < array.length; k++) {
            long currentDiff = Math.abs(firstSums[k] - lastSums[k]);
            if(currentDiff < minDiff) {
                minDiff = currentDiff;
            }
        }
        return (int) minDiff;
    }

}
