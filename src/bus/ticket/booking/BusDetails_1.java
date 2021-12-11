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
@Table(name = "bus_details", catalog = "bus", schema = "")
@NamedQueries({
    @NamedQuery(name = "BusDetails_1.findAll", query = "SELECT b FROM BusDetails_1 b"),
    @NamedQuery(name = "BusDetails_1.findById", query = "SELECT b FROM BusDetails_1 b WHERE b.id = :id"),
    @NamedQuery(name = "BusDetails_1.findByBusNo", query = "SELECT b FROM BusDetails_1 b WHERE b.busNo = :busNo"),
    @NamedQuery(name = "BusDetails_1.findByTime", query = "SELECT b FROM BusDetails_1 b WHERE b.time = :time"),
    @NamedQuery(name = "BusDetails_1.findBySource", query = "SELECT b FROM BusDetails_1 b WHERE b.source = :source"),
    @NamedQuery(name = "BusDetails_1.findByDestination", query = "SELECT b FROM BusDetails_1 b WHERE b.destination = :destination"),
    @NamedQuery(name = "BusDetails_1.findByMovement", query = "SELECT b FROM BusDetails_1 b WHERE b.movement = :movement"),
    @NamedQuery(name = "BusDetails_1.findBySeat", query = "SELECT b FROM BusDetails_1 b WHERE b.seat = :seat"),
    @NamedQuery(name = "BusDetails_1.findByPrice", query = "SELECT b FROM BusDetails_1 b WHERE b.price = :price")})
public class BusDetails_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "busNo")
    private String busNo;
    @Basic(optional = false)
    @Column(name = "time")
    private String time;
    @Basic(optional = false)
    @Column(name = "source")
    private String source;
    @Basic(optional = false)
    @Column(name = "destination")
    private String destination;
    @Basic(optional = false)
    @Column(name = "movement")
    private String movement;
    @Basic(optional = false)
    @Column(name = "seat")
    private String seat;
    @Column(name = "price")
    private String price;

    public BusDetails_1() {
    }

    public BusDetails_1(Integer id) {
        this.id = id;
    }

    public BusDetails_1(Integer id, String busNo, String time, String source, String destination, String movement, String seat) {
        this.id = id;
        this.busNo = busNo;
        this.time = time;
        this.source = source;
        this.destination = destination;
        this.movement = movement;
        this.seat = seat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        String oldBusNo = this.busNo;
        this.busNo = busNo;
        changeSupport.firePropertyChange("busNo", oldBusNo, busNo);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        String oldSource = this.source;
        this.source = source;
        changeSupport.firePropertyChange("source", oldSource, source);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        String oldDestination = this.destination;
        this.destination = destination;
        changeSupport.firePropertyChange("destination", oldDestination, destination);
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        String oldMovement = this.movement;
        this.movement = movement;
        changeSupport.firePropertyChange("movement", oldMovement, movement);
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        String oldSeat = this.seat;
        this.seat = seat;
        changeSupport.firePropertyChange("seat", oldSeat, seat);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        String oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
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
        if (!(object instanceof BusDetails_1)) {
            return false;
        }
        BusDetails_1 other = (BusDetails_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.ticket.booking.BusDetails_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
