import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution 
{

    static String timeConversion(String s) 
    {
        
         String[] str = s.split(":");
        int hrs = Integer.parseInt(str[0]);

        String min = str[1];
        String secPeriod = str[2];
        String sec = str[2].substring(0, secPeriod.length() - 2);
        String period = str[2].substring(secPeriod.length() - 2, secPeriod.length());

        String newTimeINString = "";

        if ((0 <= hrs && hrs < 12) && (period.equalsIgnoreCase("AM"))) {
            newTimeINString = String.format("%02d", hrs) + ":" + min + ":" + sec;
        } else if ((0 <= hrs && hrs < 12) && period.equalsIgnoreCase("PM")) {
            newTimeINString = (12 + hrs) + ":" + min + ":" + sec;

        } else if ((hrs == 12) && (period.equalsIgnoreCase("AM"))) {
            newTimeINString = "00" + ":" + min + ":" + sec;
        } else if ((hrs == 12) && (period.equalsIgnoreCase("PM"))) {
            newTimeINString = hrs + ":" + min + ":" + sec;
        }
        return newTimeINString;
    }
 

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
