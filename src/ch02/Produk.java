package ch02;

import java.util.Date;

public class Produk {
    String Barcode;
    String Nama;
    Date tanggalKedaluarsa;
    double Harga;
    
    public String getBarcode() {
        return Barcode;
    }
    public String getNama() {
        return Nama;
    }
    public Date gettanggalKedaluarsa() {
        return tanggalKedaluarsa;
    }
    public double getHarga() {
        return Harga;
    }
}