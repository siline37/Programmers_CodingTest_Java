class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        //조건문 안의 조건을 n/2==0으로 할 경우, n이 2의 배수인 경우에 문제가 발생할 수 있음
        //예를 들어, n=2인 경우 배열 answer를 초기화할 때 크기가 0이 되므로 반복문을 실행하지 않고 그대로 빈 배열을 반환하게 됨
        //따라서 조건문 안의 조건을 n%2==0으로 해야 함
        if(n%2==0) {
            answer = new int[n/2];
        }else {
            answer = new int[(n/2)+1];
        }
        int i = 0;
        for(int loop=1; loop<=n; loop++) {
            if(loop%2==1){
                answer[i++] = loop;
            }
        }
        return answer;
    }
}