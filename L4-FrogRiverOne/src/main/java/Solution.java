
public class Solution {

    // Results:
    // https://codility.com/demo/results/trainingTBGDBS-BTC/

    // Source code with unit tests:
    // https://github.com/LeonardoBayona/codility/tree/master/L2-FrogRiverOne

    public int solution(int X, int[] A) {
        return calculateFrogRiverOne(X, A);
    }

    public int calculateFrogRiverOne(int targetPosition, int[] array) {
        int positionsReadyCount = 0;
        int[] positionsReady = new int[targetPosition + 1];
        for(int i = 0; i < array.length; i++) {
            if(array[i] <= targetPosition && positionsReady[array[i]] == 0) {
                positionsReady[array[i]] = array[i];
                positionsReadyCount++;

                if(positionsReadyCount == targetPosition) {
                    return i;
                }
            }
        }

        return -1;
    }

}
