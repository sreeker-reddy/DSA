// Last updated: 3/26/2026, 1:47:59 AM
public class Solution {
    public string ReorderSpaces(string text) {
    int spaces = 0;
	string[] words = text.Split(new char[]{' '}, StringSplitOptions.RemoveEmptyEntries);
	int wordCount = words.Length;

	for(int i = 0; i < text.Length; i++)
	{
		if(text[i] == ' ')
		{
			spaces++;
		}
	}

	if(wordCount == 1)
	{
		return words[0] + new string(' ', spaces);
	}

	int evenSpaceCount = spaces / (wordCount - 1);
	int remainder = spaces % (wordCount - 1);

	string evenSpace = new string(' ', evenSpaceCount);
	string result = string.Join(evenSpace, words);        
	result += new String(' ', remainder);

	return result;
    }
}