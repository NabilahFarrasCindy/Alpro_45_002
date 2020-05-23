package ch02;

import java.util.Date;

public class Obat {
    String Barcode;
    String Nama;
    Date tanggalKadaluarsa;
    double Harga;
    
    public String getBarcode() {
        return Barcode;
    }
    public String getNama() {
        return Nama;
    }
    public String gettanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    public String getHarga() {
        return Harga;
    }
}