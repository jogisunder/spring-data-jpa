package in.swipelocal.hospital.modules;

import javax.persistence.*;

public class ContactType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

}
