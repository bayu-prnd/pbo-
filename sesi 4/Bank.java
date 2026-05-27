class Bank {

    void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer RP" + jumlah + " ke rekening " + rekeningTujuan);
    }

    // PENANGKAL GARIS KUNING: Memberitahu VS Code agar tidak rewel
    @SuppressWarnings("unused") 
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        int biaya = hitungBiaya(bankTujuan);
        System.out.println("Transfer RP" + jumlah + " ke rekening " 
                + rekeningTujuan + " di bank: " + bankTujuan + " | Biaya: Rp" + biaya);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        int biaya = hitungBiaya(bankTujuan);
        System.out.println("Transfer RP" + jumlah + " ke rekening "
                + rekeningTujuan + " di bank: "
                + bankTujuan + " | Berita: " + berita + " | Biaya: Rp" + biaya);
    }

    void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }

    int hitungBiaya(String bankTujuan) {
        if (bankTujuan.equalsIgnoreCase("") || bankTujuan.equalsIgnoreCase("Standard")) {
            return 0;
        } else {
            return 5000;
        }
    }
}