import java.util.BitSet;

public class Solution {

    // Source code with unit tests:
    // https://github.com/LeonardoBayona/codility/tree/master/L2-OddOccurrencesInArray

    // Results:

    public int solution(int[] A) {
        return calculateOddOccurrencesInArray(A);
    }

    public int calculateOddOccurrencesInArray(int[] array) {
        // weird, but this is O(1), all are false by default
        BitSet unpaired = new BitSet(1000000000);

        for(int i = 0; i < array.length; i++) {
            unpaired.set(array[i], !unpaired.get(array[i]));
        }

        // weird, but this is O(1), just the unpaired value is true
        for(int k = 0; k <= 1000000000; k++) {
            if(unpaired.get(k)) {
                return k;
            }
        }

        throw new RuntimeException("Array not fulfill preconditions");
    }

    private int calculateOddOccurrencesInArray2(int[] array) {
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
