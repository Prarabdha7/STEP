import java.util.Scanner;
public class Prob2 {
    static void checkTypingAccuracy(String original, String typed) {
        int pos = 0;
        int count = 0;
        float percentage;
        for (int i = 0; i <original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                count++;
            } else {
                pos = i + 1;
                break;
            }
        }
        percentage = (float) count / original.length() * 100;
        System.out.println("Matched: " + count + "/" + original.length());
        System.out.println("Accuracy: " + percentage + "%");
        if(pos == 0){
            System.out.println("No mistakes");
        }
        else{
            System.out.println("First mismatch at position: " + pos+ " (Original: '" + original.charAt(pos-1) + "', Typed: '" + typed.charAt(pos-1) + "')");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String original = sc.nextLine();
            System.out.print("Enter the typed string: ");
            String typed = sc.nextLine();
            checkTypingAccuracy(original, typed);
            sc.close();
}
    }
