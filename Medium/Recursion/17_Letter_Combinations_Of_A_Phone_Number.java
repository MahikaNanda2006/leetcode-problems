class Solution {
    private static final Map<Character, String> DIGIT_TO_LETTERS = Map.of('2', "abc", '3', "def",'4', "ghi", '5', "jkl",'6', "mno", '7', "pqrs",'8', "tuv", '9', "wxyz");
    public List<String> letterCombinations(String digits) 
    {
        //1. Creation of the result List
        List<String> result =  new ArrayList<>(); //Here we have created a list for the result
        //2. Edge case
        if (digits == null || digits.isEmpty()) return result; //So if the original digits is empty, it returns an empty result.
        //3. Backtrack
        backtrack(digits, 0, new StringBuilder(), result); //We call backtrack for the first time by calling digits (the full string of numbers), setting the index at 0, and giving it the list result to store it's stuff in. We also give it a path to use while constucting the stuff that finally gets added to result. We do this in StringBuilder because it's faster than normal string
        //4. Return the result
        return result; //Once all the backtrack stuff is done, it will return the result
    }
    private void backtrack(String digits, int index, StringBuilder path, List<String> result)
    {
        //1.Base Case
        if (index == digits.length())
        {
            result.add(path.toString());
            return; // Here, the return statement returns back to where the program left off - INSIDE the previous call of the same method, for the most part. Yep, that's what recursion is, baby!
        }
         //2.Recursive case
         char currentDigit = digits.charAt(index);
         String letters = DIGIT_TO_LETTERS.get(currentDigit);
         for (char letter : letters.toCharArray())
         {
            path.append(letter);
            backtrack(digits, index+1, path, result);
             path.deleteCharAt(path.length() - 1);
         }
    }
}