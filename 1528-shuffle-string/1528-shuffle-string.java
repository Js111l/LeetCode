class Solution {
    public String restoreString(String s, int[] indices) {

      Map<Integer,Character> map=new TreeMap<>();
      
      for(int i=0;i< indices.length;i++){
          map.put(indices[i],s.charAt(i));
      }
        
      StringBuilder res=new StringBuilder();
      
      for(int i=0;i< indices.length;i++){
          res.append(map.get(i));
      }
      
      return    res.toString();
      
    }
}