/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "Order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Order1.findAll", query = "SELECT o FROM Order1 o")
    , @NamedQuery(name = "Order1.findByOrderid", query = "SELECT o FROM Order1 o WHERE o.order1PK.orderid = :orderid")
    , @NamedQuery(name = "Order1.findByOrderdate", query = "SELECT o FROM Order1 o WHERE o.orderdate = :orderdate")
    , @NamedQuery(name = "Order1.findByOrderstatus", query = "SELECT o FROM Order1 o WHERE o.orderstatus = :orderstatus")
    , @NamedQuery(name = "Order1.findByCouponcode", query = "SELECT o FROM Order1 o WHERE o.couponcode = :couponcode")
    , @NamedQuery(name = "Order1.findByStudentStudid", query = "SELECT o FROM Order1 o WHERE o.order1PK.studentStudid = :studentStudid")})
public class Order1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Order1PK order1PK;
    @Column(name = "ORDERDATE")
    @Temporal(TemporalType.DATE)
    private Date orderdate;
    @Size(max = 50)
    @Column(name = "ORDERSTATUS")
    private String orderstatus;
    @Size(max = 20)
    @Column(name = "COUPONCODE")
    private String couponcode;
    @ManyToMany(mappedBy = "order1List")
    private List<Meal> mealList;
    @JoinColumn(name = "STUDENT_STUDID", referencedColumnName = "STUDID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Student student;

    public Order1() {
    }

    public Order1(Order1PK order1PK) {
        this.order1PK = order1PK;
    }

    public Order1(String orderid, String studentStudid) {
        this.order1PK = new Order1PK(orderid, studentStudid);
    }

    public Order1PK getOrder1PK() {
        return order1PK;
    }

    public void setOrder1PK(Order1PK order1PK) {
        this.order1PK = order1PK;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
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

    @XmlTransient
    public List<Meal> getMealList() {
        return mealList;
    }

    public void setMealList(List<Meal> mealList) {
        this.mealList = mealList;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (order1PK != null ? order1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Order1)) {
            return false;
        }
        Order1 other = (Order1) object;
        if ((this.order1PK == null && other.order1PK != null) || (this.order1PK != null && !this.order1PK.equals(other.order1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Order1[ order1PK=" + order1PK + " ]";
    }
    
}
