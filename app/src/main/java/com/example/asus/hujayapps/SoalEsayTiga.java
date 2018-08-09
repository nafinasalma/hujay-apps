package com.example.asus.hujayapps;

public class SoalEsayTiga {
    public String pertanyaanesaytiga[] = {
            "Huruf apakah di atas?",
            "Huruf shod dengan harokat fathah dibaca menjadi..",
            "Huruf apakah di atas?",
            "Huruf Zain yang berada di akhir kalimat, lalu diberi harokat dhomah dibaca..",
            "Gambar di atas adalah huruf Sin yang berada di ... kata",
    };

    private String image[] = {
            "dhodgame",
            "shodkuis",
            "syinkuis",
            "zainkuis",
            "sinkuis",
    };

    private String jawabanBenaresay[] = {
            "Dhod",
            "Sho",
            "Syin",
            "Zu",
            "Akhir",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaanesaytiga[x];
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
