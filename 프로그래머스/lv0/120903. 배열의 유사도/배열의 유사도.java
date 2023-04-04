class Solution {
    public int solution(String[] s1, String[] s2) {        
        int answer = 0;
        for(int outloop=0; outloop<s1.length; outloop++) {
            for(int inloop=0; inloop<s2.length; inloop++) {
                if(s1[outloop].equals(s2[inloop])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}