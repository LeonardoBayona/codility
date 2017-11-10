
public class Solution {

    // Source code with unit tests:
    // https://github.com/LeonardoBayona/codility/tree/master/L2-PermMissingElem

    // Results:
    //

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
