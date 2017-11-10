
public class Solution {

    // Results:

    public int solution(int[] A) {
        return calculateOddOccurrencesInArray(A);
    }

    public int calculateOddOccurrencesInArray(int[] array) {
        // weird, but this is O(1), all are false by default
        boolean[] unpaired = new boolean[1000000000];

        for(int i = 0; i < array.length; i++) {
            unpaired[array[i]] = !unpaired[array[i]];
        }

        // weird, but this is O(1), just the unpaired value is true
        for(int k = 0; k <= 1000000000; k++) {
            if(unpaired[k]) {
                return k;
            }
        }

        throw new RuntimeException("Array not fulfill preconditions");
    }

}
