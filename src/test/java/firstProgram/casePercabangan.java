package firstProgram;

import java.util.Scanner;

public class casePercabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nilai : ");
        int nilai = scanner.nextInt();

        char grade;

        switch (nilai / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.println("Nilai huruf: " + grade);
    }
}

