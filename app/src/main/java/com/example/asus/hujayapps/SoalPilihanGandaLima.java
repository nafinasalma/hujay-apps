package com.example.asus.hujayapps;

public class SoalPilihanGandaLima {
    public String pertanyaanlima[] = {
            "Makhroj hurufnya adalah bibir atas dan bibir bawah dirapatkan bersama-sama, yaitu..",
            "Huruf Kaf jika diberi harokah dhomah maka dibaca..",
            "Huruf Nun apabila diberi harokah Fathah maka dibaca..",
            "Makhroj hurufnya adalah sisi bagian depan lidah mengenai gusi gigi depan, yaitu..",
            "Untuk membuat huruf Qof dibaca 'Qo' maka diberi harokat..",
    };

    private String jawabanlima[][] = {
            {"Qof","Kaf","Lam","Mim"},
            {"Ka","Ki","Ku","Ko"},
            {"Na","Ni","Nu","Ne"},
            {"Nun","Qof","Kaf","Lam"},
            {"Fathah","Kasroh","Dhomah","Fathah dan Kasroh"},
    };

    private String jawabanbenarlima[] = {
            "Mim",
            "Ku",
            "Na",
            "Lam",
            "Fathah",
    };


    public String getPertanyaan(int x) {
        String soal = pertanyaanlima[x];
        return soal;
    }


    public String getJawaban1(int x) {
        String jawaban1 = jawabanlima[x][0];
        return jawaban1;
    }

    public String getJawaban2(int x) {
        String jawaban2 = jawabanlima[x][1];
        return jawaban2;
    }

    public String getJawaban3(int x) {
        String jawaban3 = jawabanlima[x][2];
        return jawaban3;
    }

    public String getJawaban4(int x) {
        String jawaban4 = jawabanlima[x][3];
        return jawaban4;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanbenarlima[x];
        return jawaban;
    }
}
