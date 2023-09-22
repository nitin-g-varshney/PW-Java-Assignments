import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        int len=sc.nextInt();
        System.out.println("Enter breadth:");
        int br=sc.nextInt();

        if(len==br){
            System.out.println("It is a square");
        }
        else{
            System.out.println("It is a rectangle");
        }
    }
}
