import java.util.Scanner;

public class Checking_Even_or_Odd {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int number;
        System.out.print("Enter any integer number: ");
        number = Input.nextInt();
        if (number %2 == 0){
            System.out.printf("This %d number is even.\n",number);
        }
        else{
            System.out.printf("This %d number is odd.",number);
        }
    }
}
