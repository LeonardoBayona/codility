import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 }, new int[] { 3, 2, 2, 4, 2 });

        testSolution(1, new int[] { 1 }, new int[] { 1 });
        testSolution(1, new int[] { 2 }, new int[] { 0 });

        testSolution(1, new int[] { 1, 1 }, new int[] { 2 });
        testSolution(1, new int[] { 2, 1 }, new int[] { 1 });
        testSolution(1, new int[] { 1, 2 }, new int[] { 1 });
        testSolution(1, new int[] { 2, 2 }, new int[] { 0 });

        testSolution(1, new int[] { 1, 1, 1 }, new int[] { 3 });
        testSolution(1, new int[] { 2, 1, 1 }, new int[] { 2 });
        testSolution(1, new int[] { 1, 2, 2 }, new int[] { 1 });
        testSolution(1, new int[] { 2, 2, 2 }, new int[] { 0 });




        testSolution(2, new int[] { 1 }, new int[] { 1, 0 });
        testSolution(2, new int[] { 2 }, new int[] { 0, 1 });
        testSolution(2, new int[] { 3 }, new int[] { 0, 0 });

        testSolution(3, new int[] { 1 }, new int[] { 1, 0, 0 });
        testSolution(3, new int[] { 2 }, new int[] { 0, 1, 0 });
        testSolution(3, new int[] { 3 }, new int[] { 0, 0, 1 });
        testSolution(3, new int[] { 4 }, new int[] { 0, 0, 0 });


        testSolution(5, new int[] { 3, 4, 4, 6, 1, 4, 1 }, new int[] { 4, 2, 2, 3, 2 });
        testSolution(5, new int[] { 3, 4, 4, 6, 1, 4, 6 }, new int[] { 3, 3, 3, 3, 3 });

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
