public class Q5 {
    public static void main(String[] args) {
        int x = 65;
        int y = 80;

        int n = x ^ y;
        int count = 0;

        while (n != 0)
        {
            n = n & (n - 1);    // clear the least significant bit set
            count++;
        }
        System.out.println(count);
    }
}
