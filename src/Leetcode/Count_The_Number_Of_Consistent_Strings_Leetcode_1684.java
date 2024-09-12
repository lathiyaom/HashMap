package Leetcode;

import java.util.HashSet;

public class Count_The_Number_Of_Consistent_Strings_Leetcode_1684 {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("cad",new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }


    public  static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character>set=new HashSet<>();
        int ans=0;
        for(int i=0;i<allowed.length();i++)
        {
            set.add(allowed.charAt(i));
        }
        for(int i=0;i<words.length;i++)
        {
            char[]ch=words[i].toCharArray();
            if(isParesnt(ch,set))
            {
                ans++;
            }
        }
        return ans;
    }

    private static boolean isParesnt(char[] ch, HashSet<Character> set) {
        for(int i=0;i<ch.length;i++)
        {
            if(!set.contains(ch[i]))return false;
        }return true;

    }
}
