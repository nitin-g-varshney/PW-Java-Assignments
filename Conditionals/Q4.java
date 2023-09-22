import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num=sc.nextInt();

        if(num<0){
            System.out.println("The number is negative and skipped");
        }
        else {
            System.out.println("Positive number is: "+num);
        }
    }
}
