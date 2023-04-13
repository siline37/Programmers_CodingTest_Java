import java.util.*;

class Solution {
    public int solution(String before, String after) {
        //String을 배열로 형 변환하여 정렬하고 비교하기
        String array_before[] = before.split("");
        Arrays.sort(array_before);
        String array_after[] = after.split("");
        Arrays.sort(array_after);
        
        //배열이 같으면 1, 다르면 0
        int answer = 0;
        if(Arrays.equals(array_before, array_after)) {
            answer = 1;
        }
        return answer;
    }
}