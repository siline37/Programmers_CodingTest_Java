class Solution {
    public int[] solution(long n) {
        //long > String > String 배열로 형 변환
        String number = Long.toString(n);
        String array_number[] = number.split("");
        
        //배열 요소를 int로 형 변환하여 int 배열에 담기
        int[] answer = new int[array_number.length];
        int index = 0;
        for(int loop=(array_number.length-1); loop>=0; loop--) {
            answer[index++] = Integer.parseInt(array_number[loop]);
        }
        return answer;
    }
}