package com.example.asus.hujayapps;

public class SoalEsaySatu {
    public String pertanyaanesaysatu[] = {
            "Huruf apakah diatas?",
            "Huruf ta yang diberi harokat kasroh dibaca..",
            "Huruf Ba tersebut di atas diberi harokat apa?",
            "Gambar di atas adalah huruf tsa yang berada di awal kata dan diberi harokat dhomah, dibaca..",
            "Huruf Jim di atas adalah penulisan ketika berada di ... kata",
    };

    private String image[] = {
            "alifgame",
            "takuis",
            "bakuis",
            "tsukuis",
            "jimkuis",
    };

    private String jawabanBenaresay[] = {
            "Alif",
            "Ti",
            "Fathah",
            "Tsu",
            "Tengah",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaanesaysatu[x];
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
