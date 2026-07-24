import java.util.Stack;

public class BaseballGame {

    public static int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {

            if (op.equals("+")) {

                int first = stack.pop();
                int second = stack.peek();

                stack.push(first);
                stack.push(first + second);

            }
            else if (op.equals("D")) {

                stack.push(2 * stack.peek());

            }
            else if (op.equals("C")) {

                stack.pop();

            }
            else {

                stack.push(Integer.parseInt(op));

            }
        }

        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }

    public static void main(String[] args) {

        String[] ops = {"5","2","C","D","+"};

        System.out.println(calPoints(ops));
    }
}