import java.util.Arrays;


public class MissingArray {
    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        int[] lengthArray = new int[arrayOfArrays.length];
        int output = 0;

        for (int i = 0; i < arrayOfArrays.length; i++) {
            lengthArray[i] = arrayOfArrays[i].length;
        }
        Arrays.sort(lengthArray);

        for (int j = 1; j <= lengthArray.length; j++) {
            if (lengthArray[j] - lengthArray[j - 1] == 2) {
                return lengthArray[j] - 1;
            }
        }
        return output;
    }
}