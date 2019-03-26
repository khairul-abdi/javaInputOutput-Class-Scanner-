//mengImport scanner ke program

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //deklarasi variabel

        String nama,alamat;
        int usia,gaji;

        //Membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        //Tampilan output ke user

        System.out.println("Pendapatan Karyawan PT.Programmer Kering");
        System.out.print("Nama Karyawan: ");
        //menggunakan scanner dan menyimpan apa yang diketik di variabel
        nama = keyboard.next();
        //Tampilan Output lagi
        System.out.print("Alamat : ");
        //menggunakan Scanner Lagi

        alamat = keyboard.next();

        System.out.print("Usia : ");
        usia = keyboard.nextInt();

        System.out.print("Gaji: ");
        gaji = keyboard.nextInt();

        //Menampilkan apa yang sudah simpan di variabel
        System.out.println("===========================");
        System.out.println("Nama Karyawan: "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Usia : "+usia+ " tahun");
        System.out.println("Gaji: Rp "+gaji);
    }
}
