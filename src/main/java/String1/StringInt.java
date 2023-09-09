package String1;

import java.util.Stack;

public class StringInt {

    public int calculateFromString(String s) {
        int currNo = 0;
        char op = '+';
        int length = s.length();
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                currNo = (currNo * 10) + (ch - '0');
            }
            if (!Character.isDigit(ch) && ch != ' ' || i == length -1) {
                if (op == '+') {
                    stack.push(currNo);
                } else if (op == '-') {
                    stack.push(-currNo);
                } else if (op == '*') {
                    stack.push(stack.pop() + currNo);
                } else if (op== '/') {
                    stack.push(stack.pop() / currNo);
                }
                currNo =0;
                op = ch;
            }
        }
        int sum =0;
        while (!stack.isEmpty()) {
            sum+= stack.pop();
        }
        System.out.println(sum);
        return sum;

    }
}
