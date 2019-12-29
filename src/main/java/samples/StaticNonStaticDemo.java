package samples;

class Employee{
    int i;
    Employee(int i) {
        this.i=i;
    }
}

public class StaticNonStaticDemo {

    static class StaticTest{
        static int x=5;
        int z=6;
        final int y=8;
    }



    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();

        staticTest.x=6;
        staticTest.z=8;
//        staticTest.y=9;

//        List myList = new ArrayList();
//        Employee employee = new Employee(6);
//        myList.add(employee);
    }
}
