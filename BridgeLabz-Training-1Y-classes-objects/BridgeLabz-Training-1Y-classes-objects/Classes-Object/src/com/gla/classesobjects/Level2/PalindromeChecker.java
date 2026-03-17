package com.gla.classesobjects.Level2;

class PalindromeChecker {
    String text;
    PalindromeChecker(String t){
        text=t;
    }
    boolean isPalindrome(){
        int i=0,j=text.length()-1;
        while(i<j){
            if(text.charAt(i)!=text.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
    void display(){
        System.out.println(isPalindrome());
    }
    public static void main(String args[]){
        PalindromeChecker p=new PalindromeChecker("madam");
        p.display();
    }
}