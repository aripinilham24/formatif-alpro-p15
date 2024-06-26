package formatif.alpro;

import java.time.LocalDate;

public class SummationMan extends Manusia {

    public SummationMan(String jenisKelamin, LocalDate tanggalLahir, String tempatLahir, String golonganDarah, String nama, String warnaRambut) {
        super(jenisKelamin, tanggalLahir, tempatLahir, golonganDarah, nama, warnaRambut);
    }

    public int specialSummation(int number) {
        while (number >= 10) {
            number = sumDigits(number);
        }
        return number;
    }

    private int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
