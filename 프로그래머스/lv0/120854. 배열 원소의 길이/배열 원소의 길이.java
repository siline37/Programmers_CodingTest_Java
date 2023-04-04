class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int loop=0; loop<strlist.length; loop++) {
            answer[loop] = strlist[loop].length();
        }
        return answer;
    }
}