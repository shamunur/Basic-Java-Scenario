import java.util.Scanner;

public class Spelling_Program_1_to_9 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int number;
        System.out.print("Enter the digit (1 to 9): ");
        number = Input.nextInt();
        if (number == 0){
            System.out.printf("You have pressed %d which spelling is Zero.",number);
        }
        else if (number == 1){
            System.out.printf("You have pressed %d which spelling is One.",number);
        }
        else if (number == 2){
            System.out.printf("You have pressed %d which spelling is Two.",number);
        }
        else if (number == 3){
            System.out.printf("You have pressed %d which spelling is Three.",number);
        }
        else if (number == 4){
            System.out.printf("You have pressed %d which spelling is Four.",number);
        }
        else if (number == 5){
            System.out.printf("You have pressed %d which spelling is Five.",number);
        }
        else if (number == 6){
            System.out.printf("You have pressed %d which spelling is Six.",number);
        }
        else if (number == 7){
            System.out.printf("You have pressed %d which spelling is Seven.",number);
        }
        else if (number == 8){
            System.out.printf("You have pressed %d which spelling is Eight.",number);
        }
        else if (number == 9){
            System.out.printf("You have pressed %d which spelling is Nine.",number);
        }
        else {
            System.out.println("Error.");
        }




    }
}
