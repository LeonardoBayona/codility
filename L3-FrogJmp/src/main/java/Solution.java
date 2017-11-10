
public class Solution {

    // Results:
    //

    // Source code with unit tests:
    // https://github.com/LeonardoBayona/codility/tree/master/L2-FrogJmp

    public int solution(int X, int Y, int D) {
        return calculateFrogJmp(X, Y, D);
    }

    public int calculateFrogJmp(int initialPosition, int targetPosition, int jumpDistance) {
        return new Double(Math.ceil(1.0 * (targetPosition - initialPosition) / jumpDistance)).intValue();
    }
}
