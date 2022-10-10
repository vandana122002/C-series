package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReturnKeypadCombination {
    public static void main(String[] args) {
        String str = "23";
        ArrayList<String> res = getKC(str);
        System.out.println(res);
    }
    static String[] codes = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuvw", "xyz"};
    private static ArrayList<String> getKC(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char fc = str.charAt(0);
        String rs = str.substring(1);
        ArrayList<String> rans = getKC(rs);
        String charOption = codes[fc - '0'];
        ArrayList<String> mres = new ArrayList<>();
        for(int i=0;i<charOption.length();i++){
            char options = charOption.charAt(i);
            for(String rstr : rans){
                mres.add(rstr+options);
            }
        }
        return mres;
    }
}
