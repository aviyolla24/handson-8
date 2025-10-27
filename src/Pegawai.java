public class Pegawai {
    protected String nip;
    protected String nama;
    protected String jurusan;

    public Pegawai(String nip, String nama, String jurusan) {
        System.out.println("Pegawai constructor called");
        this.nip = nip;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void displayInfo() {
        System.out.println("=== Info Pegawai ===");
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }

    public Pegawai clone() {
        return new Pegawai(this.nip, this.nama, this.jurusan);
    }

    protected void methodProtected() {
        System.out.println("Protected method in Pegawai");
    }

    public final void calculateSalary() {
        System.out.println("Menghitung gaji pegawai...");
    }

    @Override
    public String toString() {
        return "Pegawai{nip='" + nip + "', nama='" + nama + "', jurusan='" + jurusan + "'}";
    }
}