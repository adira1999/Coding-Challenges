package string;

import java.util.Arrays;

public class AnagramCheck {

    //An anagram is a word or phrase formed by rearranging the letters of a different
    // word or phrase, typically using all the original letters exactly once.

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2)); // Output: true

    }

    private static boolean isAnagram(String str1, String str2) {

        if(str1.length() != str2.length()){
            return false;
        }

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array, str2Array);

    }
}
