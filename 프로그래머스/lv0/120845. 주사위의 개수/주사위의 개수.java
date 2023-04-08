class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int cubeWidth = box[0] / n;
        int cubeLength = box[1] / n;
        int cubeHeight = box[2] / n;
        answer = cubeWidth * cubeLength * cubeHeight;
        return answer;
    }
}