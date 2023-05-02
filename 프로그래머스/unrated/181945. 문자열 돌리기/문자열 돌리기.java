import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int loop=0; loop<a.length(); loop++) {
            System.out.println(a.charAt(loop));
        }
    }
}