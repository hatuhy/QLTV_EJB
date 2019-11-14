/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.example.com;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TMT
 */
@Entity
@Table(name = "docgia", catalog = "quanlythuvien", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Docgia.findAll", query = "SELECT d FROM Docgia d")
    , @NamedQuery(name = "Docgia.findByMadocgia", query = "SELECT d FROM Docgia d WHERE d.madocgia = :madocgia")
    , @NamedQuery(name = "Docgia.findByTendocgia", query = "SELECT d FROM Docgia d WHERE d.tendocgia = :tendocgia")
    , @NamedQuery(name = "Docgia.findByGioitinh", query = "SELECT d FROM Docgia d WHERE d.gioitinh = :gioitinh")
    , @NamedQuery(name = "Docgia.findByNgaysinh", query = "SELECT d FROM Docgia d WHERE d.ngaysinh = :ngaysinh")
    , @NamedQuery(name = "Docgia.findByDoituong", query = "SELECT d FROM Docgia d WHERE d.doituong = :doituong")
    , @NamedQuery(name = "Docgia.findByNgaycap", query = "SELECT d FROM Docgia d WHERE d.ngaycap = :ngaycap")
    , @NamedQuery(name = "Docgia.findByNgayhethan", query = "SELECT d FROM Docgia d WHERE d.ngayhethan = :ngayhethan")
    , @NamedQuery(name = "Docgia.findBySoluongtailieu", query = "SELECT d FROM Docgia d WHERE d.soluongtailieu = :soluongtailieu")
    , @NamedQuery(name = "Docgia.findBySoluongmoitailieu", query = "SELECT d FROM Docgia d WHERE d.soluongmoitailieu = :soluongmoitailieu")
    , @NamedQuery(name = "Docgia.findBySongaymuon", query = "SELECT d FROM Docgia d WHERE d.songaymuon = :songaymuon")})
public class Docgia implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "madocgia")
    private Collection<Phieumuon> phieumuonCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "madocgia", nullable = false)
    private Integer madocgia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tendocgia", nullable = false, length = 30)
    private String tendocgia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "gioitinh", nullable = false, length = 5)
    private String gioitinh;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ngaysinh", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date ngaysinh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "doituong", nullable = false, length = 30)
    private String doituong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ngaycap", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaycap;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ngayhethan", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayhethan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "soluongtailieu", nullable = false)
    private int soluongtailieu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "soluongmoitailieu", nullable = false)
    private int soluongmoitailieu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "songaymuon", nullable = false)
    private int songaymuon;

    public Docgia() {
    }

    public Docgia(Integer madocgia) {
        this.madocgia = madocgia;
    }

    public Docgia(Integer madocgia, String tendocgia, String gioitinh, Date ngaysinh, String doituong, Date ngaycap, Date ngayhethan, int soluongtailieu, int soluongmoitailieu, int songaymuon) {
        this.madocgia = madocgia;
        this.tendocgia = tendocgia;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.doituong = doituong;
        this.ngaycap = ngaycap;
        this.ngayhethan = ngayhethan;
        this.soluongtailieu = soluongtailieu;
        this.soluongmoitailieu = soluongmoitailieu;
        this.songaymuon = songaymuon;
    }

    public Integer getMadocgia() {
        return madocgia;
    }

    public void setMadocgia(Integer madocgia) {
        this.madocgia = madocgia;
    }

    public String getTendocgia() {
        return tendocgia;
    }

    public void setTendocgia(String tendocgia) {
        this.tendocgia = tendocgia;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDoituong() {
        return doituong;
    }

    public void setDoituong(String doituong) {
        this.doituong = doituong;
    }

    public Date getNgaycap() {
        return ngaycap;
    }

    public void setNgaycap(Date ngaycap) {
        this.ngaycap = ngaycap;
    }

    public Date getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(Date ngayhethan) {
        this.ngayhethan = ngayhethan;
    }

    public int getSoluongtailieu() {
        return soluongtailieu;
    }

    public void setSoluongtailieu(int soluongtailieu) {
        this.soluongtailieu = soluongtailieu;
    }

    public int getSoluongmoitailieu() {
        return soluongmoitailieu;
    }

    public void setSoluongmoitailieu(int soluongmoitailieu) {
        this.soluongmoitailieu = soluongmoitailieu;
    }

    public int getSongaymuon() {
        return songaymuon;
    }

    public void setSongaymuon(int songaymuon) {
        this.songaymuon = songaymuon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (madocgia != null ? madocgia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Docgia)) {
            return false;
        }
        Docgia other = (Docgia) object;
        if ((this.madocgia == null && other.madocgia != null) || (this.madocgia != null && !this.madocgia.equals(other.madocgia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.example.com.Docgia[ madocgia=" + madocgia + " ]";
    }

    @XmlTransient
    public Collection<Phieumuon> getPhieumuonCollection() {
        return phieumuonCollection;
    }

    public void setPhieumuonCollection(Collection<Phieumuon> phieumuonCollection) {
        this.phieumuonCollection = phieumuonCollection;
    }
    
}
