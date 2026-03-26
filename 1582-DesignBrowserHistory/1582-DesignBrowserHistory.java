// Last updated: 3/26/2026, 1:48:15 AM
class BrowserHistory {
    class DLinkedListNode{
        String url;
        DLinkedListNode next;
        DLinkedListNode prev;
        
        public DLinkedListNode(String url){
            this.url = url;
            next = null;
            prev = null;
        }
    }
    
    DLinkedListNode head, tail, current;
    int size = 0;
    public BrowserHistory(String homepage) {
        head = new DLinkedListNode(homepage);
        tail = head;
        current = head;
        size++;
    }
    
    public void visit(String url) {
        DLinkedListNode newNode = new DLinkedListNode(url);
        current.next = null;
        current.next = newNode;
        newNode.prev = current;
        current = current.next;
        //current = tail;
        size++;
    }
    
    public String back(int steps) {
        
        DLinkedListNode node = current;
        
        for(int i=0;node.prev!=null && i<steps;i++){
            node=node.prev;
        }
        current = node;
        return node.url;
    }
    
    public String forward(int steps) {
         DLinkedListNode node = current;
        
        for(int i=0;node.next!=null && i<steps;i++){
            node=node.next;
        }
        current = node;
        return node.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */