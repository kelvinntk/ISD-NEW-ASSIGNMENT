/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kelvin Ng Tiong Kiat
 */
@Entity
@Table(name = "STAFF")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s")
    , @NamedQuery(name = "Staff.findByStaffid", query = "SELECT s FROM Staff s WHERE s.staffid = :staffid")
    , @NamedQuery(name = "Staff.findByStaffname", query = "SELECT s FROM Staff s WHERE s.staffname = :staffname")
    , @NamedQuery(name = "Staff.findByStaffemail", query = "SELECT s FROM Staff s WHERE s.staffemail = :staffemail")
    , @NamedQuery(name = "Staff.findByStaffpass", query = "SELECT s FROM Staff s WHERE s.staffpass = :staffpass")})
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
    @Column(name = "STAFFEMAIL")
    private String staffemail;
    @Size(max = 50)
    @Column(name = "STAFFPASS")
    private String staffpass;

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

    public String getStaffemail() {
        return staffemail;
    }

    public void setStaffemail(String staffemail) {
        this.staffemail = staffemail;
    }

    public String getStaffpass() {
        return staffpass;
    }

    public void setStaffpass(String staffpass) {
        this.staffpass = staffpass;
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
        return "Enity.Staff[ staffid=" + staffid + " ]";
    }
    
}
