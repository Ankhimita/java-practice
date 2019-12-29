package samples;

class Parent {

    Parent display(int i) {
        System.out.println("Parent");
        return null;
    }
}

class Child extends Parent {

    Child display(int i) {
        System.out.println("Child");
        return null;
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.display(5);
    }
}
