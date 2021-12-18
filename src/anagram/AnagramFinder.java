package anagram;
import java.util.Arrays;


public class AnagramFinder {

    public static void main(String[] args) {

        //a: 43
        //b: t
        //c: System.out.println(bert.indexOf("C"));


        if (areAnagrams("Listen", "Silent")){
            System.out.println("The two strings are anagrams");
        } else{
            System.out.println("The two strings are NOT anagrams");
        }

    }


    public static boolean areAnagrams(String string1, String string2) {
        if (string1.replace(" ", "").length() == string2.replace(" ", "").length()) {
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
}
