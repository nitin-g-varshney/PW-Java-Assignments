import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();

        int marks=sub1+sub2+sub3;
        double percentage=(marks/300.0)*100;

        System.out.println("Total marks: "+marks);
        System.out.println("Percentage marks: "+(int)percentage+"%");
    }
}
