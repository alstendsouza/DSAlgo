/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysnStrings;

/**
 *
 * @author alsten
 */
public class uniqueStringApp {
    
    

    
    public static void main(String args[]){
        uniqueStringApp u = new uniqueStringApp();
        String s = "Mr John Smith      ";
        char[] c = s.toCharArray();
        u.replaceSpaces(c, 13);
        
    }

    public boolean isStringUnique(String str){
        boolean[] charArr = new boolean[128];
        
        if(str.length() > 128){
            return false;
        }
        str = str.toLowerCase();
        
        for(int j = 0; j < str.length(); j++){
            int  val= str.charAt(j);

            if(charArr[val]){
                return false;
            }
            charArr[val] = true;
        }
        return true;
    }
    
    public boolean isPerm(String s, String t){
        if(s.length() != t.length())
        {
            return false;
        }
        return sort(s).equals(sort(t));
        
    }
    
    public String sort(String str){
        char[] content = new char[str.length()];
        
        java.util.Arrays.sort(content);
        return new String(content);
    }
    
    public boolean isPermSecond(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        
        int[] charArray = new int[128]; // ascii assumption
        
        for(int i = 0 ; i < s.length(); i++ ){
            int val = s.charAt(i);
            charArray[val]++;
        }
        
        for(int j = 0; j <t.length(); j++){
            int val = t.charAt(j);
            charArray[val]--;
            if(charArray[val] < 0){
                return false;
            }
        }
        return true;
        
        
    }
    
    boolean isRotation(String x, String y){
        
        int len = x.length();
        if(len == y.length() && len > 0){
            String s = x + x;
           //return isSubString(s,y);
        }
        return true;
        
    }
    
    public void replaceSpaces(char[] charArr, int truelength){
        
        // first pass of the character array to count spaces
        
        int spaceCount = 0;
        for(int i = 0 ; i < truelength; i++){
            if(charArr[i] == ' '){
                spaceCount++;
            }
        }

        // count spaces * 2 + truelength to give to index of starting behind array
        int index = truelength + spaceCount * 2;

        //add '/0' to end of char array
        if(truelength < charArr.length){
            charArr[truelength] = '\0';
        }

        // second pass of char array from truelength to 0 to replace each char
        for(int j = truelength-1; j >=0; j--){
            if(charArr[j] == ' '){
                charArr[index-1] = '0';
                charArr[index-2] = '2';
                charArr[index-3] = '%';
                index = index - 3;
            }else{
                charArr[index-1] = charArr[j];
                index = index - 1;
            }
        }
        
        String s = new String(charArr);
        System.out.println(s);
    
    }

    
}
