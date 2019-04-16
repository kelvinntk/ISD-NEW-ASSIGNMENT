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
@Table(name = "MEAL_FOOD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MealFood.findAll", query = "SELECT m FROM MealFood m")
    , @NamedQuery(name = "MealFood.findByMealFoodid", query = "SELECT m FROM MealFood m WHERE m.mealFoodid = :mealFoodid")})
public class MealFood implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MEAL_FOODID")
    private String mealFoodid;
    @JoinColumn(name = "FOOD_FOODID", referencedColumnName = "FOODID")
    @ManyToOne(optional = false)
    private Food foodFoodid;
    @JoinColumn(name = "MEAL_MEALID", referencedColumnName = "MEALID")
    @ManyToOne(optional = false)
    private Meal mealMealid;

    public MealFood() {
    }
    
    public MealFood(String mealFoodid, Meal mealMealid, Food foodFoodid) {
       this.mealFoodid = mealFoodid;
       this.mealMealid = mealMealid;
       this.foodFoodid = foodFoodid;
    }
    
    public MealFood(String mealFoodid) {
        this.mealFoodid = mealFoodid;
    }

    public String getMealFoodid() {
        return mealFoodid;
    }

    public void setMealFoodid(String mealFoodid) {
        this.mealFoodid = mealFoodid;
    }

    public Food getFoodFoodid() {
        return foodFoodid;
    }

    public void setFoodFoodid(Food foodFoodid) {
        this.foodFoodid = foodFoodid;
    }

    public Meal getMealMealid() {
        return mealMealid;
    }

    public void setMealMealid(Meal mealMealid) {
        this.mealMealid = mealMealid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mealFoodid != null ? mealFoodid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MealFood)) {
            return false;
        }
        MealFood other = (MealFood) object;
        if ((this.mealFoodid == null && other.mealFoodid != null) || (this.mealFoodid != null && !this.mealFoodid.equals(other.mealFoodid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enity.MealFood[ mealFoodid=" + mealFoodid + " ]";
    }
    
}
