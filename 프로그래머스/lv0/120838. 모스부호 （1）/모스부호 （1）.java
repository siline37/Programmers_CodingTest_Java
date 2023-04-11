import java.util.*;

class Solution {    
    public String solution(String letter) {
        //모스부호
        String [][]morse = {
            {".-", "a"}, {"-...", "b"}, {"-.-.", "c"}, {"-..", "d"}, 
            {".", "e"}, {"..-.", "f"}, {"--.", "g"}, {"....", "h"}, 
            {"..", "i"}, {".---", "j"}, {"-.-", "k"}, {".-..", "l"}, 
            {"--", "m"}, {"-.", "n"}, {"---", "o"}, {".--.", "p"}, 
            {"--.-", "q"}, {".-.", "r"}, {"...", "s"}, {"-", "t"}, 
            {"..-", "u"}, {"...-", "v"}, {".--", "w"}, {"-..-", "x"}, 
            {"-.--", "y"}, {"--..", "z"}
        };
        
        //String을 String 배열로 형 변환
        String list[] = letter.split(" ");
        for(int outloop=0; outloop<list.length; outloop++) {
            for(int inloop=0; inloop<morse.length; inloop++) {
                if(list[outloop].equals(morse[inloop][0])) {
                    list[outloop] = morse[inloop][1];
                }
            }            
        }
        
        //String 배열을 String으로 형 변환
        String answer = String.join("", list);
        return answer;
    }
}