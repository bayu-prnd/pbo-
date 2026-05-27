import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            
            // ==========================================
            // BAGIAN MAHASISWA
            // ==========================================
            System.out.println("--- Input Data Mahasiswa ---");
            System.out.print("Nama Mahasiswa: ");
            String namaMhs = reader.nextLine();
            System.out.print("Alamat Mahasiswa: ");
            String alamatMhs = reader.nextLine();
            
            Student objMahasiswa = new Student(namaMhs, alamatMhs);

            System.out.print("Berapa banyak mata kuliah yang diambil? ");
            int totalMatkul = Integer.parseInt(reader.nextLine()); 

            for (int k = 0; k < totalMatkul; k++) {
                System.out.print("Nama Mata Kuliah ke-" + (k + 1) + ": ");
                String matkul = reader.nextLine();
                System.out.print("Nilai: ");
                int nilai = Integer.parseInt(reader.nextLine());
                
                objMahasiswa.addCourseGrade(matkul, nilai);
            }

            // ==========================================
            // BAGIAN DOSEN
            // ==========================================
            System.out.println("\n--- Input Data Dosen ---");
            System.out.print("Nama Dosen: ");
            String namaDosen = reader.nextLine();
            System.out.print("Alamat Dosen: ");
            String alamatDosen = reader.nextLine();
            
            Teacher objDosen = new Teacher(namaDosen, alamatDosen);

            System.out.print("Masukkan Mata Kuliah yang diampu: ");
            String matkulDiampu = reader.nextLine();
            
            if (objDosen.addCourse(matkulDiampu)) {
                System.out.println("Mata kuliah " + matkulDiampu + " berhasil ditambahkan.");
            } else {
                System.out.println("Gagal! Mata kuliah sudah ada.");
            }

            // ==========================================
            // BAGIAN PRINT RINGKASAN OUTPUT
            // ==========================================
            System.out.println("\n--- Ringkasan Data ---");
            System.out.println(objMahasiswa.toString());
            objMahasiswa.printGrades();
            System.out.printf("Rata-rata Nilai: %.2f\n", objMahasiswa.getAverageGrade());

            System.out.println("\n" + objDosen.toString());

        } catch (NumberFormatException e) {
            System.out.println("Terjadi kesalahan: Pastikan input nilai berupa angka!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}