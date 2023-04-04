import java.util.*;

class Solution {
    public int solution(int age) {
        int answer = 0;
        Date date = new Date();
        int year = date.getYear() + 1900;
        answer = year - age;
        return answer;
    }
}