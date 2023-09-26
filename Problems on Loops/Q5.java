public class Q5 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if(i==j||i+j==5-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
//                for (int k = 1; j <=5 ; j++) {
//                    if(j==i||j==5+1-i){
//                        System.out.print("*");
//                    }
            }
            System.out.println();
        }
    }
}
