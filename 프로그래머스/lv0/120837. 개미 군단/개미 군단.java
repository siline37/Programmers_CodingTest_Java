class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = hp/5;
        int soldier = (hp%5) / 3;
        int worker = hp - (5*general) - (3*soldier);
        answer = general + soldier + worker;
        return answer;
    }
}