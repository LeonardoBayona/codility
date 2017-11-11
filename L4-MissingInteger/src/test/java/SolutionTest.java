import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(new int[] { 1, 3, 6, 4, 1, 2 }, 5);
        testSolution(new int[] { 1, 2, 3 }, 4);
        testSolution(new int[] { -1, -3 }, 1);

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