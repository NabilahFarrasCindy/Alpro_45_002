package ch02;

public class Mahasiswa {
    String Nim;
    String Nama;
    String Alamat;
    String Hp;
    
    public String getNim() {
        return Nim;
    }
    public String getNama() {
        return Nama;
    }
    public String getAlamat() {
        return Alamat;
    }
    public String getHp() {
        return Hp;
    }
    public void cetak() {
        System.out.println("NIM : " + Nim);
        System.out.println("Nama : " + Nama);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Hp : " + Hp);
    }
}