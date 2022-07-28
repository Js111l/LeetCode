class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> strings=new ArrayList<>();
        String a="";
        for(int i=0;i<paths.size();i++){
            strings.add( paths.get(i).get(0));
        }
        for(int i=0;i<paths.size();i++){
            if(!strings.contains(paths.get(i).get(1))){
                a=paths.get(i).get(1);
            }
        }
        return a;
    }
}