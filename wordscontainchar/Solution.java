package edu.coding.array.wordscontainchar;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        String[] words ={"leet","code"};
        char x = 'e';
        List<Integer> index = findWordsContaining(words,x);
        System.out.println(index);
    }

    private static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> index = new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x) != -1){
                index.add(i);
            }
        }
        return index;
    }
}
