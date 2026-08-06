class Solution {
    public boolean judgeSquareSum(int c) {
       long s = 0;
        long l = (long) Math.sqrt(c);
       while(s<=l){
        long sum=((s*s)+(l*l));
        if(sum==c){
            return true;
        }
        else if(sum<c){
            s++;
        }
        else {
            l--;
        }
       }
        return false;
    }
}