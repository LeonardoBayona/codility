
public class Solution {

    // Results:
    // https://codility.com/demo/results/trainingN2RY6J-DQN/

    // Source code with unit tests:
    // https://github.com/LeonardoBayona/codility/tree/master/L2-PermCheck

    public int solution(int[] A) {
        return calculatePermCheck(A) ? 1 : 0;
    }

    public boolean calculatePermCheck(int[] array) {
        assert array.length > 0;

        int[] allNumbers = new int[array.length + 1];
        for(int i = 0; i < array.length; i++) {
            assert array[i] > 0;

            if(biggerThanN(array, i) || alreadyFound(allNumbers, array, i)) {
                return false;
            }
            allNumbers[array[i]] = array[i];
        }
        return true;
    }

    private boolean biggerThanN(int[] array, int i) {
        return array[i] > array.length;
    }

    private boolean alreadyFound(int[] allNumbers, int[] array, int i) {
        return allNumbers[array[i]] != 0;
    }

}
