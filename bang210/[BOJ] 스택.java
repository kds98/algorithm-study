import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{

        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < caseNum; i++) {
            String cmd = br.readLine();
            if (cmd.startsWith("push")) {
                String num = cmd.substring(5, cmd.length());
                stack.push(num);
            } else if (cmd.equals("pop")) {
                if (stack.size() > 0) {
                    answer.append(stack.pop());
                } else {
                    answer.append("-1");
                }
                answer.append("\n");
            } else if (cmd.equals("size")) {
                answer.append(stack.size()).append("\n");
            } else if (cmd.equals("empty")) {
                answer.append(stack.isEmpty()? 1 : 0).append("\n");
            } else if (cmd.equals("top")) {
                if (stack.size() > 0) {
                    answer.append(stack.peek());
                } else {
                    answer.append("-1");
                }
                answer.append("\n");
            }
        }
        System.out.println(answer);
    }
}