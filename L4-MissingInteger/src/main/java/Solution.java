
public class Solution {

    // Results:
    //

    // Source code with unit tests:
    // https://github.com/LeonardoBayona/codility/tree/master/L2-MissingInteger

    public int solution(int[] A) {
        return calculateMissingInteger(A);
    }

    public int calculateMissingInteger(int[] array) {
        int[] foundValues = new int[array.length + 1];
        markFoundValues(array, foundValues);
        return getMinimumNotFoundValue(foundValues);
    }

    private void markFoundValues(int[] array, int[] foundValues) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] > 0 && array[i] <= array.length) {
                foundValues[array[i]] = array[i];
            }
        }
    }

    private int getMinimumNotFoundValue(int[] foundValues) {
        for(int k = 1; k < foundValues.length; k++) {
            if(foundValues[k] == 0) {
                return k;
            }
        }
        return foundValues.length;
    }

}
