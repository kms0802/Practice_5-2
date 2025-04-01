import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.print("num1 입력 : ");
        num1 = scanner.nextInt();

        
        System.out.print("num2 입력 : ");
        num2 = scanner.nextInt();
        
        scanner.nextLine();
        System.out.print("연산자 입력 : ");
        String var = scanner.nextLine();
        double result = 0;
        if (var.equals("+")) {
            result =  num1 + num2;
        } else if (var.equals("-")) {
            result =  num1 - num2;
        } else if (var.equals("*")){
            result =  num1 * num2;
        } else if (var.equals("/")) {
            result =  num1 / num2;
        } else {
            System.out.println("잘못된 입력값입니다. ");
        }

        System.out.println("num1 " + var + " num2 " + " = " + result);
        
    }
}
