class Solution {
    public int solution(int n, String control) {
        String arr_control[] = control.split("");
        for(int loop=0; loop<arr_control.length; loop++) {
            if(arr_control[loop].equals("w")) {
                n++;
            }else if(arr_control[loop].equals("s")) {
                n--;
            }else if(arr_control[loop].equals("d")) {
                n = n + 10;
            }else if(arr_control[loop].equals("a")) {
                n = n - 10;
            }
        }
        int answer = n;
        return answer;
    }
}