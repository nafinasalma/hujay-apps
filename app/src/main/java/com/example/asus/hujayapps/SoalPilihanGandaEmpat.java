package com.example.asus.hujayapps;

public class SoalPilihanGandaEmpat {
    public String pertanyaanempat[] = {
            "Makhroj hurufnya adalah tenggorokan bagian atas",
            "Huruf Fa apabila diberi harokat dhomah maka dibaca..",
            "Penulisan hurufnya sampai ke bawah garis, yaitu.. ",
            "Makhroj Hurufnya adalah ujung lidah yang menyentuh ujung gigi seri atas",
            "Huruf Tho kalau diberi harokat kasroh maka dibaca..",
    };

    private String jawabanempat[][] = {
            {"Ghoin","Tho","Dzo","Fa"},
            {"Fa","Fi","Fu","Fe"},
            {"Fa","Tho","Ain","Dzo"},
            {"Dzo","Ghoin","Fa","Ain"},
            {"Tho","Thi","Thu","That"},
    };

    private String jawabanbenarempat[] = {
            "Ghoin",
            "Fu",
            "Ain",
            "Dzo",
            "Thi",
    };

    public String getPertanyaan(int x) {
        String soal = pertanyaanempat[x];
        return soal;
    }


    public String getJawaban1(int x) {
        String jawaban1 = jawabanempat[x][0];
        return jawaban1;
    }

    public String getJawaban2(int x) {
        String jawaban2 = jawabanempat[x][1];
        return jawaban2;
    }

    public String getJawaban3(int x) {
        String jawaban3 = jawabanempat[x][2];
        return jawaban3;
    }

    public String getJawaban4(int x) {
        String jawaban4 = jawabanempat[x][3];
        return jawaban4;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanbenarempat[x];
        return jawaban;
    }
}
