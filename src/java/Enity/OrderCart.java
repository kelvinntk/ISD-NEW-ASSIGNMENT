/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kelvin Ng Tiong Kiat
 */
@Entity
@Table(name = "ORDER_CART")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderCart.findAll", query = "SELECT o FROM OrderCart o")
    , @NamedQuery(name = "OrderCart.findByOrderid", query = "SELECT o FROM OrderCart o WHERE o.orderid = :orderid")
    , @NamedQuery(name = "OrderCart.findByOrderdate", query = "SELECT o FROM OrderCart o WHERE o.orderdate = :orderdate")
    , @NamedQuery(name = "OrderCart.findByOrderstatus", query = "SELECT o FROM OrderCart o WHERE o.orderstatus = :orderstatus")
    , @NamedQuery(name = "OrderCart.findByCouponcode", query = "SELECT o FROM OrderCart o WHERE o.couponcode = :couponcode")})
public class OrderCart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ORDERID")
    private String orderid;
    @Column(name = "ORDERDATE")
    @Temporal(TemporalType.DATE)
    private Date orderdate;
    @Size(max = 50)
    @Column(name = "ORDERSTATUS")
    private String orderstatus;
    @Size(max = 20)
    @Column(name = "COUPONCODE")
    private String couponcode;
    @JoinColumn(name = "STUDENT_STUDID", referencedColumnName = "STUDID")
    @ManyToOne(optional = false)
    private Student studentStudid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderCartOrderid")
    private List<Ordermeal> ordermealList;

    public OrderCart() {
    }

    public OrderCart(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }
    public Date getOrderdate(Date orderdate){
        return orderdate;
    }
    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getCouponcode() {
        return couponcode;
    }

    public void setCouponcode(String couponcode) {
        this.couponcode = couponcode;
    }

    public Student getStudentStudid() {
        return studentStudid;
    }

    public void setStudentStudid(Student studentStudid) {
        this.studentStudid = studentStudid;
    }

    @XmlTransient
    public List<Ordermeal> getOrdermealList() {
        return ordermealList;
    }

    public void setOrdermealList(List<Ordermeal> ordermealList) {
        this.ordermealList = ordermealList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderid != null ? orderid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderCart)) {
            return false;
        }
        OrderCart other = (OrderCart) object;
        if ((this.orderid == null && other.orderid != null) || (this.orderid != null && !this.orderid.equals(other.orderid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enity.OrderCart[ orderid=" + orderid + " ]";
    }
    
}
