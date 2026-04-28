package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


    }
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        String word = String.valueOf(number);
        String reverseWord="";
        for(int i=0;i<word.length();i++) {
            reverseWord = word.charAt(i) + reverseWord;
        }
        return word.equals(reverseWord);
    }
    public static boolean isPerfectNumber(int number){
        if(number<0) {
            return false;
        }
        int toplam=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                toplam+=i;
            }
        }
        return number==toplam;
    }
    public static String numberToWords(int number){
        if(number<0) {
            return "Invalid Value";
        }
        String word= String.valueOf(number);
        String numberWrite="";
        String bosluk=" ";

        for(int i=0;i<word.length();i++){
            bosluk = i ==0 ? "" : " ";
            switch(word.charAt(i)){
                case '0':{
                    numberWrite= numberWrite+bosluk+"Zero";
                    break;
                }
                case '1':{
                    numberWrite= numberWrite+bosluk+"One";
                    break;
                }
                case '2':{
                    numberWrite= numberWrite+bosluk+"Two";
                    break;
                }
                case '3':{
                    numberWrite= numberWrite+bosluk+"Three";
                    break;
                }
                case '4':{
                    numberWrite= numberWrite+bosluk+"Four";
                    break;
                }
                case '5':{
                    numberWrite= numberWrite+bosluk+"Five";
                    break;
                }
                case '6':{
                    numberWrite= numberWrite+bosluk+"Six";
                    break;
                }
                case '7':{
                    numberWrite= numberWrite+bosluk+"Seven";
                    break;
                }
                case '8':{
                    numberWrite= numberWrite+bosluk+"Eight";
                    break;
                }
                case '9':{
                    numberWrite= numberWrite+bosluk+"Nine";
                    break;
                }
                default:
                    numberWrite= numberWrite;
            }
        }
        return numberWrite;
    }
}
