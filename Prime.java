//requried libraries
import java.util.Scanner;
import java.lang.;
//start of class
class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//taking input
        int n = sc.nextInt();
        int c = 0;
//checking prime 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                c++;
            }
        }
//printing output
        if (c == 0) {
            System.out.println(n+" prime number");
        } else {
            System.out.println(n+" is not prime number");
        }
    }
}