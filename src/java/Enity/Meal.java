/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kelvin Ng Tiong Kiat
 */
@Entity
@Table(name = "MEAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Meal.findAll", query = "SELECT m FROM Meal m")
    , @NamedQuery(name = "Meal.findByMealid", query = "SELECT m FROM Meal m WHERE m.mealid = :mealid")
    , @NamedQuery(name = "Meal.findByMealname", query = "SELECT m FROM Meal m WHERE m.mealname = :mealname")
    , @NamedQuery(name = "Meal.findByMealdesc", query = "SELECT m FROM Meal m WHERE m.mealdesc = :mealdesc")
    , @NamedQuery(name = "Meal.findByMealprice", query = "SELECT m FROM Meal m WHERE m.mealprice = :mealprice")
    , @NamedQuery(name = "Meal.findByMealimage", query = "SELECT m FROM Meal m WHERE m.mealimage = :mealimage")
    , @NamedQuery(name = "Meal.findByMealcategory", query = "SELECT m FROM Meal m WHERE m.mealcategory = :mealcategory")})
public class Meal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MEALID")
    private String mealid;
    @Size(max = 50)
    @Column(name = "MEALNAME")
    private String mealname;
    @Size(max = 300)
    @Column(name = "MEALDESC")
    private String mealdesc;
    @Column(name = "MEALPRICE")
    private Integer mealprice;
    @Size(max = 50)
    @Column(name = "MEALIMAGE")
    private String mealimage;
    @Size(max = 50)
    @Column(name = "MEALCATEGORY")
    private String mealcategory;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mealMealid")
    private List<MealFood> mealFoodList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mealMealid")
    private List<Ordermeal> ordermealList;

    public Meal() {
    }

    public Meal(String mealid) {
        this.mealid = mealid;
    }

    public String getMealid() {
        return mealid;
    }

    public void setMealid(String mealid) {
        this.mealid = mealid;
    }

    public String getMealname() {
        return mealname;
    }

    public void setMealname(String mealname) {
        this.mealname = mealname;
    }

    public String getMealdesc() {
        return mealdesc;
    }

    public void setMealdesc(String mealdesc) {
        this.mealdesc = mealdesc;
    }

    public Integer getMealprice() {
        return mealprice;
    }

    public void setMealprice(Integer mealprice) {
        this.mealprice = mealprice;
    }

    public String getMealimage() {
        return mealimage;
    }

    public void setMealimage(String mealimage) {
        this.mealimage = mealimage;
    }

    public String getMealcategory() {
        return mealcategory;
    }

    public void setMealcategory(String mealcategory) {
        this.mealcategory = mealcategory;
    }

    @XmlTransient
    public List<MealFood> getMealFoodList() {
        return mealFoodList;
    }

    public void setMealFoodList(List<MealFood> mealFoodList) {
        this.mealFoodList = mealFoodList;
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
        hash += (mealid != null ? mealid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Meal)) {
            return false;
        }
        Meal other = (Meal) object;
        if ((this.mealid == null && other.mealid != null) || (this.mealid != null && !this.mealid.equals(other.mealid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enity.Meal[ mealid=" + mealid + " ]";
    }
    
}
