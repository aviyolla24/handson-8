public class Car extends Vehicle {
    private int jumlahPenumpang;
    private String transmisi;
    private boolean adaAC;

    public Car(String merk, String model, int tahun, String noPolisi, double hargaPerHari, String status,
               int jumlahPenumpang, String transmisi, boolean adaAC) {
        super(merk, model, tahun, noPolisi, hargaPerHari, status);
        this.jumlahPenumpang = jumlahPenumpang;
        this.transmisi = transmisi;
        this.adaAC = adaAC;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tipe: Mobil");
        System.out.println("Jumlah Penumpang: " + jumlahPenumpang);
        System.out.println("Transmisi: " + transmisi);
        System.out.println("AC: " + (adaAC ? "Ya" : "Tidak"));
    }
}