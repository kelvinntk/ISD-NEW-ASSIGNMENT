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
    , @NamedQuery(name = "Ordermeal.findByOrderOrderid", query = "SELECT o FROM Ordermeal o WHERE o.ordermealPK.orderOrderid = :orderOrderid")
    , @NamedQuery(name = "Ordermeal.findByOrderStudentStudid", query = "SELECT o FROM Ordermeal o WHERE o.ordermealPK.orderStudentStudid = :orderStudentStudid")
    , @NamedQuery(name = "Ordermeal.findByMealMealid", query = "SELECT o FROM Ordermeal o WHERE o.ordermealPK.mealMealid = :mealMealid")})
public class Ordermeal implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrdermealPK ordermealPK;
    @JoinColumn(name = "MEAL_MEALID", referencedColumnName = "MEALID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Meal meal;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ORDERID", referencedColumnName = "ORDERID", insertable = false, updatable = false)
        , @JoinColumn(name = "ORDER_STUDENT_STUDID", referencedColumnName = "STUDENT_STUDID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Order1 order1;

    public Ordermeal() {
    }

    public Ordermeal(OrdermealPK ordermealPK) {
        this.ordermealPK = ordermealPK;
    }

    public Ordermeal(String ordermealid, String orderOrderid, String orderStudentStudid, String mealMealid) {
        this.ordermealPK = new OrdermealPK(ordermealid, orderOrderid, orderStudentStudid, mealMealid);
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

    public Order1 getOrder1() {
        return order1;
    }

    public void setOrder1(Order1 order1) {
        this.order1 = order1;
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
