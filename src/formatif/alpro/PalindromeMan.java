package formatif.alpro;

import java.time.LocalDate;

public class PalindromeMan extends Manusia {

    public PalindromeMan(String jenisKelamin, LocalDate tanggalLahir, String tempatLahir, String golonganDarah, String nama, String warnaRambut) {
        super(jenisKelamin, tanggalLahir, tempatLahir, golonganDarah, nama, warnaRambut);
    }

    public boolean isPotentialPalindrome(String word) {
        int[] charCount = new int[256];
        for (char c : word.toCharArray()) {
            charCount[c]++;
        }

        int oddCount = 0;
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }

    public String makePalindrome(String word) throws Exception {
        if (!isPotentialPalindrome(word)) {
            throw new Exception("Word cannot be made into a palindrome");
        }

        StringBuilder left = new StringBuilder();
        char middle = 0;
        for (char c : word.toCharArray()) {
            left.append(c);
        }

        StringBuilder right = new StringBuilder(left).reverse();
        return left.toString() + middle + right.toString();
    }
}
