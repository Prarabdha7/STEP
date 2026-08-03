import java.util.Scanner;
public class ProbM2{
    static boolean isPalindromeIterative(String text) {
        int i = 0;
        int j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1)
            return true;
        if (text.charAt(0) != text.charAt(text.length() - 1))
            return false;
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }
    static boolean isPalindromeArrayReversal(String text) {
        char[] arr = text.toCharArray();
        char temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        String reverse = "";
        for (int i = 0; i < arr.length; i++)
            reverse += arr[i];
        if (text.equals(reverse))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.print("Iterative: ");
        if (isPalindromeIterative(text))
            System.out.print("Palindrome");
        else
            System.out.print("Not Palindrome");
        System.out.print(" | Recursive: ");
        if (isPalindromeRecursive(text))
            System.out.print("Palindrome");
        else
            System.out.print("Not Palindrome");
        System.out.print(" | Array Reversal: ");
        if (isPalindromeArrayReversal(text))
            System.out.print("Palindrome");
        else
            System.out.print("Not Palindrome");
        sc.close();
    }
}