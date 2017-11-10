import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(new int[] {9,3,9,3,9,7,9}, 7);

        testSolution(new int[] {9}, 9);
        testSolution(new int[] {9,3,9}, 3);
        testSolution(new int[] {9,3,9,3,9}, 9);
        testSolution(new int[] {8,3,9,3,9}, 8);
    }

    private void testSolution(int[] array, int expected) {
        // given
        Solution solution = new Solution();

        // when
        int response1 = solution.calculateOddOccurrencesInArray(array);

        // then
        assertThat(response1).isEqualTo(expected);
    }

}