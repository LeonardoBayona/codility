
public class Solution {

    // Results:
    // https://codility.com/demo/results/trainingWZQZ9H-G2M/

    // Source code with unit tests:
    // https://github.com/LeonardoBayona/codility/tree/master/L2-PermMissingElem

    public int solution(int[] A) {
        return calculatePermMissingElem(A);
    }

    public int calculatePermMissingElem(int[] array) {
        int totalSum = 0;
        int actualSum = 0;
        for(int i = 0; i < array.length; i++) {
            totalSum += (i + 1);
            actualSum += array[i];
        }
        totalSum += (array.length + 1);
        return totalSum - actualSum;
    }
}
