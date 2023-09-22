import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price");
        int cp=sc.nextInt();
        System.out.println("Enter selling price");
        int sp=sc.nextInt();

        int profit=sp-cp;
        int loss=cp-sp;

        if(sp>cp)
            System.out.println("profit= "+profit);
        else
            System.out.println("loss= "+loss);

    }
}
