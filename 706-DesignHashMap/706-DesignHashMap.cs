// Last updated: 3/31/2026, 1:37:37 PM
1public class MyHashMap {
2    public class Node
3    {
4        public int key;
5        public int value;
6        public Node next;
7
8        public Node(int key, int value)
9        {
10            this.key = key;
11            this.value = value;
12            this.next = null;
13        }
14    }
15    public Node[] roots;
16
17    public MyHashMap() {
18       roots = new Node[1000];
19    }
20    
21    private int hash(int key)
22    {
23        return key%1000;
24    }
25
26    private Node helper(Node node, int key)
27    {
28        while(node.next!=null && node.next.key!=key)
29        {
30            node = node.next;
31        }
32
33        return node;
34    }
35
36    public void Put(int key, int value) {
37        int hashKey = hash(key);
38
39        if(roots[hashKey] == null)
40        {
41            roots[hashKey] = new Node(-1,-1);
42        }
43
44        Node prev = helper(roots[hashKey], key);
45        if(prev.next == null)
46        {
47            prev.next = new Node(key, value);
48           
49        }
50        else
51        {
52            prev.next.value = value;
53        }
54        
55    }
56    
57    public int Get(int key) {
58        int hashKey = hash(key);
59
60        Node root = roots[hashKey];
61
62        //Console.WriteLine("Root key: "+root.key+" value:"+root.value);
63
64        if(root == null)
65        {
66            return -1;
67        }
68
69        Node prev = helper(root, key);
70        if(prev.next == null)
71        {
72            return -1;
73        }
74        else
75        {
76            //Console.WriteLine("Retrieving key: "+prev.next.key+" value:"+prev.next.value);
77            return prev.next.value;
78        }
79    }
80    
81    public void Remove(int key) {
82        int hashKey = hash(key);
83
84        if(roots[hashKey]!=null)
85        {
86            Node prev = helper(roots[hashKey], key);
87            if(prev.next!=null)
88            {
89                prev.next = prev.next.next;
90            }
91        }
92    }
93}
94
95/**
96 * Your MyHashMap object will be instantiated and called as such:
97 * MyHashMap obj = new MyHashMap();
98 * obj.Put(key,value);
99 * int param_2 = obj.Get(key);
100 * obj.Remove(key);
101 */