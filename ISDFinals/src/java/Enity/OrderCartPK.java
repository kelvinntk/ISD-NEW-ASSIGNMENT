/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author User
 */
@Embeddable
public class OrderCartPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ORDERID")
    private String orderid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "STUDENT_STUDID")
    private String studentStudid;

    public OrderCartPK() {
    }

    public OrderCartPK(String orderid, String studentStudid) {
        this.orderid = orderid;
        this.studentStudid = studentStudid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getStudentStudid() {
        return studentStudid;
    }

    public void setStudentStudid(String studentStudid) {
        this.studentStudid = studentStudid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderid != null ? orderid.hashCode() : 0);
        hash += (studentStudid != null ? studentStudid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderCartPK)) {
            return false;
        }
        OrderCartPK other = (OrderCartPK) object;
        if ((this.orderid == null && other.orderid != null) || (this.orderid != null && !this.orderid.equals(other.orderid))) {
            return false;
        }
        if ((this.studentStudid == null && other.studentStudid != null) || (this.studentStudid != null && !this.studentStudid.equals(other.studentStudid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enity.OrderCartPK[ orderid=" + orderid + ", studentStudid=" + studentStudid + " ]";
    }
    
}
