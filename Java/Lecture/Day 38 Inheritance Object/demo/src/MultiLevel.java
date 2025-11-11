class Student {
    protected int id;
    protected String name;
    protected String address;

    public Student(int id, String name, String address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
    }
}

class Science extends Student {
    protected int phy;
    protected int che;

    public Science(int id, String name, String address, int phy, int che) {
        super(id, name, address);
        this.phy = phy;
        this.che = che;
    }

    @Override
    public String toString() {
        return super.toString() + " Science [phy=" + phy + ", che=" + che + "]";
    }
}

class PCM extends Science {
    protected int math;

    public PCM(int id, String name, String address, int phy, int che, int math) {
        super(id, name, address, phy, che);
        this.math = math;
    }

    @Override
    public String toString() {
        return super.toString() + " PCM [math=" + math + "]";
    }

    public void getTotalMarks() {
        int total = this.phy + this.che + this.math;
        System.out.println("Total Marks: " + total);
    }
}

public class MultiLevel
{
    public static void main(String[] args)
    {
        PCM p = new PCM(1, "Alen", "Hyd", 90, 80, 70);

        System.out.println(p);

        p.getTotalMarks();
    }
}