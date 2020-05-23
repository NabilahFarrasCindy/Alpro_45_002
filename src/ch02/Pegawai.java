package ch02;

public class Pegawai {
    String Nik;
    String Nama;
    String Jabatan;
    String isAktif;
    
    public String getNik() {
        return Nik;
    }
    public String getNama() {
        return Nama;
    }
    public String getJabatan() {
        return Jabatan;
    }
    public String getisAktif() {
        return isAktif;
    }
    public void cetak() {
        System.out.println("NIK : " + Nik);
        System.out.println("Nama : " + Nama);
        System.out.println("Jabatan : " + Jabatan);
        System.out.println("Status : " + isAktif);
    }
}