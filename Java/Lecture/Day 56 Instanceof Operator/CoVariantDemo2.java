class RBI {
    public Number loan() {
        System.out.println("Bank should provide loan");
        return null;
    }
}

class SBI extends RBI {
    @Override
    public Float loan() { // ✔ Float IS-A Number
        System.out.println("Providing loan @ 9.2% ROI");
        return null;
    }
}

public class CoVariantDemo2 {
    public static void main(String[] args) {
        RBI r = new SBI();
        r.loan();
    }
}
