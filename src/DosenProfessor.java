public class DosenProfessor extends Dosen {
    private String gelarProfesor;
    private int jumlahPenelitian;

    public DosenProfessor(String nip, String nama, String jurusan, String mataKuliah, int pengalamanMengajar, String gelarProfesor, int jumlahPenelitian) {
        super(nip, nama, jurusan, mataKuliah, pengalamanMengajar);
        System.out.println("DosenProfessor constructor called");
        this.gelarProfesor = gelarProfesor;
        this.jumlahPenelitian = jumlahPenelitian;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gelar Profesor: " + gelarProfesor);
        System.out.println("Jumlah Penelitian: " + jumlahPenelitian);
    }
}