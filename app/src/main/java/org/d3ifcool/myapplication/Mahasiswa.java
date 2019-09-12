package org.d3ifcool.myapplication;

public enum Mahasiswa {
    user1("6706174098", "aseng", "80", "72"),
    user2("6706170026", "rolin", "90", "89"),
    user3("6706174111", "depi", "92", "95");

    private String nim;
    private String nama;
    private String uts;
    private String uas;

    Mahasiswa(String nim, String nama, String uts, String uas) {
        this.nim = nim;
        this.nama = nama;
        this.uts = uts;
        this.uas = uas;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getUts() {
        return uts;
    }

    public String getUas() {
        return uas;
    }
}
