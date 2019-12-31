package practice1;// Java program to find winner in an election.

import java.util.HashMap;
import java.util.Map;


public class ChronologyDemo
{

    public static void findWinner(String votes[])
    {

        Map<String,Integer> map =
                new HashMap<String, Integer>();
        for (String str : votes)
        {
//            if (map.keySet().contains(str))
            if(map.containsKey(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }


        int maxValueInMap = 0;
        String winner = "";
        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            String key = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxValueInMap)
            {
                maxValueInMap = val;
                winner = key;
            }

            // If there is a tie, pick lexicographically
            // smaller.
            else if (val == maxValueInMap &&
                    winner.compareTo(key) < 0)
                winner = key;
        }
        System.out.println(winner);
    }

    // Driver code
    public static void main(String[] args)
    {
        String[] votes = { "Alex", "Michael", "Harry", "Dave", "Victor", "Mary", "Michael", "Mary"};

        findWinner(votes);
    }
}

