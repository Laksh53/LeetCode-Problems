class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] edge : prerequisites)
        {
            adj.get(edge[1]).add(edge[0]);
        }
        int[] indgree = new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            for(int n : adj.get(i))
            {
                indgree[n]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indgree[i] == 0)
            {
                q.add(i);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        int count = 0;
        while(!q.isEmpty())
        {
            int vertex = q.poll();
            res.add(vertex);
            for(int nei : adj.get(vertex))
            {
                indgree[nei]--;
                if(indgree[nei] == 0)
                {
                    q.add(nei);
                }
            }
            count++;
        }
        int[] result = new int[res.size()];
        for(int i = 0;i < res.size();i++)
        {
            result[i] = res.get(i);
        }
        return count != numCourses ? new int[0] : result;
    }
}
