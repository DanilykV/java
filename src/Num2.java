public class Main {
    public static void main(String[] args) {
        final int VALUE_TO_FIND = 5;
        int[] originalArray = {2, 5, 7, 5, 9, 5};
        
        int count = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == VALUE_TO_FIND) {
                count++;
            }
        }
        
        int[] indexesArray = new int[count];
        int index = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == VALUE_TO_FIND) {
                indexesArray[index] = i;
                index++;
            }
        }
        
        System.out.print("Номера элементов в исходном массиве, равных " + VALUE_TO_FIND + ": ");
        for (int i = 0; i < indexesArray.length; i++) {
            System.out.print(indexesArray[i] + " ");
        }
    }
}