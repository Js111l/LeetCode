class Solution {
    public int minOperations(String[] logs) {

int stepCounter=0;

        for (int i = 0; i < logs.length; i++) {
                      System.out.println(logs[i]);

            if(logs[i].equals("../")){
               stepCounter=stepCounter-1;
           }
          else if (logs[i].equals("./")) {
                stepCounter=stepCounter+1-1;
            }
           else {
               stepCounter++;
           }
             if (stepCounter < 0) {
                stepCounter = 0;
            }


        }

        if(stepCounter<0){
            stepCounter=0;
            return stepCounter;
        }
return stepCounter;
    }
}