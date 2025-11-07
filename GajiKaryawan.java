import java.util.Scanner;

public class GajiKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Deklarasi variabel
        char golongan;
        int jamLembur;
        double gajiPokok = 0;
        double persenLembur = 0;
        double gajiLembur = 0;
        double totalGaji = 0;

        // Input golongan
        System.out.print("Masukkan golongan (A/B/C): ");
        golongan = input.next().toUpperCase().charAt(0);

        // Input jam lembur
        System.out.print("Masukkan jam lembur: ");
        jamLembur = input.nextInt();

        // Tentukan gaji pokok berdasarkan golongan
        if (golongan == 'A') {
            gajiPokok = 5000000;
        } else if (golongan == 'B') {
            gajiPokok = 6500000;
        } else if (golongan == 'C') {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid.");
            input.close();
            return;
        }

        // Tentukan persentase lembur berdasarkan jam lembur
        if (jamLembur == 1) {
            persenLembur = 0.30;
        } else if (jamLembur == 2) {
            persenLembur = 0.32;
        } else if (jamLembur == 3) {
            persenLembur = 0.34;
        } else if (jamLembur == 4) {
            persenLembur = 0.36;
        } else if (jamLembur >= 5) {
            persenLembur = 0.38;
        } else if (jamLembur == 0) {
            persenLembur = 0;
        } else {
            System.out.println("Jam lembur tidak valid.");
            input.close();
            return;
        }

        // Hitung gaji lembur dan total gaji
        gajiLembur = gajiPokok * persenLembur;
        totalGaji = gajiPokok + gajiLembur;

        // Output hasil
        System.out.println("\n--- Rincian gaji karyawan ---");
        System.out.println("Golongan: " + golongan);
        System.out.println("Gaji pokok: Rp " +String.format("%,.0f", gajiPokok));
        System.out.println("Jam lembur: " + jamLembur + " jam");
        System.out.println("Gaji lembur: Rp " + String.format("%,.0f", gajiLembur));
        System.out.println("----------------------------------");
        System.out.println("Total penghasilan: Rp " + String.format("%,.0f", totalGaji));
        
        input.close();

    }
}