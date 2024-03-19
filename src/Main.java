import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /** String[] strings = {"CAT", "SBX", "LOG", "SUN", "MUG", "ROW",
                "JOB", "COX", "LAP", "RAT", "PER", "DAD", "CAR", "FIG",
                "PIG", "VIA", "LOW", "LOX", "TEA", "ATE", "ARE", "DOG", "TSL"};
        String[] strings = {"CAT", "", "A", "aBC", "Z", "zZ", "XF", "XF", "a"};*/

        String[] strings = {"gojo", "google", "jogo", "bill", "pup", "cipher",
                "watchmen", "knight", "it", "stand", "sandman", "hydra", "surtr"};

        // Upper case prioritized
        radixSort.sort(strings);

        System.out.println(Arrays.toString(strings));


        //--------------------------------------------------------------------------------------
        /** int[] S = {32, 3};
        int[] T = {1, 2, 3, 52, 32, 54};

        int[] S = {89, 32, 54, 32, 3};
        int[] T = {54, 32, 99};

        int[] S = {0, 67};
        int[] T = {100, 5, 66, 2, 32, 90}; */

        int[] S = {};
        int[] T = {54, 32, 99};

        boolean isSubset = SubInteger.subInteger(S, T);
        System.out.println(isSubset);

    }
}