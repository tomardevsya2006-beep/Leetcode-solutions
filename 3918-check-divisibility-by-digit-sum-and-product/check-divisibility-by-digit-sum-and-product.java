class Solution {
    public boolean checkDivisibility(int n) {
      int sum=0;
      int prod=1;
      int rem=0;
      int m;
      int og=n;
      while(n!=0){
       m=n;
       rem=m%10;
       sum=sum+rem;
       prod=prod*rem;
       n=n/10; 
      }  
      if(og%(sum+prod)==0){
        return true;
      }
      return false;
    }
}