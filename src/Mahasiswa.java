public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private double ipk;

    public Mahasiswa(String nim, String nama, String jurusan, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{nim='" + nim + "', nama='" + nama + "', jurusan='" + jurusan + "', ipk=" + ipk + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Mahasiswa)) return false;
        Mahasiswa other = (Mahasiswa) obj;
        return this.nim.equals(other.nim);
    }

    @Override
    public int hashCode() {
        return nim.hashCode();
    }
}