public class Palindrome {
    public static void main(String[] args) {

        int no = Integer.parseInt(args[0]);
        int rev = 0;

        rev = (rev * 10) + (no % 10);
        no = no / 10;
        rev = (rev * 10) + (no % 10);
        no = no / 10;
        rev = (rev * 10) + (no % 10);
        no = no / 10;

        if (rev == no) {
            System.err.println("is An Palindrome: " + rev);
        } else {
            System.out.println("is Not An Palindrome: " + rev);
        }

    }
}
