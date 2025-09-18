class LoginApp {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide username and password!");
            return;
        }

        String username = args[0];
        String password = args[1];

        if (username.equals("Krishna") && password.equals("1234")) {
            System.out.println("✅ Login successful. Welcome " + username + "!");
        } else {
            System.out.println("❌ Invalid credentials!");
        }
    }
}
