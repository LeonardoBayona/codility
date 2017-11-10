import java.util.BitSet;
import java.util.HashSet;

public class Solution {

    // Source code with unit tests:
    // https://github.com/LeonardoBayona/codility/tree/master/L2-OddOccurrencesInArray

    // Results:
    // https://codility.com/demo/results/trainingPAXQZU-X3C/

    public int solution(int[] A) {
        return calculateOddOccurrencesInArray(A);
    }

    public int calculateOddOccurrencesInArray(int[] array) {

        // Let AP : paired values of A
        // Let Sum(AP) : (Sum : 0 <= i < N/2 : AP[i])
        // Let UnPaired(AP) : unique unpaired value of A
        // Let Sum(A) : (Sum : 0 <= i < N : A[i])
        // Sum(A) = 2 * Sum(AP) + UnPaired(AP)
        //
        // Sum(A) % 2 = Unpaired(AP) % 2
        //
        // Xor(A) = Xor(Xor(AP, AP), UnPaired(AP))
        // Xor(AP, AP) = 0
        // Xor(A) = UnPaired(AP)

        int xor = 0;
        for(int i = 0; i < array.length; i++) {
            xor ^= array[i];
        }
        return xor;
    }

    public int calculateOddOccurrencesInArray4(int[] array) {
        HashSet<Integer> unpaired = new HashSet<>();

        for(int i = 0; i < array.length; i++) {
            if(!unpaired.add(array[i])) {
                unpaired.remove(array[i]);
            }
        }

        return unpaired.stream().findFirst().get();
    }

    public int calculateOddOccurrencesInArray3(int[] array) {
        BitSet unpaired = new BitSet(1000000000);

        for(int i = 0; i < array.length; i++) {
            unpaired.set(array[i], !unpaired.get(array[i]));
        }

        for(int k = 0; k <= 1000000000; k++) {
            if(unpaired.get(k)) {
                return k;
            }
        }

        throw new RuntimeException("Array not fulfill preconditions");
    }

    private int calculateOddOccurrencesInArray2(int[] array) {
        boolean[] unpaired = new boolean[1000000000];

        for(int i = 0; i < array.length; i++) {
            unpaired[array[i]] = !unpaired[array[i]];
        }

        for(int k = 0; k <= 1000000000; k++) {
            if(unpaired[k]) {
                return k;
            }
        }

        throw new RuntimeException("Array not fulfill preconditions");
    }

}
