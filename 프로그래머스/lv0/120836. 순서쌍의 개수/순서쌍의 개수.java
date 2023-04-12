class Solution {
    public int solution(int n) {
        int count = 0;      //약수의 개수        
        for(int loop=1; loop<=n; loop++) {
            if((n%loop) == 0) {
                count++;                
            }            
        }
        int submultiple[] = new int[count];
        
        int index = 0;
        for(int loop=1; loop<=n; loop++) {
            if((n%loop) == 0) {
                submultiple[index++] = loop;
            }            
        }
        
        int answer = submultiple.length;
        return answer;
    }
}