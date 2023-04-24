import java.util.Scanner;

class numReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no.:");
        int n = sc.nextInt();
        int num = n;
        int rev = 0;

        while (n > 0) {

            int digit;

            digit = n % 10;
            rev = rev * 10 + digit;

            n = n / 10;

        }
        System.out.println();
        System.out.println(num);
        System.out.println(rev);

    }

}
