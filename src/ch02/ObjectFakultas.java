package ch02;

public class ObjectFakultas {
    public static void main(String[] args) {
        Fakultas fk1 = new Fakultas();
        Fakultas fk2 = new Fakultas();

        fk1.Nama = "Sains dan Teknologi";
        fk1.JumlahMahasiswa = 2354;
        
        fk2.Nama = "Psikologi";
        fk2.JumlahMahasiswa = 1202;
        
        System.out.println("Fakultas " + fk1.getNama() +
        ": " + fk1.getJumlahMahasiswa());
        System.out.println("Fakultas " + fk2.getNama() +
        ": " + fk2.getJumlahMahasiswa());
    }
}