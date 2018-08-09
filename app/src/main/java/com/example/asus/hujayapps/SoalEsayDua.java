package com.example.asus.hujayapps;

public class SoalEsayDua {

    public String pertanyaanesaydua[] = {
            "Huruf apakah di atas?",
            "Huruf di atas apabila diberi harokat dhomah, maka dibaca..",
            "Huruf di atas adalah huruf Ha yang berada di ... kata",
            "Huruf di atas merupakan huruf yang dapat disambung namun tidak dapat menyambung, yaitu..",
            "Huruf di atas dibaca..",
    };

    private String image[] = {
            "dzalgame",
            "rukuis",
            "hakuis",
            "dalgame",
            "khokuis",
    };

    private String jawabanBenaresay[] = {
            "Dzal",
            "Ru",
            "Akhir",
            "Dal",
            "Khi",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaanesaydua[x];
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
