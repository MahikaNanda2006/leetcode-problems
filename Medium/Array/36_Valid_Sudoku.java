class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
       //We need to use hashsets, as we already decided
       //Now, one loop is enough. What we do is we create 27 individual hashsets in the start itself
       HashSet<Character>[] rows = new HashSet[9];
       HashSet<Character>[] coloumns = new HashSet[9];
       HashSet<Character>[] boxes = new HashSet[9];
       //Now, for each of these, we create nine mini guys - so one for each row, coloumn, and box
       for (int i = 0; i<9; i++)
       {
        rows[i] = new HashSet<>();
        coloumns[i] = new HashSet<>();
        boxes[i] = new HashSet<>();
       }
       //Next, we traverse through each of the terms in the board, and add each to the relevant row, coloumn, and box array.
       //And any falses get returned, while trues get ignored
       for (int i =0; i<9; i++)
       {
        for (int j = 0; j<9 ; j++)
        {
            if (board[i][j] == '.')
            {
                continue;
            }
            else
            {
                boolean row = rows[i].add(board[i][j]);
                boolean coloumn = coloumns[j].add(board[i][j]);
                int b = ((i/3)*3 + (j/3));
                boolean box = boxes[b].add(board[i][j]);
                if (row == true && coloumn == true && box == true)
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
       }
       return true;
    }
}