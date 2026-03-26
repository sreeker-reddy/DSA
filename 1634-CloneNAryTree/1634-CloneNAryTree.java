// Last updated: 3/26/2026, 1:48:07 AM
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    
    public Node() {
        children = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        children = new ArrayList<Node>();
    }
    
    public Node(int _val,ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    Map<Node,Node> map = new HashMap<>();
    
    public Node cloneTree(Node root) {
        if(root == null)
            return null;
        if(map.containsKey(root))
            return map.get(root);
        Node newNode = new Node(root.val);
        map.put(root,newNode);
        for(Node child : root.children){
            newNode.children.add(cloneTree(child));
        }
        return newNode;
    }
}