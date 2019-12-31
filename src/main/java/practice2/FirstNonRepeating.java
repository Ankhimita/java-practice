package practice2;


// Java program to find first non-repeating character
// Note : hashmap is used


import java.util.LinkedHashMap;
import java.util.Map;

class CountIndex
{
    int count,index;

    // constructor for first occurrence
    public CountIndex(int index) {
        this.count = 1;
        this.index = index;
    }

    // method for updating count
    public void incCount() {
        this.count++;
    }
}
class FirstNonRepeating
{
    static final int NO_OF_CHARS = 256;

    static LinkedHashMap<Character, CountIndex> hm = new LinkedHashMap<>(NO_OF_CHARS);

    /* calculate count of characters
    in the passed string */
    static void getCharCountArray(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            // If character already occurred,
            if(hm.containsKey(str.charAt(i)))
            {
                // updating count
                hm.get(str.charAt(i)).incCount();
            }

            // If it's first occurrence, then store the index and count = 1
            else
            {
                hm.put(str.charAt(i), new CountIndex(i));
            }

        }
    }

    /* The method returns index of first non-repeating
    character in a string. If all characters are repeating
    then returns -1 */
    static int firstNonRepeating(String str)
    {
        getCharCountArray(str);
        int result = 0, i;

//        for (i = 0; i < str.length(); i++)
//        {
//            // If this character occurs only once and appears
//            // before the current result, then update the result
//            if (hm.dequeue(str.charAt(i)).count == 1 && result > hm.dequeue(str.charAt(i)).index){
//                result = hm.dequeue(str.charAt(i)).index;
//            }
//
//        }

//        for(Map.Entry<Character,CountIndex> entry : hm.entrySet()) {
//            if(entry.getValue().count==1 && result> entry.getValue().index) {
//                result = entry.getValue().index;
//            }
//        }

        for(Map.Entry<Character,CountIndex> entry : hm.entrySet()) {
            if(entry.getValue().count==1) {
                result = entry.getValue().index;
                break;
            }
        }

        return result;
    }

    // Driver method
    public static void main (String[] args)
    {
        String str = "geeksforgeeks";
        int index = firstNonRepeating(str);

        System.out.println(index == Integer.MAX_VALUE ? "Either all characters are repeating " +
                " or string is empty" : "First non-repeating character is " + str.charAt(index));
    }
}
