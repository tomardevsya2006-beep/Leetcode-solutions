class Solution {
    public int smallestNumber(int n, int t) {
        int count=0;
         do{
           int p=prod(n);
            if((p%t)==0){
                count++;
                return n;
                
            }
            n++;
        }while(count==0);

        return -1;
    }
    static int prod(int n){
        int m=0;
        int digit =0;
        int product=1;
        while(n!=0){
             m=n;
             digit=m%10;
             product = product *digit;
             n=n/10;
        }
        return product;
    }
}