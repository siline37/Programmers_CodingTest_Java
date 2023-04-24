class Solution {
    public String solution(String my_string, int k) {
        StringBuilder builder_string = new StringBuilder();
        for(int i=0; i<k; i++) {
            builder_string.append(my_string);
        }
        String answer = builder_string.toString();
        return answer;
    }
}