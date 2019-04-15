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
    @Column(name = "ORDER_CART_ORDERID")
    private String orderCartOrderid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ORDER_CART_STUDENT_STUDID")
    private String orderCartStudentStudid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MEAL_MEALID")
    private String mealMealid;

    public OrdermealPK() {
    }

    public OrdermealPK(String ordermealid, String orderCartOrderid, String orderCartStudentStudid, String mealMealid) {
        this.ordermealid = ordermealid;
        this.orderCartOrderid = orderCartOrderid;
        this.orderCartStudentStudid = orderCartStudentStudid;
        this.mealMealid = mealMealid;
    }

    public String getOrdermealid() {
        return ordermealid;
    }

    public void setOrdermealid(String ordermealid) {
        this.ordermealid = ordermealid;
    }

    public String getOrderCartOrderid() {
        return orderCartOrderid;
    }

    public void setOrderCartOrderid(String orderCartOrderid) {
        this.orderCartOrderid = orderCartOrderid;
    }

    public String getOrderCartStudentStudid() {
        return orderCartStudentStudid;
    }

    public void setOrderCartStudentStudid(String orderCartStudentStudid) {
        this.orderCartStudentStudid = orderCartStudentStudid;
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
        hash += (orderCartOrderid != null ? orderCartOrderid.hashCode() : 0);
        hash += (orderCartStudentStudid != null ? orderCartStudentStudid.hashCode() : 0);
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
        if ((this.orderCartOrderid == null && other.orderCartOrderid != null) || (this.orderCartOrderid != null && !this.orderCartOrderid.equals(other.orderCartOrderid))) {
            return false;
        }
        if ((this.orderCartStudentStudid == null && other.orderCartStudentStudid != null) || (this.orderCartStudentStudid != null && !this.orderCartStudentStudid.equals(other.orderCartStudentStudid))) {
            return false;
        }
        if ((this.mealMealid == null && other.mealMealid != null) || (this.mealMealid != null && !this.mealMealid.equals(other.mealMealid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enity.OrdermealPK[ ordermealid=" + ordermealid + ", orderCartOrderid=" + orderCartOrderid + ", orderCartStudentStudid=" + orderCartStudentStudid + ", mealMealid=" + mealMealid + " ]";
    }
    
}
