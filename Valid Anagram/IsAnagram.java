package com.company;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {

      HashMap<Character,Integer> isFound = new HashMap<>() ;

      if (s.length() != t.length()){
          return false;
      }
      for (int i=0;i<s.length();i++){
          if (isFound.containsKey(s.charAt(i)))
          isFound.put(s.charAt(i),isFound.get(s.charAt(i))+1);
          else isFound.put(s.charAt(i),1);
      }

      for (int j=0;j<t.length();j++){
          if (isFound.containsKey(t.charAt(j))){
              if (isFound.get(t.charAt(j))==1)
                  isFound.remove(t.charAt(j));
              else
              isFound.put(t.charAt(j),isFound.get(t.charAt(j))-1);
          }
          else return false;
      }
      if (isFound.size()>0)
          return false;
      else
        return true;
    }
}
