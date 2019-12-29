package practice4;

public class DemoStatic {
    String name;
    static int count=10;


    public static void printDetails(int count) {
        count = count + count;
        System.out.println("count= "+ count);
    }

    public void printDetails2() {
        name = "Ankhimita";
        count = 18;
        System.out.println("revised count= " + count);
    }

    public static void main(String[] args) {
        DemoStatic demoStatic = new DemoStatic();
        printDetails(4);
        demoStatic.printDetails2();
    }
}

