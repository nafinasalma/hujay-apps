package com.example.asus.hujayapps;

public class SoalEsayLima {
    public String pertanyaanesaylima[] = {
            "Huruf apakah di atas?",
            "Huruf Nun dengan harokat dhomah dibaca menjadi..",
            "Huruf apakah di atas?",
            "Huruf Mim yang berada di akhir kalimat, lalu diberi harokat kasroh dibaca..",
            "Gambar di atas adalah huruf Kaf yang berada di ... kata",
    };

    private String image[] = {
            "qofgame",
            "nunkuis",
            "lamkuis",
            "mimkuis",
            "kafkuis",
    };

    private String jawabanBenaresay[] = {
            "Qof",
            "Nu",
            "Lam",
            "Mi",
            "Tengah",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaanesaylima[x];
        return soal;
    }

    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanBenaresay[x];
        return jawaban;
    }
}
