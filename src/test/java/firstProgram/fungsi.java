package firstProgram;

import firstProgram.namaKu;
import contoh.bedaPackage;
public class fungsi {
    public static void  main (String []args) {
        int x = 10;
        int y = 5;
        int z = 5;

        namaKu.nama("Rahmani");
        bedaPackage.bedaPackage("Budi");

        tambah(x,y);
        tambah(y,z);
        tambah(x,z);

        kali(x,y);
        kali(y,z);
        kali(x,z);

        bagi(x,y);
        bagi(y,z);
        bagi(x,z);
    }

    public static int tambah (int a, int b){
        int hasilTambah = a+b;
        System.out.println("Hasil tambah "+a+" dan "+b+" adalah :"+ hasilTambah);
        return hasilTambah;
    }
    public static int kali (int a, int b){
        int hasilKali = a*b;
        System.out.println("Hasil kali "+a+" dan "+b+" adalah :"+ hasilKali);
        return hasilKali;
    }
    public static int bagi (int a, int b){
        int hasilBagi = a/b;
        System.out.println("Hasil bagi "+a+" dan "+b+" adalah :"+ hasilBagi);
        return hasilBagi;
    }

}
