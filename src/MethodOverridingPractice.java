public class MethodOverridingPractice {
    public static void main(String[] args) {
        System.out.println("=== BASIC METHOD OVERRIDING ===");

        Mahasiswa m1 = new Mahasiswa("2024001", "Budi", "Informatika", 3.75);
        System.out.println(m1);

        Mahasiswa m2 = new Mahasiswa("2024001", "Budi", "Informatika", 3.75);
        System.out.println("m1.equals(m2): " + m1.equals(m2));
        System.out.println("m1 == m2: " + (m1 == m2));

        System.out.println("\n=== OVERRIDING WITH SUPER ===");

        Dosen d1 = new Dosen("198901001", "Dr. Sarah", "Informatika", "PBO", 10);
        d1.displayInfo();

        DosenProfessor dp1 = new DosenProfessor("198901001", "Prof. Sarah", "Informatika", "PBO", 15, "Profesor Utama", 20);
        dp1.displayInfo();

        System.out.println("\n=== COVARIANT RETURN TYPES ===");

        Dosen original = new Dosen("198901002", "Dr. Andi", "Sistem Informasi", "Basis Data", 8);
        Dosen cloned = original.clone();

        System.out.println("Clone berhasil dengan type yang lebih spesifik");
        System.out.println("original != clone : " + (original != cloned));
        System.out.println("original.equals(clone): " + original.equals(cloned));

        System.out.println("\n=== OVERRIDING RULES ===");
        System.out.println("Widening access modifier: ALLOWED");
        System.out.println("Narrowing access modifier: COMPILE ERROR");
        System.out.println("Same return type: VALID");
        System.out.println("Covariant return type: VALID");
        System.out.println("Unrelated return type: COMPILE ERROR");
        System.out.println("Cannot override final method: COMPILE ERROR");
    }
}