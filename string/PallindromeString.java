package string;

public class PallindromeString {

    public static void main(String[] args) {

        String s = "arrad";

        System.out.println("is pallindrome : " + pallindromeCheck(s));
    }

    private static boolean pallindromeCheck(String s) {

        int left=0,right= s.length()-1;

        while (left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
