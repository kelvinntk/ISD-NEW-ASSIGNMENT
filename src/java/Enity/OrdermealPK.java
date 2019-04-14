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
 * @author Kelvin Ng Tiong Kiat
 */
@Embeddable
public class OrdermealPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ORDERMEALID")
    private String ordermealid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ORDER_ORDERID")
    private String orderOrderid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ORDER_STUDENT_STUDID")
    private String orderStudentStudid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MEAL_MEALID")
    private String mealMealid;

    public OrdermealPK() {
    }

    public OrdermealPK(String ordermealid, String orderOrderid, String orderStudentStudid, String mealMealid) {
        this.ordermealid = ordermealid;
        this.orderOrderid = orderOrderid;
        this.orderStudentStudid = orderStudentStudid;
        this.mealMealid = mealMealid;
    }

    public String getOrdermealid() {
        return ordermealid;
    }

    public void setOrdermealid(String ordermealid) {
        this.ordermealid = ordermealid;
    }

    public String getOrderOrderid() {
        return orderOrderid;
    }

    public void setOrderOrderid(String orderOrderid) {
        this.orderOrderid = orderOrderid;
    }

    public String getOrderStudentStudid() {
        return orderStudentStudid;
    }

    public void setOrderStudentStudid(String orderStudentStudid) {
        this.orderStudentStudid = orderStudentStudid;
    }

    public String getMealMealid() {
        return mealMealid;
    }

    public void setMealMealid(String mealMealid) {
        this.mealMealid = mealMealid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordermealid != null ? ordermealid.hashCode() : 0);
        hash += (orderOrderid != null ? orderOrderid.hashCode() : 0);
        hash += (orderStudentStudid != null ? orderStudentStudid.hashCode() : 0);
        hash += (mealMealid != null ? mealMealid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdermealPK)) {
            return false;
        }
        OrdermealPK other = (OrdermealPK) object;
        if ((this.ordermealid == null && other.ordermealid != null) || (this.ordermealid != null && !this.ordermealid.equals(other.ordermealid))) {
            return false;
        }
        if ((this.orderOrderid == null && other.orderOrderid != null) || (this.orderOrderid != null && !this.orderOrderid.equals(other.orderOrderid))) {
            return false;
        }
        if ((this.orderStudentStudid == null && other.orderStudentStudid != null) || (this.orderStudentStudid != null && !this.orderStudentStudid.equals(other.orderStudentStudid))) {
            return false;
        }
        if ((this.mealMealid == null && other.mealMealid != null) || (this.mealMealid != null && !this.mealMealid.equals(other.mealMealid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enity.OrdermealPK[ ordermealid=" + ordermealid + ", orderOrderid=" + orderOrderid + ", orderStudentStudid=" + orderStudentStudid + ", mealMealid=" + mealMealid + " ]";
    }
    
}
