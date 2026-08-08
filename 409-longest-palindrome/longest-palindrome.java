class Solution {
    public int longestPalindrome(String s) {
    int i=0;
    
    int count=0;
    char[] chars = s.toCharArray(); 
    Arrays.sort(chars);
    
   
    while (i<chars.length-1){
    
    
    if(chars[i]==chars[i+1]){
        count=count+2;
        i=i+2;
    }
    else{
        i++;
    }
    } 
    if(count<chars.length){
        count++;
    }
    
    return count;
    }
}