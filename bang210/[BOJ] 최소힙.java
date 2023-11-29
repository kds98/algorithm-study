import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException{

        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < caseNum; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                answer.append(heap.isEmpty()? 0 : heap.poll()).append("\n");
            } else {
                heap.add(input);
            }
        }
        System.out.print(answer);
    }