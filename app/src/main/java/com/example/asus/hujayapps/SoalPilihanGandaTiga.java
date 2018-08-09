package com.example.asus.hujayapps;

public class SoalPilihanGandaTiga {
    public String pertanyaantiga[] = {
            "Huruf apa yang bisa disambung tapi tidak bisa menyambung huruf setelahnya ",
            "Makhroj hurufnya adalah sisi kanan atau kiri lidah mengenai sisi gigi geraham atas sebelah dalam (mulut menggelembung saat mengucapkannya)",
            "Huruf Sya apabila diberi harokah kasroh, maka dibaca..",
            "Huruf Sa apabila diberi harokah dhomah, maka dibaca..",
            "Untuk membuat huruf Shod dibaca 'Sho' maka diberi harokat..",
    };

    private String jawabantiga[][] = {
            {"Dhod","Shod","Zain","Sin"},
            {"Sin","Dhod","Syin","Shod"},
            {"Sya","Syi","Syu","Syo"},
            {"Sa","Si","Su","Se"},
            {"Fathah","Kasroh","Dhomah","Fathah dan Kasroh"},
    };

    private String jawabanbenartiga[] = {
            "Zain",
            "Dhod",
            "Syi",
            "Su",
            "Fathah",
    };


    public String getPertanyaan(int x) {
        String soal = pertanyaantiga[x];
        return soal;
    }


    public String getJawaban1(int x) {
        String jawaban1 = jawabantiga[x][0];
        return jawaban1;
    }

    public String getJawaban2(int x) {
        String jawaban2 = jawabantiga[x][1];
        return jawaban2;
    }

    public String getJawaban3(int x) {
        String jawaban3 = jawabantiga[x][2];
        return jawaban3;
    }

    public String getJawaban4(int x) {
        String jawaban4 = jawabantiga[x][3];
        return jawaban4;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanbenartiga[x];
        return jawaban;
    }
}
