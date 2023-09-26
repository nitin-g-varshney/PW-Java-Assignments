import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int sum=0;
        while(sc.hasNextInt()){
            int input=sc.nextInt();

            if (input>=0) {
                sum+=input;
            }
            else {
                sum=(-1);
                break;
            }

        }
        System.out.println(sum);
    }
}
