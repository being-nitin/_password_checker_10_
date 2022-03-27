package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
    You are given a function int CheckPassword(String str, int n);
    The function accepts string str of size n as an argument. Implement
    the function which returns 1 if given string str is valid password else 0.
    str is a valid password if it satisfies the below conditions.

    – At least 4 characters
    – At least one numeric digit
    – At Least one Capital Letter
    – Must not have space or slash (/)
    – Starting character must not be a number

      Example:
      Input:
      aA1_67

      Output:
      1

      Sample Input:
      a987 abC012

      Output:
      0

      Input Format
      A string and n for string size.

      Constraints
      Input string will not be empty.

      Output Format
      Returns 1 if given string str is valid password else 0.

      Sample Input 0
      aA1_67

      Sample Output 0
      1
	 */

   String str = "a987aBc012";
        System.out.println(validPassword(str));
    }
    public static int validPassword(String str){
        int countC = 0;  // will count the number of characters.
        for(int i=0;i<str.length();i++){
            countC++;
        }
        if(countC<4){
            return 0;
        }
        int countD = 0; // wil count the number of digits.
        for(int i=0;i<=9;i++){
            String st = Integer.toString(i);
            if(str.contains(st)){
                countD++;
            }
        }
        if(countD==0){
            return 0;
        }
        int countCa=0;
        for(int i=65;i<=90;i++){
            char c = (char)i;
            String str1 = Character.toString(c);
            if(str.contains(str1)){
                countCa++;
            }
        }
        if(countCa==0){
            return 0;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '|| str.charAt(i)=='/'){
                return 0;
            }
        }
        for(int i=0;i<=9;i++){
            String str2 = Integer.toString(i);
            if(str.startsWith(str2)){
                return 0;
            }
            break;
        }
        return 1;
    }
}
