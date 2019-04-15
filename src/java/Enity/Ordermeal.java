/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
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
    , @NamedQuery(name = "Ordermeal.findByOrdermealid", query = "SELECT o FROM Ordermeal o WHERE o.ordermealPK.ordermealid = :ordermealid")
    , @NamedQuery(name = "Ordermeal.findByOrderCartOrderid", query = "SELECT o FROM Ordermeal o WHERE o.ordermealPK.orderCartOrderid = :orderCartOrderid")
    , @NamedQuery(name = "Ordermeal.findByOrderCartStudentStudid", query = "SELECT o FROM Ordermeal o WHERE o.ordermealPK.orderCartStudentStudid = :orderCartStudentStudid")
    , @NamedQuery(name = "Ordermeal.findByMealMealid", query = "SELECT o FROM Ordermeal o WHERE o.ordermealPK.mealMealid = :mealMealid")})
public class Ordermeal implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrdermealPK ordermealPK;
    @JoinColumn(name = "MEAL_MEALID", referencedColumnName = "MEALID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Meal meal;
    @JoinColumns({
        @JoinColumn(name = "ORDER_CART_ORDERID", referencedColumnName = "ORDERID", insertable = false, updatable = false)
        , @JoinColumn(name = "ORDER_CART_STUDENT_STUDID", referencedColumnName = "STUDENT_STUDID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private OrderCart orderCart;

    public Ordermeal() {
    }

    public Ordermeal(OrdermealPK ordermealPK) {
        this.ordermealPK = ordermealPK;
    }

    public Ordermeal(String ordermealid, String orderCartOrderid, String orderCartStudentStudid, String mealMealid) {
        this.ordermealPK = new OrdermealPK(ordermealid, orderCartOrderid, orderCartStudentStudid, mealMealid);
    }

    public OrdermealPK getOrdermealPK() {
        return ordermealPK;
    }

    public void setOrdermealPK(OrdermealPK ordermealPK) {
        this.ordermealPK = ordermealPK;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public OrderCart getOrderCart() {
        return orderCart;
    }

    public void setOrderCart(OrderCart orderCart) {
        this.orderCart = orderCart;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordermealPK != null ? ordermealPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordermeal)) {
            return false;
        }
        Ordermeal other = (Ordermeal) object;
        if ((this.ordermealPK == null && other.ordermealPK != null) || (this.ordermealPK != null && !this.ordermealPK.equals(other.ordermealPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enity.Ordermeal[ ordermealPK=" + ordermealPK + " ]";
    }
    
}
