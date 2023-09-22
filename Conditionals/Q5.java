import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter both the integers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println("Enter thw operation");
        char exp=sc.next().charAt(0);

        switch(exp){
            case '+':
                System.out.println("Addition: "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case '*':
                System.out.println("Product: "+(num1*num2));
                break;
            case '/':
                System.out.println("Addition: "+(num1/num2));
                break;
            default:
                System.out.println("Invalid Operation\n Please choose from (+,-,*,/)");
        }
    }
}
