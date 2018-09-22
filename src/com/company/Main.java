package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       String str = "Hello There!";
       System.out.println("str = "+str);
       System.out.println("oddCharacters = "+ oddCharacters(str));
       System.out.println("evenCharacters = "+ evenCharacters(str));
       System.out.println("evenOddCharacters = "+ evenOddCharacters(str));
    }
    public static String oddCharacters(String str){
        String newString = "";
        for ( int i = 0; i<str.length(); i++){
            if(i % 2 == 1){
                newString = newString + str.substring(i,i+1);
            }
        }
        return newString;
    }
    public static String evenCharacters(String str){
        int i = 0;
        String newString = "";
        while(i<str.length()){
            newString = newString + str.substring(i, i+1);
            i=i+2;
        }
        return newString;
    }
    public static String evenOddCharacters(String str){
        int i = 0;
        String even = "";
        String odd = "";
        while (i<str.length()){
            if(i % 2==0){
                even = even + str.substring(i,i+1);
                i++;
            }
            else{
                odd = odd + str.substring(i,i+1);
                i++;
            }
        }
        return even + odd;
    }
}
