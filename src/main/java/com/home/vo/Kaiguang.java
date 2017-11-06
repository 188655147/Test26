package com.home.vo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Kaiguang implements Serializable {
    private int kgid;
    private Byte deng;
    private Double jiaodu;
    private Double wendu;
    private Double shidu;
    private Double nongdu;
    private Double qiangdu;
    private Integer userW;
    private User userByUserW;

    @Id
    @Column(name = "kgid", nullable = false)
    public int getKgid() {
        return kgid;
    }

    public void setKgid(int kgid) {
        this.kgid = kgid;
    }

    @Basic
    @Column(name = "deng", nullable = true)
    public Byte getDeng() {
        return deng;
    }

    public void setDeng(Byte deng) {
        this.deng = deng;
    }

    @Basic
    @Column(name = "jiaodu", nullable = true, precision = 1)
    public Double getJiaodu() {
        return jiaodu;
    }

    public void setJiaodu(Double jiaodu) {
        this.jiaodu = jiaodu;
    }

    @Basic
    @Column(name = "wendu", nullable = true, precision = 1)
    public Double getWendu() {
        return wendu;
    }

    public void setWendu(Double wendu) {
        this.wendu = wendu;
    }

    @Basic
    @Column(name = "shidu", nullable = true, precision = 2)
    public Double getShidu() {
        return shidu;
    }

    public void setShidu(Double shidu) {
        this.shidu = shidu;
    }

    @Basic
    @Column(name = "nongdu", nullable = true, precision = 2)
    public Double getNongdu() {
        return nongdu;
    }

    public void setNongdu(Double nongdu) {
        this.nongdu = nongdu;
    }

    @Basic
    @Column(name = "qiangdu", nullable = true, precision = 2)
    public Double getQiangdu() {
        return qiangdu;
    }

    public void setQiangdu(Double qiangdu) {
        this.qiangdu = qiangdu;
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

        Kaiguang kaiguang = (Kaiguang) o;

        if (kgid != kaiguang.kgid) return false;
        if (deng != null ? !deng.equals(kaiguang.deng) : kaiguang.deng != null) return false;
        if (jiaodu != null ? !jiaodu.equals(kaiguang.jiaodu) : kaiguang.jiaodu != null) return false;
        if (wendu != null ? !wendu.equals(kaiguang.wendu) : kaiguang.wendu != null) return false;
        if (shidu != null ? !shidu.equals(kaiguang.shidu) : kaiguang.shidu != null) return false;
        if (nongdu != null ? !nongdu.equals(kaiguang.nongdu) : kaiguang.nongdu != null) return false;
        if (qiangdu != null ? !qiangdu.equals(kaiguang.qiangdu) : kaiguang.qiangdu != null) return false;
        if (userW != null ? !userW.equals(kaiguang.userW) : kaiguang.userW != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kgid;
        result = 31 * result + (deng != null ? deng.hashCode() : 0);
        result = 31 * result + (jiaodu != null ? jiaodu.hashCode() : 0);
        result = 31 * result + (wendu != null ? wendu.hashCode() : 0);
        result = 31 * result + (shidu != null ? shidu.hashCode() : 0);
        result = 31 * result + (nongdu != null ? nongdu.hashCode() : 0);
        result = 31 * result + (qiangdu != null ? qiangdu.hashCode() : 0);
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
