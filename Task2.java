 import java.io.BufferedReader;
 import java.io.FileReader;
 import java.io.IOException;
 import java.util.Scanner;

 public class Task2 {

     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.print("Enter file path: ");
         String filePath = sc.nextLine();

         int lineCount = 0;
         int wordCount = 0;
         int charCount = 0;

         BufferedReader br = null;

         // -------- File Analysis --------
         try {
             br = new BufferedReader(new FileReader(filePath));
             String line;

             while ((line = br.readLine()) != null) {
                 lineCount++;
                 charCount += line.length();

                 if (!line.trim().isEmpty()) {
                     String[] words = line.trim().split("\\s+");
                     wordCount += words.length;
                 }
             }

             System.out.println("\n--- File Analysis ---");
             System.out.println("Lines      : " + lineCount);
             System.out.println("Words      : " + wordCount);
             System.out.println("Characters : " + charCount);

         } catch (IOException e) {
             System.out.println("Error reading file: " + e.getMessage());
             sc.close();
             return;
         } finally {
             try {
                 if (br != null)
                     br.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

         // -------- Word Search --------
         System.out.print("\nEnter word to search: ");
         String searchWord = sc.nextLine();
         int occurrences = 0;

         try {
             br = new BufferedReader(new FileReader(filePath));
             String line;

             while ((line = br.readLine()) != null) {
                 String[] words = line.split("\\s+");
                 for (int i = 0; i < words.length; i++) {
                     if (words[i].equalsIgnoreCase(searchWord)) {
                         occurrences++;
                     }
                 }
             }

             System.out.println("Word '" + searchWord + "' found " + occurrences + " times.");

         } catch (IOException e) {
             System.out.println("Error searching word: " + e.getMessage());
         } finally {
             try {
                 if (br != null)
                     br.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

         sc.close();
     }
 }
