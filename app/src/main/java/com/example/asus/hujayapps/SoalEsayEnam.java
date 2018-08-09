package com.example.asus.hujayapps;

public class SoalEsayEnam {
    //membuat array untuk pertanyaan
    public String pertanyaanesayenam[] = {
            "Huruf apakah di atas?",
            "Huruf wau dengan harokat dhomah dibaca menjadi..",
            "Huruf hamzah apabila diberi harokat fathah, maka dibaca..",
            "Huruf di atas adalah huruf ha yang di tulis di ... kata",
            "Huruf di atas dibaca..",
    };
    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "lamalifgame",
            "wukuis",
            "hamzahkuis",
            "hakkuis",
            "yakuis",
    };
    //membuat array jawaban benar
    private String jawabanBenaresay[] = {
            "Lam Alif",
            "Wu",
            "A",
            "Akhir",
            "Ya",
    };
    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaanesayenam[x];
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
