
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> strings=new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder();

    helper(root,strings,stringBuilder);
    return strings;
    }

    private void helper(TreeNode root, List<String> strings, StringBuilder stringBuilder) {
   if(root==null){
       return;
   }
                int l=stringBuilder.length();

    if(root.right!=null||root.left!=null){
        stringBuilder.append(root.val+"->");
    }
    if(root.left==null&&root.right==null){
        stringBuilder.append(root.val);
        strings.add(stringBuilder.toString());
    }        System.out.println(l);

     helper(root.right,strings,new StringBuilder(stringBuilder));
    helper(root.left,strings,new StringBuilder(stringBuilder));
    }
}