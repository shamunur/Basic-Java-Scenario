import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int phonePrice = 1800;
        int number_of_installment, installment_per_month;

        System.out.print("Number of Installment: ");
        number_of_installment = Input.nextInt();
        System.out.printf("You have chosen %d months Installments.\n",number_of_installment);

        installment_per_month = phonePrice / number_of_installment;
        System.out.println("Monthly Installment Amount: "+installment_per_month+"euros");
    }
}