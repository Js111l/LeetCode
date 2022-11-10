class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder stringBuilder=new StringBuilder(s);
        int counter = 0;
        for (int num : spaces
        ) {
            stringBuilder.insert(num+counter," ");
            counter++;
        }
        return stringBuilder.toString();
    }
}
