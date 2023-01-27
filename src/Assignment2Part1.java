import com.shpp.cs.a.console.TextProgram;
import java.io.*;
public class Assignment2Part1 extends TextProgram {
    public void run()  {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        double a = 0;
        double  b= 0;
        double c = 0;
        try {
            System.out.println("Enter number a, b, c ");
            a = Double.parseDouble(  bufferedReader.readLine());
            b = Double.parseDouble(bufferedReader.readLine());
            c = Double.parseDouble(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
       double x = (b * b) - (4 * a * c);
        if (x> 0.0)
         {
         double r1 = (-b + Math.pow(x, 0.5)) / (2.0 * a);
         double r2 = (-b - Math.pow(x, 0.5)) / (2.0 * a);
         System.out.println("The roots are " + r1 + " and " + r2);
         }
         else if (x == 0.0)
         {
         double r1 = -b / (2.0 * a);
         System.out.println("The root is " + r1);
         }
         else
         {
         System.out.println("Roots are not real.");
         }
    }
}

