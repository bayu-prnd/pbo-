public class Exception2 {
    public static void main (String[] args) {
        int i = 0;
        String greetings[] = {
            "Hello World!",
            "No, I mean it!",
            "HELLO WORLD!"
        };
        
        // Menggunakan .length agar looping berhenti sesuai jumlah isi array
        while(i < greetings.length) {
            try {
                System.out.println(greetings[i]);
                i++;
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Resetting index value");
                // Tidak perlu mereset i=0 lagi agar program tidak looping selamanya
            }
        }
    }
}