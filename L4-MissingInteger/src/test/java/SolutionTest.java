import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(new int[] { 1, 3, 6, 4, 1, 2 }, 5);
        testSolution(new int[] { 1, 2, 3 }, 4);
        testSolution(new int[] { -1, -3 }, 1);

        testSolution(new int[] { -1 }, 1);
        testSolution(new int[] { 0 }, 1);
        testSolution(new int[] { 1 }, 2);
        testSolution(new int[] { 2 }, 1);

        testSolution(new int[] { 1, 2 }, 3);
        testSolution(new int[] { 1, 3 }, 2);
        testSolution(new int[] { 2, 3 }, 1);

        testSolution(new int[] { 1, 2, 3 }, 4);
        testSolution(new int[] { -1, 2, 3 }, 1);
        testSolution(new int[] { 1, -2, 3 }, 2);
        testSolution(new int[] { 1, 2, -3 }, 3);

        testSolution(new int[] { 1, 3, 5, 4, 1, 2 }, 6);
        testSolution(new int[] { 1, 3, 5, 4, 1, -2 }, 2);
    }

    private void testSolution(int[] array, int expected) {
        // given
        Solution solution = new Solution();

        // when
        int response = solution.calculateMissingInteger(array);

        // then
        assertThat(response).isEqualTo(expected);
    }

}