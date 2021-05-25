import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

    public class FileDirectory {
         public static void main(String[] args) throws FileNotFoundException 
         {
             Scanner fileRead = new Scanner(new File("directory.txt"));
             fileRead.useDelimiter("\f"); 

             System.out.println(fileRead.next()); 
     }
    }
