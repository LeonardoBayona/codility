import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(new int[] { 3, 1, 2, 4, 3 }, 1);

    }

    private void testSolution(int[] array, int expected) {
        // given
        Solution solution = new Solution();

        // when
        int response = solution.calculatePermCheck(array);

        // then
        assertThat(response).isEqualTo(expected);
    }

}