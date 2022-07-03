// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/


class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (findCycle(i, visited, recStack, adj)) {
                return true;
            }
        }
        return false;
    }

    boolean findCycle(int n, boolean[] visited, boolean[] recStack, ArrayList<ArrayList<Integer>> adj) {
        if (recStack[n]) {
            return true;
        }

        if (visited[n]) {
            return false;
        }
        recStack[n] = true;
        visited[n] = true;

        for (int i = 0; i < adj.get(n).size(); i++) {
            if(findCycle(adj.get(n).get(i),visited,recStack,adj)){
                return true;
            }

        }
        recStack[n]=false;
        return false;
    }

}

