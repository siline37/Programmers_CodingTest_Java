class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        
        //p의 개수
        for(int loop=0; loop<s.length(); loop++) {
            if(s.charAt(loop)=='p'||s.charAt(loop)=='P') {
                pCount++;
            }
        }
        
        //y의 개수
        for(int loop=0; loop<s.length(); loop++) {
            if(s.charAt(loop)=='y'||s.charAt(loop)=='Y') {
                yCount++;
            }
        }
        
        boolean answer = (pCount==yCount) ? true : false;
        return answer;
    }
}