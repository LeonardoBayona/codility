import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }, 6);

        testSolution(2, new int[] { 1 }, -1);
        testSolution(1, new int[] { 1 }, 0);

        testSolution(2, new int[] { 1, 1 }, -1);
        testSolution(2, new int[] { 2, 1 }, 1);
        testSolution(2, new int[] { 1, 1, 2 }, 2);
        testSolution(3, new int[] { 2, 1 }, -1);

        testSolution(3, new int[] { 1, 1, 2 }, -1);
        testSolution(2, new int[] { 2, 1, 3 }, 1);
        testSolution(3, new int[] { 2, 1, 3 }, 2);
        testSolution(2, new int[] { 1, 1, 2 }, 2);
        testSolution(3, new int[] { 2, 1, 2 }, -1);

        testSolution(6, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }, -1);
        testSolution(4, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }, 4);
        testSolution(3, new int[] { 1, 3, 1, 3, 2, 3, 3, 3 }, 4);
        testSolution(2, new int[] { 1, 3, 1, 2, 2, 3, 2, 2 }, 3);
        testSolution(1, new int[] { 1, 1, 1, 1, 1, 1, 1, 1 }, 0);
    }

    private void testSolution(int targetPosition, int[] array, int expected) {
        // given
        Solution solution = new Solution();

        // when
        int response = solution.calculateFrogRiverOne(targetPosition, array);

        // then
        assertThat(response).isEqualTo(expected);
    }

}