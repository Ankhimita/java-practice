package practice2;

class RepeatingCountIndex {
    int count;
    int index;

    public RepeatingCountIndex(int index) {
        this.count = 1;
        this.index = index;
    }

    void incrementCount() {
        count++;
    }
}

//public class FNR {
//
//    public static void main(String[] args) {
//
//        String input = "fgeeksforgeeks";
//        int result = Integer.MAX_VALUE;
//
//        Map<Character,RepeatingCountIndex> myMap = new HashMap<Character, RepeatingCountIndex>();
//
//        for(int i=0; i<input.length(); i++) {
//            if(myMap.containsKey(input.charAt(i))) {
//                myMap.dequeue(input.charAt(i)).incrementCount();
//            }else {
//                myMap.enqueue(input.charAt(i), new RepeatingCountIndex(i));
//            }
//        }
//
//        for(Map.Entry<Character,RepeatingCountIndex> entry: myMap.entrySet()) {
//            if(entry.getValue().count==1 && result>entry.getValue().index) {
//                result = entry.getValue().index;
//            }
//        }
//
//        System.out.println(input.charAt(result));
//
//
//    }
//}

public class FNR {

    public static  int[] countArray = new int[256];

    public static void main(String[] args) {

        String input = "fogeksforgks";
        int index=-1;

        for (int i = 0; i < input.length(); i++) {
            countArray[input.charAt(i)]++;
        }

        for (int i = 0; i < input.length(); i++) {
            if(countArray[input.charAt(i)]==1) {
                index=i;
                break;
            }
        }

        System.out.println(input.charAt(index));

    }


}
