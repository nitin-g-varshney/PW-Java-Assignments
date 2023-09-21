import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        num2+=num1;
        num1=num2-num1;
        num2=num2-num1;

        System.out.print(num1+" "+num2);


    }
}
