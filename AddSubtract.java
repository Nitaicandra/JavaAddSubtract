import java.util.Scanner;

public class AddSubtract {

      public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Input num 1: ");
                int input = scanner.nextInt();

                System.out.print("Input num 2: ");
                int input2 = scanner.nextInt();

                System.out.print("Input Operation: \n1: Add \n2: Subtract\n");
                int operation = scanner.nextInt();
                int result = 0;
                if(operation==1){
                    result = input+input2;
                }
                else if(operation==2){
                    result = input-input2;
                }


                System.out.print("Result: "+result );

    }


}
