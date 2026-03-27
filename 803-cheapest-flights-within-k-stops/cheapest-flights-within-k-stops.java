class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<int[]>[] graph = new List[n];
        for(int i=0;i<n;i++)
        {
            graph[i] = new ArrayList<>();
        }
        for(int[] flight : flights)
        {
            graph[flight[0]].add(new int[] {flight[1],flight[2]});
        }
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{src,0,0});
        while(!q.isEmpty())
        {
            int[] node = q.poll();
            int u = node[0];           // u = source
            int d = node[1];           // d = distamce             
            int s = node[2];           // s = stop
            if(s > k)
            {
                continue;
            }   
            for(int[] edge : graph[u])
            {
                int v = edge[0];       // v = vertex      
                int w = edge[1];       // w = weight   
                if(dist[v] > d+w)
                {
                    dist[v] = d+w;
                    q.add(new int[]{v,dist[v],s+1}); 
                }
            }
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}