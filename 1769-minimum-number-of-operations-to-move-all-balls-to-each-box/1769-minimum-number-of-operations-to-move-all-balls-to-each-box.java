
class Solution {
    public int[] minOperations(String boxes) {
        int[] boxesArray = new int[boxes.length()];
    
        for (int i = 0; i < boxesArray.length; i++) {
                        boxesArray[i]=0;
            for (int j = 0; j < boxesArray.length; j++) {
                  
                if (Integer.valueOf(boxes.charAt(j)-48) == 1) {
                    boxesArray[i] += Math.abs(i - j);
                }
            }
        }
        return boxesArray;
    }

}

