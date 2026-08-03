import java.util.Scanner;
public class Prob3 {
    static void findLongestStreak(String signalLog){
        int currentStreak = 1;
        int maxStreak = 1;
        char maxChar = signalLog.charAt(0);
        for(int i=1; i<signalLog.length(); i++){
            if(signalLog.charAt(i) == signalLog.charAt(i-1)){
                currentStreak++;
            }
            else{
                if(currentStreak > maxStreak){
                    maxStreak = currentStreak;
                    maxChar = signalLog.charAt(i-1);
                }
                currentStreak = 1;
            }
    }
    System.out.println("Longest streak: " + maxChar + " repeated " + maxStreak + " times.");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the signal log: ");
        String signalLog = sc.nextLine();
        findLongestStreak(signalLog);
        sc.close();
    }
}