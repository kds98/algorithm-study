public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            answer[i] = scanner.nextInt();
        }

        Arrays.stream(answer)
                .map(n -> -n)
                .sorted()
                .map(n -> -n)
                .forEach(n -> sb.append(n).append("\n"));
        System.out.println(sb);
    }
}