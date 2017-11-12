import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 }, new int[] { 3, 2, 2, 4, 2 });


    }

    private void testSolution(int numCounters, int[] operations, int[] expected) {
        // given
        Solution solution = new Solution();

        // when
        int[] response = solution.calculateMaxCounters(numCounters, operations);

        // then
        assertThat(response).isEqualTo(expected);
    }

}
