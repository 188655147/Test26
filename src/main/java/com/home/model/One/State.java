package com.home.model.One;

public class State {
    private int id;
    private String deng;
    private String kongtiao;
    private Double chuanlian;
    private Double wendu;
    private Double shidu;
    private Double yanwu;
    private Double guangzhao;
    private User uid;

    public State(int id, String deng, String kongtiao, Double chuanlian, Double wendu, Double shidu, Double yanwu, Double guangzhao) {
        this.id = id;
        this.deng = deng;
        this.kongtiao = kongtiao;
        this.chuanlian = chuanlian;
        this.wendu = wendu;
        this.shidu = shidu;
        this.yanwu = yanwu;
        this.guangzhao = guangzhao;
    }

    public User getUid() {
        return uid;
    }

    public void setUid(User uid) {
        this.uid = uid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeng() {
        return deng;
    }

    public void setDeng(String deng) {
        this.deng = deng;
    }

    public String getKongtiao() {
        return kongtiao;
    }

    public void setKongtiao(String kongtiao) {
        this.kongtiao = kongtiao;
    }

    public Double getChuanlian() {
        return chuanlian;
    }

    public void setChuanlian(Double chuanlian) {
        this.chuanlian = chuanlian;
    }

    public Double getWendu() {
        return wendu;
    }

    public void setWendu(Double wendu) {
        this.wendu = wendu;
    }

    public Double getShidu() {
        return shidu;
    }

    public void setShidu(Double shidu) {
        this.shidu = shidu;
    }

    public Double getYanwu() {
        return yanwu;
    }

    public void setYanwu(Double yanwu) {
        this.yanwu = yanwu;
    }

    public Double getGuangzhao() {
        return guangzhao;
    }

    public void setGuangzhao(Double guangzhao) {
        this.guangzhao = guangzhao;
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", deng='" + deng + '\'' +
                ", kongtiao='" + kongtiao + '\'' +
                ", chuanlian=" + chuanlian +
                ", wendu=" + wendu +
                ", shidu=" + shidu +
                ", yanwu=" + yanwu +
                ", guangzhao=" + guangzhao +
                '}';
    }
}
