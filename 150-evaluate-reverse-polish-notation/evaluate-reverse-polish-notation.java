class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while (i < tokens.length) {
            String ch = tokens[i];
            if (ch.equals("+")) {
                s.push(s.pop() + s.pop());
            } else if (ch.equals("-")) {
                int b = s.pop(); // Second operand
                int a = s.pop(); // First operand
                s.push(a - b);
            } else if (ch.equals("*")) {
                s.push(s.pop() * s.pop());
            } else if (ch.equals("/")) {
                int b = s.pop(); // Second operand
                int a = s.pop(); // First operand
                s.push(a / b);
            } else {
                // s.push(Integer.parseInt(ch));
                s.push(Integer.valueOf(ch));
            }
            i++;
        }

        return s.pop();
    }
}
