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
 * @author User
 */
@Entity
@Table(name = "MANAGER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Manager.findAll", query = "SELECT m FROM Manager m")
    , @NamedQuery(name = "Manager.findByManagerid", query = "SELECT m FROM Manager m WHERE m.managerid = :managerid")
    , @NamedQuery(name = "Manager.findByManagername", query = "SELECT m FROM Manager m WHERE m.managername = :managername")
    , @NamedQuery(name = "Manager.findByManageremail", query = "SELECT m FROM Manager m WHERE m.manageremail = :manageremail")
    , @NamedQuery(name = "Manager.findByManagerpass", query = "SELECT m FROM Manager m WHERE m.managerpass = :managerpass")})
public class Manager implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MANAGERID")
    private String managerid;
    @Size(max = 50)
    @Column(name = "MANAGERNAME")
    private String managername;
    @Size(max = 50)
    @Column(name = "MANAGEREMAIL")
    private String manageremail;
    @Size(max = 50)
    @Column(name = "MANAGERPASS")
    private String managerpass;

    public Manager() {
    }

    public Manager(String managerid) {
        this.managerid = managerid;
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getManageremail() {
        return manageremail;
    }

    public void setManageremail(String manageremail) {
        this.manageremail = manageremail;
    }

    public String getManagerpass() {
        return managerpass;
    }

    public void setManagerpass(String managerpass) {
        this.managerpass = managerpass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (managerid != null ? managerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manager)) {
            return false;
        }
        Manager other = (Manager) object;
        if ((this.managerid == null && other.managerid != null) || (this.managerid != null && !this.managerid.equals(other.managerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enity.Manager[ managerid=" + managerid + " ]";
    }
    
}
