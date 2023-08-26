package com.example.Easy;

public class ValidAnagram {
    
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }

        char[] charT = t.toCharArray();
        String sCheck = s;

        for(int i = 0; i < t.length(); i++) {
            if(sCheck.indexOf(charT[i]) != -1) {
                char charOfT = charT[i];
                sCheck = sCheck.replaceFirst(String.valueOf(charOfT), "");
                if(sCheck.equals("")){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean sadICouldntDoThisWithoutNestedLoops(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (t.indexOf(charS[i]) != -1) {
                for (int j = 0; j < t.length(); j++) {
                    if (charS[i] == charT[j]) {
                        charT[j] = '\u0000';
                        count++;
                        break;
                    }
                }
            } else return false;
        }
        return count == s.length();
    }
}
