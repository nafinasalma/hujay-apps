package com.example.asus.hujayapps;

public class SoalEsaySatu {
    //membuat array untuk pertanyaan
    public String pertanyaanesaysatu[] = {
            "Huruf di atas adalah huruf yang qolqolah ketika di baca, yaitu..",
            "Huruf di atas adalah huruf yang penulisannya sampai ke bawah garis, yaitu..",
            "Huruf di atas ditulis tegak lurus, namanya?",
            "Huruf yang sama seperti huruf Ta namun memilik tiga titik, yaitu..",
            "Urutan huruf kedua jalam hijaiyah",
    };
    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "hurupba",
            "hurupjim",
            "hurupalif",
            "huruftsa",
            "hurupta",
    };
    //membuat array jawaban benar
    private String jawabanBenaresay[] = {
            "Ba",
            "Jim",
            "Alif",
            "Tsa",
            "Ta",
    };
    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaanesaysatu[x];
        return soal;
    }
    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }
    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenaresay[x];
        return jawaban;
    }
}
