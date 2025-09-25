public class Test7 {
    public static void main(String[] args) {
        int ch1 = '\u0000'; // 0
        System.out.println(ch1);

        int ch2 = '\uffff'; // 65535
        System.out.println(ch2);

        char ch3 = '\u0041'; // A
        System.out.println(ch3);

        char ch4 = '\u0061'; // a
        System.out.println(ch4);
    }
}