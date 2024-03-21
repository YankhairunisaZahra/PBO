package week1;

public class Aksimahasiswa
{
    public static void main(String[] args)
    {
        Mahasiswa mhs1 = new Mahasiswa();//mhs nama objek dibuat dengan Mahasiswa (seperti tipe data jadi nyimpen nya di Mahasiswa)
        mhs1.nim = "A11.2000.0000";
        mhs1.nama = "Tania";
        mhs1.usia = 19;
        mhs1.getIdentitas();
        mhs1.belajar();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "A11.2022.14328";
        mhs2.nama = "Yankhairunisa";
        mhs2.usia = 19;
        mhs2.getIdentitas();
        mhs2.belajar();

    }
}