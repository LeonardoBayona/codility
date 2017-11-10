import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(10, 85, 30, 3);

        testSolution(10, 10, 30, 0);
        testSolution(10, 11, 30, 1);
        testSolution(10, 39, 30, 1);
        testSolution(10, 40, 30, 1);
        testSolution(10, 41, 30, 2);
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