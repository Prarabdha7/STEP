import java.util.Scanner;

public class Prob4 {
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;
        int highest = sectionA[0];
        int index = 0;
        String section = "Section A";
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                index = i;
                section = "Section A";
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                index = i;
                section = "Section B";
            }
        }
        System.out.print("Section A Total: " + totalA);
        System.out.print(" | Section B Total: " + totalB);
        if (totalA == totalB)
            System.out.print(" | Status: Balanced");
        else
            System.out.print(" | Status: Not Balanced");
        System.out.println(" | Highest Quantity: " + highest + " (" + section + ", Item " + (index + 1) + ")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int[] sectionA = new int[n];
        int[] sectionB = new int[n];
        System.out.println("Enter quantities for Section A:");
        for (int i = 0; i < n; i++)
            sectionA[i] = sc.nextInt();
        System.out.println("Enter quantities for Section B:");
        for (int i = 0; i < n; i++)
            sectionB[i] = sc.nextInt();
        analyzeInventory(sectionA, sectionB);
        sc.close();
    }
}