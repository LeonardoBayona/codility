import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }, 6);

    }

    private void testSolution(int[] array, int expected) {
        // given
        Solution solution = new Solution();

        // when
        int response = solution.calculateFrogRiverOne(array);

        // then
        assertThat(response).isEqualTo(expected);
    }

}