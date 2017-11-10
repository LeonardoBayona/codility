import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(new int[] { 3, 8, 9, 7, 6 }, 3, new int[] { 9, 7, 6, 3, 8 });
        testSolution(new int[] { 0, 0, 0 }, 1, new int[] { 0, 0, 0 });
        testSolution(new int[] { 1, 2, 3, 4 }, 4, new int[] { 1, 2, 3, 4 });

        testSolution(new int[] { }, 0, new int[] { });
        testSolution(new int[] { }, 1, new int[] { });
        testSolution(new int[] { }, 5, new int[] { });

        testSolution(new int[] { 1 }, 0, new int[] { 1 });
        testSolution(new int[] { 1 }, 1, new int[] { 1 });
        testSolution(new int[] { 1 }, 5, new int[] { 1 });

        testSolution(new int[] { 1, 2 }, 0, new int[] { 1, 2 });
        testSolution(new int[] { 1, 2 }, 1, new int[] { 2, 1 });
        testSolution(new int[] { 1, 2 }, 2, new int[] { 1, 2 });
    }

    private void testSolution(int[] array, int shift, int[] expected) {
        // given
        Solution solution = new Solution();

        // when
        int[] response = solution.calculateCyclicRotation(array, shift);

        // then
        assertThat(response).isEqualTo(expected);
    }

}