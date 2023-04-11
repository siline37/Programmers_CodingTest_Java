import java.util.*;

class Solution {
    public String solution(String s) {
        char []array;
        if((s.length()%2) == 1) {
            array = new char[1];
            array[0] = s.charAt(s.length()/2);
        }else {
            array = new char[2];
            array[0] = s.charAt((s.length()/2) - 1);
            array[1] = s.charAt((s.length()/2));
        }
        
        String answer = String.valueOf(array);
        return answer;
    }
}