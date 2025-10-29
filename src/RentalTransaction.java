public class RentalTransaction {
    // Properties
    private String namaPelanggan;
    private Vehicle kendaraan;
    private int durasiHari;
    private double totalBiaya;

    // Constructor
    public RentalTransaction(String namaPelanggan, Vehicle kendaraan, int durasiHari) {
        this.namaPelanggan = namaPelanggan;
        this.kendaraan = kendaraan;
        this.durasiHari = durasiHari;
        this.totalBiaya = kendaraan.hargaPerHari * durasiHari; // hitung total biaya
    }

    // Method display rental details
    public void displayRentalDetails() {
        System.out.println("Rental untuk: " + namaPelanggan);
        System.out.println("Kendaraan: " + kendaraan.merk + " " + kendaraan.model +
                (kendaraan instanceof Car ? " (Mobil)" : " (Motor)"));
        System.out.println("Durasi: " + durasiHari + " hari");
        System.out.printf("Biaya per hari: Rp %, .0f\n", kendaraan.hargaPerHari);
        System.out.printf("Total biaya: Rp %, .0f\n", totalBiaya);
    }

    // Getters
    public double getTotalBiaya() {
        return totalBiaya;
    }

    public Vehicle getKendaraan() {
        return kendaraan;
    }
}