import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        
        //배열을 set로 변환해 포켓몬의 종류의 수를 구함
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        
        //얻을 수 있는 수와 종류의 수 중 더 작은 값을 반환
        return set.size() < nums.length / 2? set.size() : nums.length / 2;
    }
}