/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {

return BFS(node);
    }

    private Node BFS(Node node) {

        HashMap<Node, Node> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        if(node!=null) {
            visited.put(node, new Node(node.val));
            queue.add(node);

        }

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            for (Node neighbourNode:currentNode.neighbors
            ) {
                if(!visited.containsKey(neighbourNode)){
                    visited.put(neighbourNode,new Node(neighbourNode.val));
                    queue.add(neighbourNode);
                }
                visited.get(currentNode).neighbors.add(visited.get(neighbourNode));
            }
        }

        return visited.get(node);
    }
}