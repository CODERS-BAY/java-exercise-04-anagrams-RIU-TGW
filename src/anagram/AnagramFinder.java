package anagram;
import java.util.Arrays;


public class AnagramFinder {

    public static void main(String[] args) {

        //a: 43
        //b: t
        //c: "System.out.println(bert.indexOf("C"));"

        String input1 = "Listen to me";
        String input2 = "Silent meot";

        System.out.println("Are the two strings anagrams: " + areAnagrams(input1, input2));
        System.out.println("Are the two strings anagrams: " + areAnagramsSimple(input1, input2));
    }


    public static boolean areAnagrams(String string1, String string2) {
        string1 = string1.replaceAll("[^a-zA-Z0-9]", "");
        string2 = string2.replaceAll("[^a-zA-Z0-9]", "");

        if (string1.length() == string2.length()) {
            char[] array1 = new char[string1.length()];
            char[] array2 = new char[string2.length()];

            for (int i=0;i<string1.length();i++){
                array1[i] = Character.toUpperCase(string1.charAt(i));
                array2[i] = Character.toUpperCase(string2.charAt(i));
            }

            Arrays.sort(array1);
            Arrays.sort(array2);

            return Arrays.equals(array1, array2);

        } else {
            return false;
        }
    }

    public static boolean areAnagramsSimple(String string1, String string2) {
        char[] array1 = string1.replaceAll("[^a-zA-Z0-9]", "").toUpperCase().toCharArray();
        char[] array2 = string2.replaceAll("[^a-zA-Z0-9]", "").toUpperCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
