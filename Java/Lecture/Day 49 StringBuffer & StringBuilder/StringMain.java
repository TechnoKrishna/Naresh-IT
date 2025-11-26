public class StringMain {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Data"); // mutable
        sb1.append("Base");
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("Data"); // mutable
        sb2.append("Base");
        System.out.println(sb2);

        String s3 = new String("Data"); // immutable
        s3.concat("Base");
        System.out.println(s3);

    }
}