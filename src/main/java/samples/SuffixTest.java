package samples;

import java.util.Arrays;

public class SuffixTest {

    public static void main(String[] args) {
        String suffix = "";
        String filename = "jhkj.csv";
        String suffixArray = filename.split("\\.")[1];
        System.out.println(Arrays.asList(suffixArray));
    }
}
