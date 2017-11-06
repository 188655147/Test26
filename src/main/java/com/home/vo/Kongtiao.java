package com.home.vo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Kongtiao implements Serializable {
    private int ktid;
    private String ktname;
    private Integer wendu;
    private String moshi;
    private Byte kaiguang;
    private Integer fengli;
    private Integer dingshi;
    private Double fengxiang;
    private Byte saofeng;
    private Byte shuimian;
    private Byte shuxian;
    private Integer userW;
    private User userByUserW;

    @Id
    @Column(name = "ktid", nullable = false)
    public int getKtid() {
        return ktid;
    }

    public void setKtid(int ktid) {
        this.ktid = ktid;
    }

    @Basic
    @Column(name = "ktname", nullable = true, length = 255)
    public String getKtname() {
        return ktname;
    }

    public void setKtname(String ktname) {
        this.ktname = ktname;
    }

    @Basic
    @Column(name = "wendu", nullable = true)
    public Integer getWendu() {
        return wendu;
    }

    public void setWendu(Integer wendu) {
        this.wendu = wendu;
    }

    @Basic
    @Column(name = "moshi", nullable = true, length = 255)
    public String getMoshi() {
        return moshi;
    }

    public void setMoshi(String moshi) {
        this.moshi = moshi;
    }

    @Basic
    @Column(name = "kaiguang", nullable = true)
    public Byte getKaiguang() {
        return kaiguang;
    }

    public void setKaiguang(Byte kaiguang) {
        this.kaiguang = kaiguang;
    }

    @Basic
    @Column(name = "fengli", nullable = true)
    public Integer getFengli() {
        return fengli;
    }

    public void setFengli(Integer fengli) {
        this.fengli = fengli;
    }

    @Basic
    @Column(name = "dingshi", nullable = true)
    public Integer getDingshi() {
        return dingshi;
    }

    public void setDingshi(Integer dingshi) {
        this.dingshi = dingshi;
    }

    @Basic
    @Column(name = "fengxiang", nullable = true, precision = 1)
    public Double getFengxiang() {
        return fengxiang;
    }

    public void setFengxiang(Double fengxiang) {
        this.fengxiang = fengxiang;
    }

    @Basic
    @Column(name = "saofeng", nullable = true)
    public Byte getSaofeng() {
        return saofeng;
    }

    public void setSaofeng(Byte saofeng) {
        this.saofeng = saofeng;
    }

    @Basic
    @Column(name = "shuimian", nullable = true)
    public Byte getShuimian() {
        return shuimian;
    }

    public void setShuimian(Byte shuimian) {
        this.shuimian = shuimian;
    }

    @Basic
    @Column(name = "shuxian", nullable = true)
    public Byte getShuxian() {
        return shuxian;
    }

    public void setShuxian(Byte shuxian) {
        this.shuxian = shuxian;
    }

    @Basic
    @Column(name = "user_w", nullable = true)
    public Integer getUserW() {
        return userW;
    }

    public void setUserW(Integer userW) {
        this.userW = userW;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kongtiao kongtiao = (Kongtiao) o;

        if (ktid != kongtiao.ktid) return false;
        if (ktname != null ? !ktname.equals(kongtiao.ktname) : kongtiao.ktname != null) return false;
        if (wendu != null ? !wendu.equals(kongtiao.wendu) : kongtiao.wendu != null) return false;
        if (moshi != null ? !moshi.equals(kongtiao.moshi) : kongtiao.moshi != null) return false;
        if (kaiguang != null ? !kaiguang.equals(kongtiao.kaiguang) : kongtiao.kaiguang != null) return false;
        if (fengli != null ? !fengli.equals(kongtiao.fengli) : kongtiao.fengli != null) return false;
        if (dingshi != null ? !dingshi.equals(kongtiao.dingshi) : kongtiao.dingshi != null) return false;
        if (fengxiang != null ? !fengxiang.equals(kongtiao.fengxiang) : kongtiao.fengxiang != null) return false;
        if (saofeng != null ? !saofeng.equals(kongtiao.saofeng) : kongtiao.saofeng != null) return false;
        if (shuimian != null ? !shuimian.equals(kongtiao.shuimian) : kongtiao.shuimian != null) return false;
        if (shuxian != null ? !shuxian.equals(kongtiao.shuxian) : kongtiao.shuxian != null) return false;
        if (userW != null ? !userW.equals(kongtiao.userW) : kongtiao.userW != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ktid;
        result = 31 * result + (ktname != null ? ktname.hashCode() : 0);
        result = 31 * result + (wendu != null ? wendu.hashCode() : 0);
        result = 31 * result + (moshi != null ? moshi.hashCode() : 0);
        result = 31 * result + (kaiguang != null ? kaiguang.hashCode() : 0);
        result = 31 * result + (fengli != null ? fengli.hashCode() : 0);
        result = 31 * result + (dingshi != null ? dingshi.hashCode() : 0);
        result = 31 * result + (fengxiang != null ? fengxiang.hashCode() : 0);
        result = 31 * result + (saofeng != null ? saofeng.hashCode() : 0);
        result = 31 * result + (shuimian != null ? shuimian.hashCode() : 0);
        result = 31 * result + (shuxian != null ? shuxian.hashCode() : 0);
        result = 31 * result + (userW != null ? userW.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_w", referencedColumnName = "id")
    public User getUserByUserW() {
        return userByUserW;
    }

    public void setUserByUserW(User userByUserW) {
        this.userByUserW = userByUserW;
    }
}
