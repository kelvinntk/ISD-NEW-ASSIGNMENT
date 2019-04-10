/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    , @NamedQuery(name = "Meal.findByMealprice", query = "SELECT m FROM Meal m WHERE m.mealprice = :mealprice")})
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
    @Lob
    @Column(name = "MEALIMAGE")
    private Serializable mealimage;
    @ManyToMany(mappedBy = "mealList")
    private List<Food> foodList;
    @JoinTable(name = "ORDERMEAL", joinColumns = {
        @JoinColumn(name = "MEAL_MEALID", referencedColumnName = "MEALID")}, inverseJoinColumns = {
        @JoinColumn(name = "ORDER_ORDERID", referencedColumnName = "ORDERID")
        , @JoinColumn(name = "ORDER_STUDENT_STUDID", referencedColumnName = "STUDENT_STUDID")})
    @ManyToMany
    private List<Order1> order1List;

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

    public Serializable getMealimage() {
        return mealimage;
    }

    public void setMealimage(Serializable mealimage) {
        this.mealimage = mealimage;
    }

    @XmlTransient
    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    @XmlTransient
    public List<Order1> getOrder1List() {
        return order1List;
    }

    public void setOrder1List(List<Order1> order1List) {
        this.order1List = order1List;
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
