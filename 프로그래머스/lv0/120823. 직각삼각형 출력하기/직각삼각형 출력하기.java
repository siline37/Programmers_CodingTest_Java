import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int outloop=1; outloop<=n; outloop++) {
            for(int inloop=1; inloop<=outloop; inloop++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}