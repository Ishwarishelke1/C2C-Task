import java.util.Stack;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty() &&
                    asteroid < 0 &&
                    stack.peek() > 0) {

                if (stack.peek() < -asteroid) {

                    stack.pop();

                } else if (stack.peek() == -asteroid) {

                    stack.pop();
                    destroyed = true;
                    break;

                } else {

                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] ans = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] asteroids = {10, 2, -5};

        int[] ans = asteroidCollision(asteroids);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}