package formatif.alpro;

import java.time.LocalDate;

public class MultiplicationMan extends Manusia {

    public MultiplicationMan(String jenisKelamin, LocalDate tanggalLahir, String tempatLahir, String golonganDarah, String nama, String warnaRambut) {
        super(jenisKelamin, tanggalLahir, tempatLahir, golonganDarah, nama, warnaRambut);
    }

    public int specialMultiplication(int number) {
        while (number >= 10) {
            number = multiplyDigits(number);
        }
        return number;
    }

    private int multiplyDigits(int number) {
        int product = 1;
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }
        return product;
    }
}
