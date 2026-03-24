class Solution {
    public void backtrack(int[][] grid, int row, int col, int color, int num){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != num)
        {
            return;
        }
        grid[row][col] = color;
        backtrack(grid,row+1,col,color,num);
        backtrack(grid,row,col+1,color,num);
        backtrack(grid,row-1,col,color,num);
        backtrack(grid,row,col-1,color,num);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startingnum = image[sr][sc];
        if(image[sr][sc] == color)
        {
            return image;
        }
        backtrack(image ,sr,sc,color,startingnum);
        return image;
    }
}