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
@Table(name = "MEAL_FOOD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MealFood.findAll", query = "SELECT m FROM MealFood m")
    , @NamedQuery(name = "MealFood.findByMealFoodid", query = "SELECT m FROM MealFood m WHERE m.mealFoodPK.mealFoodid = :mealFoodid")
    , @NamedQuery(name = "MealFood.findByMealMealid", query = "SELECT m FROM MealFood m WHERE m.mealFoodPK.mealMealid = :mealMealid")
    , @NamedQuery(name = "MealFood.findByFoodFoodid", query = "SELECT m FROM MealFood m WHERE m.mealFoodPK.foodFoodid = :foodFoodid")})
public class MealFood implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MealFoodPK mealFoodPK;
    @JoinColumn(name = "FOOD_FOODID", referencedColumnName = "FOODID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Food food;
    @JoinColumn(name = "MEAL_MEALID", referencedColumnName = "MEALID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Meal meal;

    public MealFood() {
    }

    public MealFood(MealFoodPK mealFoodPK) {
        this.mealFoodPK = mealFoodPK;
    }

    public MealFood(String mealFoodid, String mealMealid, String foodFoodid) {
        this.mealFoodPK = new MealFoodPK(mealFoodid, mealMealid, foodFoodid);
    }

    public MealFoodPK getMealFoodPK() {
        return mealFoodPK;
    }

    public void setMealFoodPK(MealFoodPK mealFoodPK) {
        this.mealFoodPK = mealFoodPK;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mealFoodPK != null ? mealFoodPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MealFood)) {
            return false;
        }
        MealFood other = (MealFood) object;
        if ((this.mealFoodPK == null && other.mealFoodPK != null) || (this.mealFoodPK != null && !this.mealFoodPK.equals(other.mealFoodPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enity.MealFood[ mealFoodPK=" + mealFoodPK + " ]";
    }
    
}
