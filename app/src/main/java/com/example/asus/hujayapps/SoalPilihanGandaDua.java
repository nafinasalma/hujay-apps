package com.example.asus.hujayapps;

public class SoalPilihanGandaDua {
    public String pertanyaandua[] = {
            "Makhroh hurufnya digetarkan di langit-langit mulut, yaitu huruf..",
            "Penulisan hurufnya harus berada di atas garis",
            "Huruf Dzal apabila diberi harokat kasroh maka dibaca..",
            "Makhroj hurufnya berada di tenggorokan bagian atas, yaitu..",
            "Makhroj hurufnya berada di tenggorokan bagian tengah, yaitu..",
    };

    private String jawabandua[][] = {
            {"Ha","Dzal","Ro","Kho"},
            {"Ro","Dal","Kho","Ha"},
            {"Dza","Dzi","Dzu","Dze"},
            {"Kho","Ha","Dza","Dal"},
            {"Dal","Dzal","Ro","Ha"},
    };

    private String jawabanbenardua[] = {
            "Ro",
            "Dal",
            "Dzi",
            "Kho",
            "Ha",
    };

    public String getPertanyaan(int x) {
        String soal = pertanyaandua[x];
        return soal;
    }

    public String getJawaban1(int x) {
        String jawaban1 = jawabandua[x][0];
        return jawaban1;
    }

    public String getJawaban2(int x) {
        String jawaban2 = jawabandua[x][1];
        return jawaban2;
    }

    public String getJawaban3(int x) {
        String jawaban3 = jawabandua[x][2];
        return jawaban3;
    }

    public String getJawaban4(int x) {
        String jawaban4 = jawabandua[x][3];
        return jawaban4;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanbenardua[x];
        return jawaban;
    }
}
