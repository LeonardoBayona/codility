import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(new int[] { 2, 3, 4, 5 }, 1);
        testSolution(new int[] { 4, 3, 1, 5 }, 2);
        testSolution(new int[] { 2, 4, 1, 5 }, 3);
        testSolution(new int[] { 2, 3, 1, 5 }, 4);
        testSolution(new int[] { 2, 3, 1, 4 }, 5);

        testSolution(new int[] { }, 1);

        testSolution(new int[] { 1 }, 2);
        testSolution(new int[] { 2 }, 1);

        testSolution(new int[] { 1, 2 }, 3);
        testSolution(new int[] { 1, 3 }, 2);
        testSolution(new int[] { 3, 2 }, 1);

        testSolution(new int[] { 1, 2, 3 }, 4);
        testSolution(new int[] { 1, 2, 4 }, 3);
        testSolution(new int[] { 1, 3, 4 }, 2);
        testSolution(new int[] { 3, 2, 4 }, 1);
    }

    private void testSolution(int[] array, int expected) {
        // given
        Solution solution = new Solution();

        // when
        int response = solution.calculatePermMissingElem(array);

        // then
        assertThat(response).isEqualTo(expected);
    }

}