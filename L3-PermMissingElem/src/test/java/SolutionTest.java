import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test1() {
        testSolution(new int[] { 3, 8, 9, 7, 6 }, 3, new int[] { 9, 7, 6, 3, 8 });


    }

    private void testSolution(int[] array, int shift, int[] expected) {
        // given
        Solution solution = new Solution();

        // when
        int[] response = solution.calculatePermMissingElem(array, shift);

        // then
        assertThat(response).isEqualTo(expected);
    }

}