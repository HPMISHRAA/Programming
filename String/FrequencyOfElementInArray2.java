package sideshsirprogramming;

public class FrequencyOfElementInArray2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 5};
        String str = "";
        
        // Concatenate array elements to form a string
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i];
        }
        
        // Initialize an array to store the frequency of characters
        int[] arr1 = new int[123];
        
        // Calculate the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr1[ch]++;
        }
        
        // Print the frequency of characters
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                System.out.println((char) i + " ----> " + arr1[i]);
            }
        }
    }
}
