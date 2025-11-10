import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    private String nama;
    private int jumlah;
    private double hargaSatuan;

    public Barang(String nama, int jumlah, double hargaSatuan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public double getTotalHarga() {
        return jumlah * hargaSatuan;
    }
}

public class FilkomMart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Barang> daftarBarang = new ArrayList<>();

        System.out.println("=== APLIKASI FILKOMMART ===");
        System.out.print("Masukkan jumlah jenis barang yang dibeli: ");
        int jumlahBarang = input.nextInt();
        input.nextLine(); 

        
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("\nBarang ke-" + (i + 1));
            System.out.print("Nama barang       : ");
            String nama = input.nextLine();

            System.out.print("Jumlah satuan     : ");
            int jumlah = input.nextInt();

            System.out.print("Harga satuan (Rp) : ");
            double harga = input.nextDouble();
            input.nextLine(); 

            daftarBarang.add(new Barang(nama, jumlah, harga));
        }

        System.out.println("\n===== STRUK BELANJA FILKOMMART =====");
        System.out.printf("%-20s %-10s %-15s %-15s%n", 
            "Nama Barang", "Jumlah", "Harga Satuan", "Total Harga");
        System.out.println("-------------------------------------------------------------");

        double totalBelanja = 0;
        for (Barang b : daftarBarang) {
            System.out.printf("%-20s %-10d Rp%-14.2f Rp%-14.2f%n",
                b.getNama(), b.getJumlah(), b.getHargaSatuan(), b.getTotalHarga());
            totalBelanja += b.getTotalHarga();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-30s : Rp%.2f%n", "TOTAL BELANJA", totalBelanja);
        System.out.println("=============================================");
        System.out.println("Terima kasih telah berbelanja di FilkomMart!");

        input.close();
    }
}
q
