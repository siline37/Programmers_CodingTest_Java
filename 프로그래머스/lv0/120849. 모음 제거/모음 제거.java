class Solution {
    public String solution(String my_string) {
        //모음
        String []vowels = {"a","e","i","o","u"};
        
        //String을 String 배열로 형 변환
        String list[] = my_string.split("");
        for(int outloop=0; outloop<list.length; outloop++) {
            for(int inloop=0; inloop<vowels.length; inloop++) {
                if(list[outloop].equals(vowels[inloop])) {
                    list[outloop] = "";
                }
            }            
        }
        
        //String 배열을 String으로 형 변환
        String answer = String.join("", list);
        return answer;
    }
}