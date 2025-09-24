public class ConcatStrings {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (String string : args) {
            sb.append(string).append(" ");
        }

        System.out.println("Concatenated String : " + sb);

    }
}
