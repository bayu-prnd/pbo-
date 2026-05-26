class Mahasiswa {
    String nim;
    String nama;

    void inputData(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    void tampilData(){
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
    }
}