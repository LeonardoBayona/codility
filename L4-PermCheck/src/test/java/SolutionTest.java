import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(new int[] { 4, 1, 3, 2 }, true);
        testSolution(new int[] { 4, 1, 3 }, false);

    }

    private void testSolution(int[] array, boolean expected) {
        // given
        Solution solution = new Solution();

        // when
        boolean response = solution.calculatePermCheck(array);

        // then
        assertThat(response).isEqualTo(expected);
    }

}