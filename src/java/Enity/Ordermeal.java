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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ORDERMEAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordermeal.findAll", query = "SELECT o FROM Ordermeal o")
    , @NamedQuery(name = "Ordermeal.findByOrdermealid", query = "SELECT o FROM Ordermeal o WHERE o.ordermealid = :ordermealid")
    , @NamedQuery(name = "Ordermeal.findByOrderCartStudentStudid", query = "SELECT o FROM Ordermeal o WHERE o.orderCartStudentStudid = :orderCartStudentStudid")})
public class Ordermeal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ORDERMEALID")
    private String ordermealid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ORDER_CART_STUDENT_STUDID")
    private String orderCartStudentStudid;
    @JoinColumn(name = "MEAL_MEALID", referencedColumnName = "MEALID")
    @ManyToOne(optional = false)
    private Meal mealMealid;
    @JoinColumn(name = "ORDER_CART_ORDERID", referencedColumnName = "ORDERID")
    @ManyToOne(optional = false)
    private OrderCart orderCartOrderid;

    public Ordermeal() {
    }

    public Ordermeal(String ordermealid) {
        this.ordermealid = ordermealid;
    }

    public Ordermeal(String ordermealid, String orderCartStudentStudid) {
        this.ordermealid = ordermealid;
        this.orderCartStudentStudid = orderCartStudentStudid;
    }

    public String getOrdermealid() {
        return ordermealid;
    }

    public void setOrdermealid(String ordermealid) {
        this.ordermealid = ordermealid;
    }

    public String getOrderCartStudentStudid() {
        return orderCartStudentStudid;
    }

    public void setOrderCartStudentStudid(String orderCartStudentStudid) {
        this.orderCartStudentStudid = orderCartStudentStudid;
    }

    public Meal getMealMealid() {
        return mealMealid;
    }

    public void setMealMealid(Meal mealMealid) {
        this.mealMealid = mealMealid;
    }

    public OrderCart getOrderCartOrderid() {
        return orderCartOrderid;
    }

    public void setOrderCartOrderid(OrderCart orderCartOrderid) {
        this.orderCartOrderid = orderCartOrderid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordermealid != null ? ordermealid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordermeal)) {
            return false;
        }
        Ordermeal other = (Ordermeal) object;
        if ((this.ordermealid == null && other.ordermealid != null) || (this.ordermealid != null && !this.ordermealid.equals(other.ordermealid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enity.Ordermeal[ ordermealid=" + ordermealid + " ]";
    }
    
}
