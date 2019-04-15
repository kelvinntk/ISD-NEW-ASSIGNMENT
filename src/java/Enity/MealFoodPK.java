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
public class MealFoodPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MEAL_FOODID")
    private String mealFoodid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MEAL_MEALID")
    private String mealMealid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FOOD_FOODID")
    private String foodFoodid;

    public MealFoodPK() {
    }

    public MealFoodPK(String mealFoodid, String mealMealid, String foodFoodid) {
        this.mealFoodid = mealFoodid;
        this.mealMealid = mealMealid;
        this.foodFoodid = foodFoodid;
    }

    public String getMealFoodid() {
        return mealFoodid;
    }

    public void setMealFoodid(String mealFoodid) {
        this.mealFoodid = mealFoodid;
    }

    public String getMealMealid() {
        return mealMealid;
    }

    public void setMealMealid(String mealMealid) {
        this.mealMealid = mealMealid;
    }

    public String getFoodFoodid() {
        return foodFoodid;
    }

    public void setFoodFoodid(String foodFoodid) {
        this.foodFoodid = foodFoodid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mealFoodid != null ? mealFoodid.hashCode() : 0);
        hash += (mealMealid != null ? mealMealid.hashCode() : 0);
        hash += (foodFoodid != null ? foodFoodid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MealFoodPK)) {
            return false;
        }
        MealFoodPK other = (MealFoodPK) object;
        if ((this.mealFoodid == null && other.mealFoodid != null) || (this.mealFoodid != null && !this.mealFoodid.equals(other.mealFoodid))) {
            return false;
        }
        if ((this.mealMealid == null && other.mealMealid != null) || (this.mealMealid != null && !this.mealMealid.equals(other.mealMealid))) {
            return false;
        }
        if ((this.foodFoodid == null && other.foodFoodid != null) || (this.foodFoodid != null && !this.foodFoodid.equals(other.foodFoodid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enity.MealFoodPK[ mealFoodid=" + mealFoodid + ", mealMealid=" + mealMealid + ", foodFoodid=" + foodFoodid + " ]";
    }
    
}
