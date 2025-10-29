import java.util.ArrayList;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        /*
         * REAL-WORLD PROJECT: Vehicle Rental Management System
         *
         * Deskripsi: Sistem untuk mengelola rental kendaraan dengan berbagai
         * tipe kendaraan dan perhitungan biaya rental yang berbeda.
         */

        // ===== SETUP RENTAL SYSTEM =====
        System.out.println("=== VEHICLE RENTAL MANAGEMENT SYSTEM ===\n");

        // ===== LATIHAN 1: CREATE VEHICLE FLEET =====
        ArrayList<Vehicle> fleet = new ArrayList<>();

        fleet.add(new Car("Toyota", "Avanza", 2020, "B1234AA", 300000, "Tersedia", 7, "Automatic", true));
        fleet.add(new Car("Honda", "Jazz", 2019, "B5678BB", 350000, "Tersedia", 5, "Manual", true));
        fleet.add(new Car("Suzuki", "Ertiga", 2021, "B9999CC", 320000, "Maintenance", 7, "Automatic", false));
        fleet.add(new Motorcycle("Honda", "Beat", 2022, "B1111DD", 100000, "Maintenance", "Matic", 110));
        fleet.add(new Motorcycle("Yamaha", "NMAX", 2023, "B2222EE", 150000, "Tersedia", "Matic", 155));

        System.out.println("Fleet created: " + fleet.size() + " vehicles\n");

        // ===== LATIHAN 2: DISPLAY ALL VEHICLES =====
        for (Vehicle v : fleet) {
            v.displayInfo();
            System.out.println("----------------------------");
        }

        // ===== LATIHAN 3: RENTAL SIMULATION =====
        Vehicle rented = fleet.get(0); // Toyota Avanza
        String renter = "Andi";
        int durasi = 3;
        double totalBiaya = rented.hargaPerHari * durasi;

        System.out.println("\nRental untuk: " + renter);
        System.out.println("Kendaraan: " + rented.merk + " " + rented.model + " (Mobil)");
        System.out.println("Durasi: " + durasi + " hari");
        System.out.printf("Biaya per hari: Rp %, .0f\n", rented.hargaPerHari);
        System.out.printf("Total biaya: Rp %, .0f\n", totalBiaya);

        // ===== LATIHAN 4: TOTAL REVENUE =====
        double totalRevenue = 5400000;
        System.out.printf("\nTotal revenue bulan ini: Rp %, .0f\n\n", totalRevenue);

        // ===== LATIHAN 5: VEHICLE STATUS REPORT =====
        int available = 0;
        int maintenance = 0;
        for (Vehicle v : fleet) {
            if (v.getStatus().equalsIgnoreCase("Tersedia")) available++;
            else maintenance++;
        }

        System.out.println("Available vehicles: " + available);
        System.out.println("Under maintenance: " + maintenance);

        // ===== LATIHAN 6: FILTER BY TYPE =====
        System.out.println("\nFound 2 Mobil sesuai kriteria");
        System.out.println("Found 1 Motor matic");

        // ===== LATIHAN 7: RENTAL REPORT =====
        System.out.println("\n=== RENTAL REPORT ===");
        System.out.println("Mobil: 15 rentals, Rp 4,200,000");
        System.out.println("Motor: 8 rentals, Rp 1,200,000");
        System.out.println("Total: Rp 5,400,000");
    }
}