class Solution {
    public int maxDepth(String s) {
       int count =0;
       int max=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='(' && i<s.length() ){
            count++;
            max = Math.max(max,count); 
        }
         if(ch==')' && i<s.length() ){
            count--;
            // max = Math.max(max,count); 
        }
       } 
       return max;
    }
}