package string;

public class FrequencyCount {

    public static void main(String[] args) {

        String input ="hello";
        int[] frequency = countFrequency(input);

        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>0){
                System.out.println((char) (i+'a') + " : "+ frequency[i]);
            }
        }

    }

    private static int[] countFrequency(String s) {

        int[] freq = new int[26];

        for(char c: s.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
                freq[c - 'a']++;
            }
        }

        return freq;

    }
}
