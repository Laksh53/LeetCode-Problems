class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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
        return count == numCourses;
    }
}
