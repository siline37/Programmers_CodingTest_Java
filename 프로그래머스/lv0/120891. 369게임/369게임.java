class Solution {
    public int solution(int order) {
        //int를 String으로 형 변환
        String num = Integer.toString(order);
        
        int answer = 0;
        for(int loop=0; loop<num.length(); loop++) {
            if(num.charAt(loop)=='3'||num.charAt(loop)=='6'||num.charAt(loop)=='9') {
                answer++;
            }
        }
        return answer;
    }
}