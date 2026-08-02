public class Prob1 {
    public static void main(String[] args){
        int[] seatNumber = {101,102,103,104,105,105,106};
        boolean isDuplicate = false;
        for(int i=0; i<seatNumber.length; i++){
            for(int j=i+1; j<seatNumber.length; j++){
                if(seatNumber[i] == seatNumber[j]){
                    System.out.println("Duplicate seat number found: " + seatNumber[i]);
                    isDuplicate = true;
                    break;
                }
            }
        }
        if(!isDuplicate){
            System.out.println("No duplicate seat numbers found.");
        }
    }
}
