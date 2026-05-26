class NilaiMahasiswa extends Mahasiswa {

    int nilai;
    char grade;
    String keterangan;

    void setNilai(int nilai){
        this.nilai = nilai;

        if(nilai >= 80 && nilai <= 100){
            grade = 'A';
            keterangan = "Lulus";
        }
        else if(nilai >= 70){
            grade = 'B';
            keterangan = "Lulus";
        }
        else if(nilai >= 60){
            grade = 'C';
            keterangan = "Lulus";
        }
        else if(nilai >= 50){
            grade = 'D';
            keterangan = "Tidak Lulus";
        }
        else if(nilai >= 0){
            grade = 'E';
            keterangan = "Tidak Lulus";
        }
        else{
            System.out.println("Input nilai anda salah");
        }
    }

    void tampilNilai(){
        System.out.println("Nilai : " + nilai);
        System.out.println("Grade : " + grade);
        System.out.println("Status: " + keterangan);
    }
}