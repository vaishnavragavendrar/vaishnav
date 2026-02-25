import java.util.Scanner;
public class Palindrome {
    static boolean checkPalindrome(String text) {
        String cleaned = text.toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;}
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        if (checkPalindrome(input))
            System.out.println("It is a palindrome.");
        else
            System.out.println("It is not a palindrome.");
        sc.close();
    }
}
