import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,r;
        while(num>0){
            r=num%10;
            sum+=r;
            num/=10;

        }
        System.out.println(sum);
    }
}
