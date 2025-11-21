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
    HashMap<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        return dfs(node);
    }

    private Node dfs(Node oldNode) {
       // Basic idea:
       //1. Add each node into the HashMap along with it's oldNode
       //2. Go through each neighbour.
       //3. Base case: if the neighbour already exists, just add them
       //4. If not, then make the neighbour and do the same process again

       // Base case
       if (map.containsKey(oldNode))
       {
        return map.get(oldNode);
       }

       //2. Recursive case

       //2.1 Create and add to the hashmap
       Node newNode = new Node (oldNode.val);
       map.put(oldNode, newNode);

       //2.2 Add neighbours
       for(Node neighbour: oldNode.neighbors)
       {
        newNode.neighbors.add(dfs(neighbour));
       }
       return newNode;
    }
}
