/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "STAFF")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s")
    , @NamedQuery(name = "Staff.findByStaffid", query = "SELECT s FROM Staff s WHERE s.staffid = :staffid")
    , @NamedQuery(name = "Staff.findByStaffname", query = "SELECT s FROM Staff s WHERE s.staffname = :staffname")
    , @NamedQuery(name = "Staff.findByStaffemail1", query = "SELECT s FROM Staff s WHERE s.staffemail1 = :staffemail1")
    , @NamedQuery(name = "Staff.findByStaffpass", query = "SELECT s FROM Staff s WHERE s.staffpass = :staffpass")
    , @NamedQuery(name = "Staff.findByStaffemail11", query = "SELECT s FROM Staff s WHERE s.staffemail11 = :staffemail11")})
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "STAFFID")
    private String staffid;
    @Size(max = 50)
    @Column(name = "STAFFNAME")
    private String staffname;
    @Size(max = 50)
    @Column(name = "STAFFEMAIL1")
    private String staffemail1;
    @Size(max = 50)
    @Column(name = "STAFFPASS")
    private String staffpass;
    @Size(max = 50)
    @Column(name = "STAFFEMAIL11")
    private String staffemail11;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staffStaffid")
    private List<Staff> staffList;
    @JoinColumn(name = "STAFF_STAFFID", referencedColumnName = "STAFFID")
    @ManyToOne(optional = false)
    private Staff staffStaffid;

    public Staff() {
    }

    public Staff(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getStaffemail1() {
        return staffemail1;
    }

    public void setStaffemail1(String staffemail1) {
        this.staffemail1 = staffemail1;
    }

    public String getStaffpass() {
        return staffpass;
    }

    public void setStaffpass(String staffpass) {
        this.staffpass = staffpass;
    }

    public String getStaffemail11() {
        return staffemail11;
    }

    public void setStaffemail11(String staffemail11) {
        this.staffemail11 = staffemail11;
    }

    @XmlTransient
    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public Staff getStaffStaffid() {
        return staffStaffid;
    }

    public void setStaffStaffid(Staff staffStaffid) {
        this.staffStaffid = staffStaffid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffid != null ? staffid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.staffid == null && other.staffid != null) || (this.staffid != null && !this.staffid.equals(other.staffid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Staff[ staffid=" + staffid + " ]";
    }
    
}
