// Last updated: 3/26/2026, 1:49:26 AM
class Solution {
    public int makeConnected(int n, int[][] connections) {
        int edgeCount = 0; /// count for redundant edges
        
        UnionFind uf = new UnionFind(n);
        
        for(int[] connection : connections){
            if(uf.union(connection[0],connection[1]))
                edgeCount++;
        }

        int compCount = 0;
        for(int i=0;i<uf.parent.length;i++)
        {
            if(uf.parent[i]==i)
                compCount++;
        }
        if(compCount==1)
            return 0;
        
        if(compCount - 1 > edgeCount)
            return -1;
        else
            return compCount-1;
    }
    
    class UnionFind{
        int[] parent;
        int[] rank;
        
        public UnionFind(int size){
            parent = new int[size];
            rank = new int[size];
            
            for(int i=0;i<size;i++){
                parent[i] = i;
                rank[i] = 1;
            }
        }
        
        public int find(int u){
            if(parent[u]!=u){
                parent[u] = find(parent[u]);
            }
            return parent[u];
        }
        
        public boolean union(int u, int v){
            int parent_u = find(u);
            int parent_v = find(v);
            
            if(parent_u==parent_v)
                return true;
            
            else if(rank[parent_u] > rank[parent_v]){
                parent[parent_v] = parent_u;
                rank[parent_u]+=rank[parent_v];
            }
            else{
                parent[parent_u] = parent_v;
                rank[parent_v]+=rank[parent_u];
            }
            return false;
        }
    }
}


/*
[[0,1],[0,2],[0,3],[1,2],[1,3]]

redundant edge count = 2;


[0,0,0,0,4,5]



*/