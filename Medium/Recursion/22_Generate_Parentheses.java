class Solution 
{
    public List<String> generateParenthesis(int n) 
    {
        //We need to do this question using recusrsion
        //We know that a ( can only be added until the condition i = n has not been triggered
        //And a ) can only be added if there's a corresponding ( that hasn't been added
        //Maybe there should be a counter to add (, and after each of them, the correspoding number of ) is added
        //So at first, it adds one (, and then the corresponding number of ) is added
        //Then that is continued till the end, so we get ()()()
        //Then this pattern is added - ()(())
        //Next, two ( are added
        //That builds this pattern - (())()
        //Then it builds this pattern- (()())
        //Then, three ( are added
        //So it builds this pattern- ((()))
        //Our backtrack method therefore needs to contain the String, the number of open brackets, and the number of closed brackets
        //The base case is when both the number of open and closed brackets is equal to n
        //The recursive case checks if an open cbracket can be added and adds that
        //Or if a closed bracket can be added then adds that
        //Then calls the method again
        //At the end, we remove the last two brackets we added.
        List<String> result = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        backtrack (path, result, n, 0, 0);
        return result;
    }
    void backtrack(StringBuilder path, List<String> result, int n, int open, int closed)
    {
        //1. Base case - if open and close are both equal to n, then add to result
        if (open == n && closed == n)
        {
            result.add(path.toString());
            return;
        }
         //2. Recursive case
        if (open<n)
        {
            path.append("(");
            backtrack(path, result, n, open+1, closed);
            path.deleteCharAt(path.length()-1);
        }
        if (closed < open)
        {
            path.append(")");
            backtrack(path, result, n, open, closed+1);
            path.deleteCharAt(path.length()-1);
        }
    }
}