package samples;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");

        for(int i = 0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }

        System.out.println("Before Manipulation: " + myList.size());

        for(int i = 0; i<myList.size(); i++){
            if(myList.get(i).equals("3")){
                myList.remove(i);
//                i--;
                myList.add("6");
            }
        }

        System.out.println("After Manipulation: " + myList.size());


        for(int i = 0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
