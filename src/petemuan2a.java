//mengImport scanner ke program

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import java.util.Scanner;

public class petemuan2a {

    public static void main(String[] args) {
        //deklarasi variabel

        String nama,alamat;
        int usia,gaji,kerja,tot;

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

        gaji=200000;

        System.out.print("Jumlah Hari Kerja: ");
        kerja = keyboard.nextInt();

        //Menampilkan apa yang sudah simpan di variabel
        System.out.println("=================================");
        System.out.println("Nama Karyawan   : "+nama);
        System.out.println("Alamat          : "+alamat);
        System.out.println("Usia            : "+usia+ " tahun");
        tot= gaji * kerja;
//        System.out.println("Total Gaji      : "+tot);

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        System.out.printf("Total Gaji       : %s %n", kursIndonesia.format(tot));
    }
}
