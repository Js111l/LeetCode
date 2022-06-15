public class Solution {
    public int FindKthLargest(int[] nums, int k) {
List<int> list = new List<int>(nums);
list.Sort();
int listsize = list.Count;

return list.ElementAt(listsize - k);

    }
}