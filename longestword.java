import java.util.*;

public class longestword
{
    public static int longestword(String str)
    {
        int n = str.length();
        int res = 0, curr_len = 0;
        for (int i = 0; i < n; i++)
        {
            if (str.charAt(i) != ' ')
                curr_len++;
            else
            {
                res = Math.max(res, curr_len);
                curr_len = 0;
            }
        }
        return Math.max(res, curr_len);
    }

    public static void main(String[] args)
    {
        String s = "I am an Employee at Codoid";
        System.out.println(longestword(s));
    }
}