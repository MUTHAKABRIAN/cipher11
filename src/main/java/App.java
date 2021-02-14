import java.util.Scanner;

public class App {
    public static void main (String [] args){
        Scanner myScanner = new Scanner(System.in);
        boolean runProgram =true;
        while (runProgram){
            System.out.println("Welcome to Caesar Cipher");
            System.out.println("**************");
            System.out.println("Select Encrypt or Decrypt or Exit to leave App");

            String navigationChoice =myScanner.nextLine();

            if (navigationChoice.equals("Encrypt")){
                System.out.println("Enter Message you want to Encrypt? ");
                String input =myScanner.nextLine();

                System.out.println("Enter key");
                int key =myScanner.nextInt();
                Cipher caesar =new Cipher(input ,key);
                String encrypt =Cipher.encrypt(caesar);
                System.out.println("ENCRYPTED MESSAGE:"+encrypt);


            }else if(navigationChoice.equals("Decrypt")){

                System.out.println("Enter the message to decrypt");
                String decode = myScanner.nextLine();
                System.out.println("Enter key");
                int key =myScanner.nextInt();
                Cipher caesar =new Cipher(decode,key);
                String decrypt =Cipher.decrypt(caesar);
                System.out.println("DECRYPTED MESSAGE:"+decrypt);


            }else if (navigationChoice.equals("exit")){
                runProgram=false;
            }
        }
    }
}
