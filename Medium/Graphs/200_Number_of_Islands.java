

class Solution 
{
    public int numIslands(char[][] grid) 
    {
        int no_of_islands = 0;
        for (int i=0; i<grid.length; i++)
        {
            for (int j=0; j<grid[i].length; j++)
            {
                if (grid[i][j] == '1') 
                {
                    no_of_islands++;           // count a new island
                    floodfill(grid, i, j);     // mark the whole island
                }
            }
        }
        return no_of_islands;
    }
    //We need a recursive method that checks if an element is 1, and does what needs to be done if so
    void floodfill(char[][] grid, int i, int j)
    {
        int rows = grid.length;
        int cols = grid[i].length;
        if(grid[i][j] == '1')
        {
            grid[i][j] = 'a';
            if (i > 0) floodfill(grid, i-1, j); // up
            if (i < rows-1) floodfill(grid, i+1, j); // down
            if (j > 0) floodfill(grid, i, j-1); // left
            if (j < cols-1) floodfill(grid, i, j+1); // right

        }
        else if (grid[i][j] == 'a' || grid[i][j] == '0') return;
    }
}
