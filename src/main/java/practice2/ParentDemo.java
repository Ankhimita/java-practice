package practice2;

public class ParentDemo {

    public String name="parent name";

    protected void method1(int a, int b) {
        System.out.println("base");
    }

    public static void method2(){
        System.out.println("static parent");
    }

    public static void main(String[] args) {
        ParentDemo parentObj = new ParentDemo();
        parentObj.method1(1,2);

        System.out.println(parentObj.name);

        ParentDemo parentRefChildObj = new ChildDemo();
        parentRefChildObj.method1(1,2);

        System.out.println(parentRefChildObj.name);

        ChildDemo childDemo = new ChildDemo();
        childDemo.method1(1,2.0f);

        System.out.println(childDemo.name);

        ParentDemo.method2();
        ChildDemo.method2();

    }
}

class ChildDemo extends ParentDemo {

    public String name="child name";

    public static  void method2(){
        System.out.println("static child");
    }

    protected void method1(int a, float b) {
        System.out.println("child");
    }

    public void method1(int a, int b) {
        System.out.println("child overriden");
    }

}
