public class CobaException4 {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a","b","c"};
        try {
            // Mengubah pembagi menjadi 2 agar tidak terjadi ArithmeticException (dibagi 0)
            System.out.println (bil/2);
            
            // Mengubah pemanggilan b[3] menjadi b[2] karena isi array b hanya ada 3 (indeks 0, 1, 2)
            System.out.println(b[2]);
        }
        catch (ArithmeticException e) {
            System.out.println("Terjadi Aritmatika error");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Melebihi jumlah array");
        }
        catch(Exception e) {
            System.out.println(" ini menghandle error yang terjadi");
        }
    }
}