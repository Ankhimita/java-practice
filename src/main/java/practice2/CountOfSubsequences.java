package practice2;

// Java program to count subsequences of the
// form a^i b^j c^k
public class CountOfSubsequences {

    // Returns count of subsequences of the form
    // a^i b^j c^k
    static int countSubsequences(String s)
    {

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;

        // Traverse all characters of given string
        for (int i=0; i< s.length(); i++)
        {
            if (s.charAt(i) == 'a')
                aCount = (1 + 2 * aCount);

            else if (s.charAt(i) == 'b')
                bCount = (aCount + 2 * bCount);

            else if (s.charAt(i) == 'c')
                cCount = (bCount + 2 * cCount);
        }

        return cCount;
    }

    // Driver code
    public static void main(String args[])
    {
        String s = "abbc";
        System.out.println(countSubsequences(s));
    }
}
// This code is contributed by Sumit Ghosh
