import java.util.*;

class Solution {
    public long solution(long n) {
        //long을 String으로 형 변환
        String number = Long.toString(n);
        
        //배열로 형 변환하여 내림차순 정렬
        String sortNumber[] = new String[number.length()];
        sortNumber = number.split("");
        Arrays.sort(sortNumber, Collections.reverseOrder());
        
        //String 배열 > String > long으로 형 변환
        number = String.join("", sortNumber);
        long answer = Long.parseLong(number);
        return answer;
    }
}