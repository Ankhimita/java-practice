package samples;

public class DecodeWays {

    public static void main(String[] args) {

        String input = "27";
        int[] maxWays = new int[input.length()+1];

        maxWays[0] = 1;
        maxWays[1] = input.charAt(1) == '0' ? 0 : 1;

        for (int i=2; i<=input.length(); i++) {
            int firstCase = Integer.valueOf(input.substring(i-1,i));
            int secondCase = Integer.valueOf(input.substring(i-2,i));

            if(firstCase>=1) {
                maxWays[i] = maxWays[i] + maxWays[i-1];
            }

            if(secondCase>=10 && secondCase<=26) {
                maxWays[i] = maxWays[i] + maxWays[i-2];
            }
        }

        System.out.println(maxWays[input.length()]);
    }
}
