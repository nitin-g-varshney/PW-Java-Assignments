import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String fname;
        fname = sc.next();
        String lname=sc.next();
        int roll=sc.nextInt();
        String foi;
        foi = sc.nextLine();

        System.out.println("Name: "+fname+" "+lname);
        System.out.println("Roll Number: "+roll);
        System.out.println("Field of interest: "+foi);
    }
}
