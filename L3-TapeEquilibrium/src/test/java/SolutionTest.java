import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(new int[] { 3, 1, 2, 4, 3 }, 1);

        testSolution(new int[] { -6, 19, 40, -88, 80, -88, -62, -30, -15, -61, 58 }, 57);

        testSolution(new int[] { 1, 2 }, 1);
    }

    private void testSolution(int[] array, int expected) {
        // given
        Solution solution = new Solution();

        // when
        int response = solution.calculateTapeEquilibrium(array);

        // then
        assertThat(response).isEqualTo(expected);
    }

}