import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int alpha=65;
        int num=0;
        for (int i = 1; i <=5; i++) {
            for(int j=5; j>i;j--){
                System.out.print(" ");
            }
            for (int k = 0; k <2*i-1 ; k++) {
                System.out.print((char)(alpha+num++));
            }
            num=0;
            System.out.println();
        }
        for (int i = 1; i <=5 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int k = 2*(5 - i) - 1; k > 0; k--) {
                System.out.print((char)(alpha+num++));
            }
            num = 0;
            System.out.println();
        }
    }
}
