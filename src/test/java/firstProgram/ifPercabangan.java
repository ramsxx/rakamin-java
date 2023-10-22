package firstProgram;

import java.util.Scanner;
public class ifPercabangan {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter Password : ");
        String validPassword = "password";

        //jika benar maka selamat datang bos
        //jika salah (else) maka error message)
        if (password.equals(validPassword)){
            System.out.println("Selamat Datang BOSS !!");
        } else {
            System.out.println("Password salah, Coba Lagi!!");
        }
        System.out.println("Terimakasih sudah menggunakan applikasi kami !!");
    }

    public static String prompt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
