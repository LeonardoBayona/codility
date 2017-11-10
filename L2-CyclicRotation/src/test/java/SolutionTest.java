import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(new int[] { 3, 8, 9, 7, 6 }, 3, new int[] { 9, 7, 6, 3, 8 });
        testSolution(new int[] { 0, 0, 0 }, 1, new int[] { 0, 0, 0 });
        testSolution(new int[] { 1, 2, 3, 4 }, 4, new int[] { 1, 2, 3, 4 });

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