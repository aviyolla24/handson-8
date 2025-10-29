public class Motorcycle extends Vehicle {
    private String jenis;
    private int kapasitasMesin;

    public Motorcycle(String merk, String model, int tahun, String noPolisi, double hargaPerHari, String status,
                      String jenis, int kapasitasMesin) {
        super(merk, model, tahun, noPolisi, hargaPerHari, status);
        this.jenis = jenis;
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tipe: Motor");
        System.out.println("Jenis: " + jenis);
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " CC");
    }
}