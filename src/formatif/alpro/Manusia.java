package formatif.alpro;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Manusia {

    public String jenisKelamin;
    public LocalDate tanggalLahir;
    public String tempatLahir;
    public String golonganDarah;
    public String nama;
    public String warnaRambut;

    private static final List<String> validasiGolonganDarah = Arrays.asList("O", "A", "B", "AB");

    public Manusia(String jenisKelamin, LocalDate tanggalLahir, String tempatLahir, String golonganDarah, String nama, String warnaRambut) {
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.tempatLahir = tempatLahir;
        setGolonganDarah(golonganDarah);
        this.nama = nama;
        this.warnaRambut = "Hitam";
    }
    
    public void setGolonganDarah(String golonganDarah) {
        if(validasiGolonganDarah.contains(golonganDarah)) {
            this.golonganDarah = golonganDarah;
        } else {
            throw new IllegalArgumentException("Golongan darah tiak valid: " + golonganDarah);
        }
    }

    public void ubahNama(String namaBaru) {
        this.nama = namaBaru;
    }

    public void ubahWarnaRambut(String warnaRambutBaru) {
        this.warnaRambut = warnaRambutBaru;
    }

}
