class RBI {
    protected String ifscCode = "RBIHYD0001";

    public String loan() {
        return "Provide the loan to customer";
    }
}

class SBI extends RBI {
    protected String ifscCode = "SBIHYD00014"; // Variable Hiding

    @Override
    public String loan() {
        return "Providing loan @ 9.2% ROI";
    }
}

public class VariableHiding {
    public static void main(String[] args) {
        RBI rbi = new SBI();
        System.out.println(rbi.ifscCode + " " + rbi.loan());
    }
}