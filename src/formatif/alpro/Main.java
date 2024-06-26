package formatif.alpro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            
            Manusia person = new Manusia("Laki-laki", LocalDate.of(2000, 1, 1), "Jakarta", "O", "Adam", "Hitam");
            System.out.println("Nama Awal: " + person.nama);
            person.ubahNama("Adam Maulana");
            System.out.println("Nama Baru: " + person.nama);
            person.ubahWarnaRambut("Pirang");
            System.out.println("Warna Rambut Baru: " + person.warnaRambut);

           
            PalindromeMan palindromeMan = new PalindromeMan("Perempuan", LocalDate.of(1995, 5, 20), "Bandung", "A", "Anisa", "Hitam");
            System.out.println("Is 'app' a potential palindrome? " + palindromeMan.isPotentialPalindrome("app")); // true
            try {
                System.out.println("Palindrome of 'app': " + palindromeMan.makePalindrome("app")); // "pap"
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            
            SummationMan summationMan = new SummationMan("Laki-laki", LocalDate.of(1985, 8, 15), "Surabaya", "B", "Boy", "Hitam");
            System.out.println("Special summation of 123: " + summationMan.specialSummation(123)); // 6
            System.out.println("Special summation of 567: " + summationMan.specialSummation(567)); // 9

            
            MultiplicationMan multiplicationMan = new MultiplicationMan("Perempuan", LocalDate.of(1990, 3, 10), "Medan", "AB", "Caca", "Hitam");
            System.out.println("Special multiplication of 123: " + multiplicationMan.specialMultiplication(123)); // 6
            System.out.println("Special multiplication of 567: " + multiplicationMan.specialMultiplication(567)); // 0

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
