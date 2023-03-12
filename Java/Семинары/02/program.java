// 1. Создать метод, который проверяет, является ли строка палиндромом.
// Палиндром - шалаш

// import java.util.Arrays;
// import java.util.Scanner;
// public class program{
//     public static void main(String[] args){
//         Scanner iScanner = new Scanner(System.in);
//         System.out.print("Write line: ");
//         String str = iScanner.nextLine();
//         iScanner.close();
//         int a = str.length();
//         char[] result = str.toCharArray();
//         int count = 0;
//         int count_2 = 1;
//         char[] char_array = new char[a];
//         while(count <= a/2){
//             char temp = str.charAt(count);
//             char temp_2 = str.charAt(a-count_2);
//             char_array[a-count_2] = temp;
//             char_array[count] = temp_2;
//             count++;
//             count_2++;
//         }
//         if((Arrays.equals(result, char_array)) == true){
//             System.out.println("The string is a palindrome");
//         }
//         else{
//             System.out.println("The string is not a palindrome");
//         }
//     }
// }

// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
 
public class program{
    public static void main(String[] args)
    {
        File file = new File("file.txt");
        String text = "TEST";
 
        try (PrintWriter out = new PrintWriter(file, StandardCharsets.UTF_8))
        {
            int count = 0;
            while(count != 100){
            out.print(text + "\n");
            count++;
            }
            
            System.out.println("Successfully written data to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
