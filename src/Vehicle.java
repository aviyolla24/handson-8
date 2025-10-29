public class Vehicle {
    // Properties
    protected String merk;
    protected String model;
    protected int tahun;
    protected String noPolisi;
    protected double hargaPerHari;
    protected String status;

    // Constructor
    public Vehicle(String merk, String model, int tahun, String noPolisi, double hargaPerHari, String status) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.noPolisi = noPolisi;
        this.hargaPerHari = hargaPerHari;
        this.status = status;
    }

    // Getter dan Setter
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Display info
    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("No Polisi: " + noPolisi);
        System.out.printf("Harga per hari: Rp %, .0f\n", hargaPerHari);
        System.out.println("Status: " + status);
    }
}