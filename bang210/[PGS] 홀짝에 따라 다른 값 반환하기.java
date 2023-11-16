import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return n % 2 == 1? IntStream.rangeClosed(1, n).filter(num -> num % 2 == 1).sum() : IntStream.rangeClosed(1, n).filter(num -> num % 2 == 0).map(num -> num * num).sum();
    }
}