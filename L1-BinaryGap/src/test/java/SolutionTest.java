import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(0b1001, 2);
        testSolution(0b1000010001, 4);
        testSolution(0b10100, 1);
        testSolution(0b1111, 0);

        testSolution(0b0, 0);

        testSolution(0b10, 0);
        testSolution(0b1000, 0);
        testSolution(0b1, 0);

        testSolution(0b11, 0);
        testSolution(0b101, 1);
        testSolution(0b1000001, 5);

        testSolution(0b101000, 1);
        testSolution(0b1000001000, 5);

        testSolution(0b10100000001, 7);
        testSolution(0b100000100000001, 7);

        testSolution(0b100000000010100000001, 9);
        testSolution(0b1000000000100000100000001, 9);

        testSolution(0b1000100000000010100000001, 9);
        testSolution(0b10001000000000100000100000001, 9);
    }

    private void testSolution(int number, int expected) {
        // given
        Solution solution = new Solution();

        // when
        int response = solution.calculateBinaryGap(number);

        // then
        assertThat(response).isEqualTo(expected);
    }

}