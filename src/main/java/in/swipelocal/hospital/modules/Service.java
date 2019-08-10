package in.swipelocal.hospital.modules;

import javax.persistence.*;

@Entity
@Table(name = "Service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;

    public Service(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
