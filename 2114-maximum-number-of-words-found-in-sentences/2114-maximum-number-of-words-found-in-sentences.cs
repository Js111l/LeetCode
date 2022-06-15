public class Solution {
    public int MostWordsFound(string[] sentences) {
        int[] array = new int[sentences.Length];  // int array to hold words count values


for (int i = 0; i < sentences.Length; i++)
{
    array[i] = sentences[i].Split(' ').Count(); //counting words in each sentence as integers and assigning integers
                                                //to int array, in order to find maximum words number in sentences.
}

return array.Max();


        
    }
}