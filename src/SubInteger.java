import java.util.Hashtable;

public class SubInteger {
    public static boolean subInteger(int[] S, int[] T) {
        Hashtable<Integer, Boolean> setValues = new Hashtable<>();
        for(int number : T) {
            setValues.put(number, true);
        }

        for(int number : S) {
            if(setValues.get(number) == null) {   //O(n)
                return false;
            }
        }

        return true;
    }
}
