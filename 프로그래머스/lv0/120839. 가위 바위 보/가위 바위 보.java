class Solution {
    public String solution(String rsp) {
        String arr_rsp[] = rsp.split("");
        for(int loop=0; loop<arr_rsp.length; loop++) {
            if(arr_rsp[loop].equals("2")) {
                arr_rsp[loop] = "0";
            }else if(arr_rsp[loop].equals("0")) {
                arr_rsp[loop] = "5";
            }else if(arr_rsp[loop].equals("5")) {
                arr_rsp[loop] = "2";
            }
        }
        String answer = String.join("", arr_rsp);
        return answer;
    }
}