import static java.lang.Math.*;

import java.util.Scanner;
import java.io.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        int a, b, c;       // Start of Task 1.1
        int comp1, comp2, comp3;
        System.out.println("Task 1.1 \nEnter an integer \"a\" and press {Enter}:");
        Scanner in1 = new Scanner(System.in);
        a = in1.nextInt();
        System.out.println("Enter an integer \"b\" and press {Enter}:");
        Scanner in2 = new Scanner(System.in);
        b = in2.nextInt();
        System.out.println("Enter an integer \"c\" and press {Enter}:");
        Scanner in3 = new Scanner(System.in);
        c = in3.nextInt();

        if (a % 2 == 0) {
            comp1 = a * b / c;
            System.out.println("a*b/c= " + comp1);
        } else if (((a + c) % 2 == 0) || (b + c) % 2 == 0) {
            comp2 = (int) Math.pow(a, c);
            System.out.println("\"a\" in degree \"c\"= " + comp2);
        } else {
            comp3 = a + b - c;
            System.out.println("a+b-c= " + comp3);  //End of Task 1.1
        }

        long fact = 1;
        int n; // Start of Task 2.1
        System.out.println("\n\n\nTask 2.1 \nEnter an natural integer \"n\" from 0 to 20 to get \"n!\" and press {Enter}:");
        Scanner in4 = new Scanner(System.in);
        n = in4.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            fact = fact * (n - i);
        }
        System.out.println(n + "!= " + fact);//End of Task 2.1

        int mirror, leng, inv = 0, invleng;// Start of Task 2.2
        System.out.println("\n\n\nTask 2.2 \nEnter an integer the number you want to invoke and press {Enter}:");
        Scanner in5 = new Scanner(System.in);
        mirror = in5.nextInt();
        leng = (int) (Math.log10(mirror) + 1);
        invleng = leng;
        int[] arraytask_2_2 = new int[leng];
        for (int i = 0; i < leng; i++) {
            arraytask_2_2[i] = mirror % 10;
            mirror = mirror / 10;
            inv = inv + arraytask_2_2[i] * (int) Math.pow(10, invleng - 1);
            invleng--;
        }
        System.out.println("Invoke number is: " + inv); // End of Task 2.2


        int index1_task_3_1, index2_task_3_1; // Start of Task 3.1
        double math_length;
        System.out.println("\n\n\nTask 3.1 \nEnter an array of data separating the elements \",\"! After you complete the data entry, press Enter (ex. a1,a2,a3,..,a999)");
        Scanner in6 = new Scanner(System.in);
        String temp = in6.next(); // enter string line in "temp"
        String[] Str_line = temp.split(",");
        int[] Str_line_int1 = new int[Str_line.length];
        for (int i = 0; i < Str_line.length; i++) {                       // parser from string array to interger
            Str_line_int1[i] = Integer.parseInt(Str_line[i]);
        }
        math_length = (double) Str_line.length / 2;
        index1_task_3_1 = (int) Math.ceil(math_length);
        System.out.println(index1_task_3_1);
        int[] Str_line_int2 = new int[Str_line.length];
        for (int i = 0, j = index1_task_3_1; j < Str_line.length; i++, j++) {                       // parser from string array to interger
            Str_line_int2[j] = Str_line_int1[i];
        }
        for (int i = index1_task_3_1, j = 0; i < Str_line.length; i++, j++) {                       // parser from string array to interger
            Str_line_int2[j] = Str_line_int1[i];
        }
        System.out.print("New array is: {");
        for (int j = 0; j < Str_line.length; j++) {
            System.out.print(Str_line_int2[j]);
            if (j+1<Str_line.length){
                System.out.print(",");
            }
        }
        System.out.print("}");
        //for (String retval : Str_line.split(",")) {
        //    System.out.println(retval);
        //}
        //int[] arraytask3_1 = new int[index_task_3_1];
    }
}
