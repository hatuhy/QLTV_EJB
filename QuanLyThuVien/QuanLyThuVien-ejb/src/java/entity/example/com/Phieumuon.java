/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.example.com;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TMT
 */
@Entity
@Table(name = "phieumuon", catalog = "quanlythuvien", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Phieumuon.findAll", query = "SELECT p FROM Phieumuon p")
    , @NamedQuery(name = "Phieumuon.findByMaphieumuon", query = "SELECT p FROM Phieumuon p WHERE p.maphieumuon = :maphieumuon")
    , @NamedQuery(name = "Phieumuon.findByNgaymuon", query = "SELECT p FROM Phieumuon p WHERE p.ngaymuon = :ngaymuon")
    , @NamedQuery(name = "Phieumuon.findByManhanvien", query = "SELECT p FROM Phieumuon p WHERE p.manhanvien = :manhanvien")})
public class Phieumuon implements Serializable {

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "phieumuon")
    private Phieumuonchitiet phieumuonchitiet;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "maphieumuon", nullable = false, length = 20)
    private String maphieumuon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ngaymuon", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date ngaymuon;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "manhanvien", nullable = false, length = 20)
    private String manhanvien;
    @JoinColumn(name = "madocgia", referencedColumnName = "madocgia", nullable = false)
    @ManyToOne(optional = false)
    private Docgia madocgia;

    public Phieumuon() {
    }

    public Phieumuon(String maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public Phieumuon(String maphieumuon, Date ngaymuon, String manhanvien) {
        this.maphieumuon = maphieumuon;
        this.ngaymuon = ngaymuon;
        this.manhanvien = manhanvien;
    }

    public String getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(String maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public Date getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(Date ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public Docgia getMadocgia() {
        return madocgia;
    }

    public void setMadocgia(Docgia madocgia) {
        this.madocgia = madocgia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maphieumuon != null ? maphieumuon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phieumuon)) {
            return false;
        }
        Phieumuon other = (Phieumuon) object;
        if ((this.maphieumuon == null && other.maphieumuon != null) || (this.maphieumuon != null && !this.maphieumuon.equals(other.maphieumuon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.example.com.Phieumuon[ maphieumuon=" + maphieumuon + " ]";
    }

    public Phieumuonchitiet getPhieumuonchitiet() {
        return phieumuonchitiet;
    }

    public void setPhieumuonchitiet(Phieumuonchitiet phieumuonchitiet) {
        this.phieumuonchitiet = phieumuonchitiet;
    }
    
}
