package com.example.asus.hujayapps;

public class SoalEmpatEsay {
    public String pertanyaanesayempat[] = {
            "Huruf apakah di atas?",
            "Huruf tho dengan harokat fathah dibaca menjadi..",
            "Huruf apakah di atas?",
            "Huruf Fa yang berada di tengah kalimat, lalu diberi harokat dhomah dibaca..",
            "Gambar di atas adalah huruf Ain yang berada di ... kata",
    };

    private String image[] = {
            "dzogame",
            "thokuis",
            "ghoinkuis",
            "fakuis",
            "ainkuis",
    };

    private String jawabanBenaresay[] = {
            "Dzo",
            "Tho",
            "Ghoin",
            "Fu",
            "Awal",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaanesayempat[x];
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
