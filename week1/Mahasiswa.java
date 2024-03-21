package week1;

public class Mahasiswa
{
    String nim,nama;
    int usia;

    public void belajar()
    {
        System.out.println(nama + " belajar");
    }

    public void mainGame()
    {
        System.out.println(nama + " main game");
    }

    public void getIdentitas()
    {
        System.out.println("Nama Mahasiswa: "+nama);
        System.out.println("NIM Mahasiswa: "+nim);
        System.out.println("Usia: "+usia);
    }
}