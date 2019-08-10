package in.swipelocal.hospital.modules;

import in.swipelocal.hospital.modules.Contact;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
@Entity
@Table(name = "Availability")
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Contact contact;

    private Date date;
    private Time time_From;
    private Time time_To;

    public Availability(Contact contact, Date date, Time time_From, Time time_To) {
        this.contact = contact;
        this.date = date;
        this.time_From = time_From;
        this.time_To = time_To;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Time getTime_From() {
        return time_From;
    }

    public void setTime_From(Time time_From) {
        this.time_From = time_From;
    }

    public Time getTime_To() {
        return time_To;
    }

    public void setTime_To(Time time_To) {
        this.time_To = time_To;
    }

    @Override
    public String toString() {
        return "Availability{" +
                "id=" + id +
                ", contact=" + contact +
                ", date=" + date +
                ", time_From=" + time_From +
                ", time_To=" + time_To +
                '}';
    }
}
