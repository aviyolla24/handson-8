public class Dosen extends Pegawai {
    private String mataKuliah;
    private int pengalamanMengajar;

    public Dosen(String nip, String nama, String jurusan, String mataKuliah, int pengalamanMengajar) {
        super(nip, nama, jurusan);
        System.out.println("Dosen constructor called");
        this.mataKuliah = mataKuliah;
        this.pengalamanMengajar = pengalamanMengajar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mata Kuliah: " + mataKuliah);
        System.out.println("Pengalaman: " + pengalamanMengajar + " tahun");
    }

    @Override
    public Dosen clone() {
        return new Dosen(this.nip, this.nama, this.jurusan, this.mataKuliah, this.pengalamanMengajar);
    }

    @Override
    public void methodProtected() {
        System.out.println("Public access in subclass (widened access)");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dosen)) return false;
        Dosen other = (Dosen) obj;
        return this.nip.equals(other.nip);
    }
}