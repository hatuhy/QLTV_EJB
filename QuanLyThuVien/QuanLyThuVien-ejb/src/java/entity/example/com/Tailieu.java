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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tailieu", catalog = "quanlythuvien", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tailieu.findAll", query = "SELECT t FROM Tailieu t")
    , @NamedQuery(name = "Tailieu.findByMatailieu", query = "SELECT t FROM Tailieu t WHERE t.matailieu = :matailieu")
    , @NamedQuery(name = "Tailieu.findByTentailieu", query = "SELECT t FROM Tailieu t WHERE t.tentailieu = :tentailieu")
    , @NamedQuery(name = "Tailieu.findBySoluong", query = "SELECT t FROM Tailieu t WHERE t.soluong = :soluong")
    , @NamedQuery(name = "Tailieu.findByNhaxuatban", query = "SELECT t FROM Tailieu t WHERE t.nhaxuatban = :nhaxuatban")
    , @NamedQuery(name = "Tailieu.findByNamxuatban", query = "SELECT t FROM Tailieu t WHERE t.namxuatban = :namxuatban")
    , @NamedQuery(name = "Tailieu.findByTacgia", query = "SELECT t FROM Tailieu t WHERE t.tacgia = :tacgia")
    , @NamedQuery(name = "Tailieu.findByGiatien", query = "SELECT t FROM Tailieu t WHERE t.giatien = :giatien")})
public class Tailieu implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matailieu")
    private Collection<Phieumuonchitiet> phieumuonchitietCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "matailieu", nullable = false, length = 11)
    private String matailieu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tentailieu", nullable = false, length = 100)
    private String tentailieu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "soluong", nullable = false)
    private int soluong;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nhaxuatban", nullable = false, length = 30)
    private String nhaxuatban;
    @Basic(optional = false)
    @NotNull
    @Column(name = "namxuatban", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date namxuatban;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tacgia", nullable = false, length = 30)
    private String tacgia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "giatien", nullable = false)
    private int giatien;
    @JoinColumn(name = "matheloai", referencedColumnName = "matheloai", nullable = false)
    @ManyToOne(optional = false)
    private Theloai matheloai;

    public Tailieu() {
    }

    public Tailieu(String matailieu) {
        this.matailieu = matailieu;
    }

    public Tailieu(String matailieu, String tentailieu, int soluong, String nhaxuatban, Date namxuatban, String tacgia, int giatien) {
        this.matailieu = matailieu;
        this.tentailieu = tentailieu;
        this.soluong = soluong;
        this.nhaxuatban = nhaxuatban;
        this.namxuatban = namxuatban;
        this.tacgia = tacgia;
        this.giatien = giatien;
    }

    public String getMatailieu() {
        return matailieu;
    }

    public void setMatailieu(String matailieu) {
        this.matailieu = matailieu;
    }

    public String getTentailieu() {
        return tentailieu;
    }

    public void setTentailieu(String tentailieu) {
        this.tentailieu = tentailieu;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public Date getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(Date namxuatban) {
        this.namxuatban = namxuatban;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }

    public Theloai getMatheloai() {
        return matheloai;
    }

    public void setMatheloai(Theloai matheloai) {
        this.matheloai = matheloai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matailieu != null ? matailieu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tailieu)) {
            return false;
        }
        Tailieu other = (Tailieu) object;
        if ((this.matailieu == null && other.matailieu != null) || (this.matailieu != null && !this.matailieu.equals(other.matailieu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.example.com.Tailieu[ matailieu=" + matailieu + " ]";
    }

    @XmlTransient
    public Collection<Phieumuonchitiet> getPhieumuonchitietCollection() {
        return phieumuonchitietCollection;
    }

    public void setPhieumuonchitietCollection(Collection<Phieumuonchitiet> phieumuonchitietCollection) {
        this.phieumuonchitietCollection = phieumuonchitietCollection;
    }
    
}
