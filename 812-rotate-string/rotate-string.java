class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder ans = new StringBuilder();
        ans.insert(0,s);
        for(int i=0;i<s.length();i++){
            if(ans.toString().equals(goal)){
                return true;
            }

            char first = ans.charAt(0);
            ans.deleteCharAt(0);
            ans.append(first);
        }
        return false;
    }
}