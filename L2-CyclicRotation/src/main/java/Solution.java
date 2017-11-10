
public class Solution {

    // Source code with unit tests:
    // https://github.com/LeonardoBayona/codility/tree/master/L2-CyclicRotation

    // Results:
    //

    public int[] solution(int[] A, int K) {
        return calculateCyclicRotation(A, K);
    }

    public int[] calculateCyclicRotation(int[] array, int shift) {
        if(shift == 0 || shift == array.length || array.length <= 1) {
            // nothing to do
            return array;
        }

        shift = shift % array.length;

        int previousElement = array[0];
        int nextIndex = shift;
        assert shift < array.length;
        for(int i = 0; i < array.length; i++) {
            int currentElement = array[nextIndex];
            array[nextIndex] = previousElement;

            // prepare to next shift
            previousElement = currentElement;
            nextIndex = (nextIndex + shift) % array.length;
        }

        return array;
    }

}
