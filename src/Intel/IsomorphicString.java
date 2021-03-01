package Intel;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length()){return false;}
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Boolean> mapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(mapS.containsKey(c1)){
                if(mapS.get(c1) != c2){return false;}
                else{
                    if(mapT.containsKey(c2) == true) {
                        return false;
                    }
                    else {
                        mapS.put(c1,c2);
                        mapT.put(c2,true);
                    }
                }
            }
        }
    }
}
