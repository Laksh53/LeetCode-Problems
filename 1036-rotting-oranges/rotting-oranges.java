class Pair{
    int i;
    int j;
    public Pair(int i,int j)
    {
        this.i = i;
        this.j = j;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> rotten = new LinkedList<>();
        int freshOranges = 0;
        int row = grid.length;
        int col = grid[0].length;
        int min = 0;
        for(int i = 0;i < row;i++)
        {
            for(int j = 0;j < col;j++)
            {
                if(grid[i][j] == 1)
                {
                    freshOranges++;
                }
                else if(grid[i][j] == 2)
                {
                    rotten.add(new Pair(i,j));
                }
            }
        }
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!rotten.isEmpty() && freshOranges > 0)
        {
            int size = rotten.size();
            for(int x = 0;x < size;x++)
            {
                Pair temp = rotten.poll();
                int i = temp.i;
                int j = temp.j;
                for(int[]d : dir)
                {
                    int ni = i+d[0];
                    int nj = j+d[1];
                    if(ni >= 0 && nj >= 0 && ni < row && nj < col && grid[ni][nj] == 1)
                    {
                        freshOranges--;
                        grid[ni][nj] = 2;
                        rotten.add(new Pair(ni,nj));
                    }
                }
            }
            min++;
        }
        return freshOranges == 0 ? min : -1;
    }
}
