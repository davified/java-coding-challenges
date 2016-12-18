public class SequenceSum{

    public static String showSequence(int value){
        int sum = 0;
        String outputString = "0";
        if (value > 0) {
            String[] outputArray = new String[value + 1];
            for (int i = 0; i <= value; i++) {
                sum += i;
                outputArray[i] = Integer.toString(i);
            }

            for (int j = 1; j <= value; j++) {
                outputString += "+" + outputArray[j];
            }

            outputString += " = " + Integer.toString(sum);

            System.out.println(outputString);

        } else if (value == 0) {
            outputString = "0=0";
        } else if (value < 0) {
            outputString = Integer.toString(value) + "<0";
        }
        return outputString;
    }


}