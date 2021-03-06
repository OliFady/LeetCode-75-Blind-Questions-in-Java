package com.company;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {

        Stack<Character> list=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(list.isEmpty()){
                list.push(s.charAt(i));
            }
            else if(list.peek()=='(' && s.charAt(i)==')'){
                list.pop();
            }
            else if(list.peek()=='{' && s.charAt(i)=='}'){
                list.pop();
            }
            else if(list.peek()=='[' && s.charAt(i)==']'){
                list.pop();
            }
            else{
                list.push(s.charAt(i));
            }
        }
        return list.isEmpty();
    }
}
