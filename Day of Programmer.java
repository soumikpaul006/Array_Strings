import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) 
    {
        
        String newDate= "";
       
        if(1700<=year && year<=1917)
        {
                if(year%4==0)
                {
                   //12
                   int dd=12;
                   int mm=9;
                   
                   newDate= dd+"."+String.format("%02d",mm)+"."+year;
                }
                else
                {
                    
                    //13
                    int dd=13;
                    int mm=9;
                    newDate= dd+"."+String.format("%02d",mm)+"."+year;
                }
        }
        else if(year>=1919)
        {
            if((year%400==0)||(year%4==0 && year%100!=0))
            {
               //12
                int dd=12;
                int mm=9;
                 newDate= dd+"."+String.format("%02d",mm)+"."+year;
            }
            else
            {
                //13
                int dd=13;
                int mm=9;
                newDate= dd+"."+String.format("%02d",mm)+"."+year;
            }
        }
        else if(year==1918)
        {

            int mm=9;
            newDate= 26+"."+String.format("%02d",mm)+"."+year;

        }
        return newDate;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
