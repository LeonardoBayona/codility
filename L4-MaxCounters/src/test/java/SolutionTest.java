import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(3, new int[] { 3, 8, 9, 7, 6 }, new int[] { 9, 7, 6, 3, 8 });


    }

    private void testSolution(int shift, int[] array, int[] expected) {
        // given
        Solution solution = new Solution();

        // when
        int[] response = solution.calculateMaxCounters(shift, array);

        // then
        assertThat(response).isEqualTo(expected);
    }

}
