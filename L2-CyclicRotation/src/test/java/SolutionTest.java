import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(new int[] { 3, 8, 9, 7, 6 }, 3, new int[] { 9, 7, 6, 3, 8 });
        testSolution(new int[] { 0, 0, 0 }, 1, new int[] { 0, 0, 0 });
        testSolution(new int[] { 1, 2, 3, 4 }, 4, new int[] { 1, 2, 3, 4 });

        testSolution(new int[] { }, 0, new int[] { });
        testSolution(new int[] { }, 1, new int[] { });
        testSolution(new int[] { }, 5, new int[] { });

        testSolution(new int[] { 1 }, 0, new int[] { 1 });
        testSolution(new int[] { 1 }, 1, new int[] { 1 });
        testSolution(new int[] { 1 }, 5, new int[] { 1 });

        testSolution(new int[] { 1, 2 }, 0, new int[] { 1, 2 });
        testSolution(new int[] { 1, 2 }, 1, new int[] { 2, 1 });
        testSolution(new int[] { 1, 2 }, 2, new int[] { 1, 2 });
        testSolution(new int[] { 1, 2 }, 3, new int[] { 2, 1 });
        testSolution(new int[] { 1, 2 }, 4, new int[] { 1, 2 });
        testSolution(new int[] { 1, 2 }, 5, new int[] { 2, 1 });
        testSolution(new int[] { 1, 2 }, 6, new int[] { 1, 2 });

        testSolution(new int[] { 1, 2, 3 }, 0, new int[] { 1, 2, 3 });
        testSolution(new int[] { 1, 2, 3 }, 1, new int[] { 3, 1, 2 });
        testSolution(new int[] { 1, 2, 3 }, 2, new int[] { 2, 3, 1 });
        testSolution(new int[] { 1, 2, 3 }, 3, new int[] { 1, 2, 3 });
        testSolution(new int[] { 1, 2, 3 }, 4, new int[] { 3, 1, 2 });
        testSolution(new int[] { 1, 2, 3 }, 5, new int[] { 2, 3, 1 });
        testSolution(new int[] { 1, 2, 3 }, 6, new int[] { 1, 2, 3 });

        testSolution(new int[] { 1, 2, 3, 4 }, 0, new int[] { 1, 2, 3, 4 });
        testSolution(new int[] { 1, 2, 3, 4 }, 1, new int[] { 4, 1, 2, 3 });
        testSolution(new int[] { 1, 2, 3, 4 }, 2, new int[] { 3, 4, 1, 2 });
        testSolution(new int[] { 1, 2, 3, 4 }, 3, new int[] { 2, 3, 4, 1 });
        testSolution(new int[] { 1, 2, 3, 4 }, 4, new int[] { 1, 2, 3, 4 });
        testSolution(new int[] { 1, 2, 3, 4 }, 5, new int[] { 4, 1, 2, 3 });
        testSolution(new int[] { 1, 2, 3, 4 }, 6, new int[] { 3, 4, 1, 2 });
        testSolution(new int[] { 1, 2, 3, 4 }, 7, new int[] { 2, 3, 4, 1 });

        testSolution(new int[] { 1, 2, 3, 4, 5 }, 0, new int[] { 1, 2, 3, 4, 5 });
        testSolution(new int[] { 1, 2, 3, 4, 5 }, 1, new int[] { 5, 1, 2, 3, 4 });
        testSolution(new int[] { 1, 2, 3, 4, 5 }, 2, new int[] { 4, 5, 1, 2, 3 });
        testSolution(new int[] { 1, 2, 3, 4, 5 }, 3, new int[] { 3, 4, 5, 1, 2 });
        testSolution(new int[] { 1, 2, 3, 4, 5 }, 4, new int[] { 2, 3, 4, 5, 1 });
        testSolution(new int[] { 1, 2, 3, 4, 5 }, 5, new int[] { 1, 2, 3, 4, 5 });
        testSolution(new int[] { 1, 2, 3, 4, 5 }, 6, new int[] { 5, 1, 2, 3, 4 });
        testSolution(new int[] { 1, 2, 3, 4, 5 }, 7, new int[] { 4, 5, 1, 2, 3 });
        testSolution(new int[] { 1, 2, 3, 4, 5 }, 8, new int[] { 3, 4, 5, 1, 2 });
        testSolution(new int[] { 1, 2, 3, 4, 5 }, 9, new int[] { 2, 3, 4, 5, 1 });

        testSolution(new int[] { 1, 2, 3, 4, 5, 6 }, 10, new int[] { 3, 4, 5, 6, 1, 2 });
        testSolution(new int[] { -1, -2, -3, -4, -5, -6 }, 10, new int[] { -3, -4, -5, -6, -1, -2 });
    }

    private void testSolution(int[] array, int shift, int[] expected) {
        // given
        Solution solution = new Solution();

        // when
        int[] response = solution.calculateCyclicRotation(array, shift);

        // then
        assertThat(response).isEqualTo(expected);
    }

}