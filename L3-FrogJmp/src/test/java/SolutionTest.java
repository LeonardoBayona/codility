import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(10, 85, 30, 3);
    }

    private void testSolution(int initialPosition, int targetPosition, int jumpDistance, int expected) {
        // given
        Solution solution = new Solution();

        // when
        int response = solution.calculateFrogJmp(initialPosition, targetPosition, jumpDistance);

        // then
        assertThat(response).isEqualTo(expected);
    }

}