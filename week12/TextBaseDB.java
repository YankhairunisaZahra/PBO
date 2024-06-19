package week12;
import java.util.ArrayList;


public class TextBasedDB 
{

    private ArrayList<String> data;

    public TextBasedDB() 
    {
        data = new ArrayList<>();
    }

    public void insertData(String newData) 
    {
        data.add(newData);
        System.out.println("Data berhasil ditambahkan.");
    }

    public void updateData(int index, String updatedData) 
    {
        if (index >= 0 && index < data.size()) 
        {
            data.set(index, updatedData);
            System.out.println("Data berhasil diperbarui.");
        } 
        else 
        {
            System.out.println("Indeks tidak valid. Update gagal.");
        }
    }

    public void deleteData(int index) 
    {
        if (index >= 0 && index < data.size()) 
        {
            data.remove(index);
            System.out.println("Data berhasil dihapus.");
        } 
        else 
        {
            System.out.println("Indeks tidak valid. Hapus gagal.");
        }
    }

    public void showData() 
    {
        if (data.isEmpty()) 
        {
            System.out.println("Tidak ada data yang tersedia.");
        } 
        else 
        {
            System.out.println("Data saat ini:");
            for (int i = 0; i < data.size(); i++) 
            {
                System.out.println(i + ": " + data.get(i));
            }
        }
    }
}