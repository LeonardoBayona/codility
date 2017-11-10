import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(new int[] { 2, 3, 4, 5 }, 1);
    }

    private void testSolution(int[] array, int expected) {
        // given
        Solution solution = new Solution();

        // when
        int response = solution.calculateFrogJmp(array);

        // then
        assertThat(response).isEqualTo(expected);
    }

}