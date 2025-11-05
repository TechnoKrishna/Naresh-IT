class Developer1 {
    public void doSum(int x, int y) {
    }

    public void doSub(int x, int y) {
    }
}

class Developer2 extends Developer1 {
    public void doMul(int x, int y) {
    }

    public void doDiv(int x, int y) {
    }
}

public class Main {
    public static void main(String[] args) {

        Developer2 d = new Developer2();

    }
}