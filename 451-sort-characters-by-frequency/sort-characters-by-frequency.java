class Solution {
    public String frequencySort(String s) {
      StringBuilder ans= new StringBuilder();
      Map< Character , Integer > hm = new HashMap<>();
     
    for( char ch : s.toCharArray()){
        hm.put(ch , hm.getOrDefault(ch,0) +1);
    }
    List<Character> ls= new ArrayList(hm.keySet());
    ls.sort((ob1,ob2) -> hm.get(ob2)- hm.get(ob1)) ;
    for(char ch:ls){
        for(int i=0;i< hm.get(ch);i++){
            ans.append(ch);
        }
    }
    return ans.toString();
    }
}