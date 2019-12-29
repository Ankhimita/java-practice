package practice4;

public class ImmuParent {

   private static ImmuParent immu = null;

   String name;

    public ImmuParent(String name) {
        this.name = name;
    }

    public static ImmuParent createImmuObj(String name) {
        if(immu==null) {
            return new ImmuParent(name);
        }
        else return immu;
    }

}
