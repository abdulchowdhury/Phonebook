import java.io.FileWriter;
import java.util.Scanner;

public class Phonebook {
        public static void main(String[] args){
                Scanner keyboard = new Scanner(System.in);
                String Name = "";
                String PhoneNum = "";
      try {
          FileWriter Directory = new FileWriter("directory.txt");
          while (!Name.equals("ZZZ")) {
                  System.out.print("Enter name: ");
                Name = keyboard.nextLine();
                if (!Name.equals("ZZZ")) 
                  {
                    System.out.print("Enter Phone number: ");
                    PhoneNum = keyboard.nextLine();
                    Directory.write("Name: " + Name + " " + "\n"+ "Phone Number: " + PhoneNum + "\n");
                  }
                }
            Directory.close();
               }
        catch(Exception e)
               {
                   System.out.println("Message: " + e);
               }
        }
}
