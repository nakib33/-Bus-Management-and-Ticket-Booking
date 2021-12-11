/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.ticket.booking;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Rasel
 */
@Entity
@Table(name = "employee", catalog = "bus", schema = "")
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findById", query = "SELECT e FROM Employee e WHERE e.id = :id"),
    @NamedQuery(name = "Employee.findByName", query = "SELECT e FROM Employee e WHERE e.name = :name"),
    @NamedQuery(name = "Employee.findByUsername", query = "SELECT e FROM Employee e WHERE e.username = :username"),
    @NamedQuery(name = "Employee.findByMcity", query = "SELECT e FROM Employee e WHERE e.mcity = :mcity"),
    @NamedQuery(name = "Employee.findByStreet", query = "SELECT e FROM Employee e WHERE e.street = :street"),
    @NamedQuery(name = "Employee.findByContact", query = "SELECT e FROM Employee e WHERE e.contact = :contact")})
public class Employee implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "mcity")
    private String mcity;
    @Basic(optional = false)
    @Column(name = "street")
    private String street;
    @Basic(optional = false)
    @Column(name = "contact")
    private String contact;

    public Employee() {
    }

    public Employee(Integer id) {
        this.id = id;
    }

    public Employee(Integer id, String name, String username, String mcity, String street, String contact) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.mcity = mcity;
        this.street = street;
        this.contact = contact;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getMcity() {
        return mcity;
    }

    public void setMcity(String mcity) {
        String oldMcity = this.mcity;
        this.mcity = mcity;
        changeSupport.firePropertyChange("mcity", oldMcity, mcity);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        String oldStreet = this.street;
        this.street = street;
        changeSupport.firePropertyChange("street", oldStreet, street);
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.ticket.booking.Employee[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
