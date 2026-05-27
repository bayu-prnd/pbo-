public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.transferUang(250000, "5432109876");
        bank.transferUang(750000, "1347249358", "Mandiri", " Bayar Kuliah"); 
        bank.sukuBunga();

        System.out.println();

        BankMandiri mandiri = new BankMandiri();
        mandiri.transferUang(450000, "9472836584", "Mandiri"); 
        mandiri.sukuBunga();

        System.out.println();

        BankBNI bni = new BankBNI();
        bni.transferUang(850000, "7329847624", "BNI");
        bni.sukuBunga();

        System.out.println();

        BankBCA bca = new BankBCA();
        bca.transferUang(980000, "926372836458", "BCA");
        bca.sukuBunga();
    }
}