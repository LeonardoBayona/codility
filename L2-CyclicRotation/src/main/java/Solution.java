
public class Solution {

    // Source code with unit tests:
    // https://github.com/LeonardoBayona/codility/tree/master/L2-CyclicRotation

    // Results:
    // https://codility.com/demo/results/trainingYWESPR-3XD/

    public int[] solution(int[] A, int K) {
        return calculateCyclicRotation(A, K);
    }

    public int[] calculateCyclicRotation(int[] array, int shift) {
        if(shift == 0 || array.length <= 1 || (shift % array.length) == 0) {
            // nothing to do
            return array;
        }

        shift = shift % array.length;

        int startGroup = 0;
        int previousElement = array[0];
        int nextIndex = shift;
        assert shift < array.length;
        for(int i = 0; i < array.length; i++) {
            int currentElement = array[nextIndex];
            array[nextIndex] = previousElement;

            // prepare to next shift
            if(nextIndex == startGroup) {
                startGroup++;
                nextIndex = startGroup + shift;
                previousElement = array[startGroup];
            }
            else {
                previousElement = currentElement;
                nextIndex = (nextIndex + shift) % array.length;
            }
        }

        return array;
    }

    public int[] calculateCyclicRotation2(int[] array, int shift) {
        if(shift == 0 || array.length <= 1 || (shift % array.length) == 0) {
            // nothing to do
            return array;
        }
        shift = shift % array.length;

        int [] response = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            response[(i + shift) % array.length] = array[i];
        }
        return response;
    }
}
