class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int outloop=0; outloop<my_string.length(); outloop++) {
            for(int inloop=0; inloop<n; inloop++) {
                answer += my_string.charAt(outloop);
            }            
        }
        return answer;
    }
}