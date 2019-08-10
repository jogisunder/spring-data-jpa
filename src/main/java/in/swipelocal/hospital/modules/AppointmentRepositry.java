package in.swipelocal.hospital.modules;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppointmentRepositry extends CrudRepository<Appointment, Long> {

    List<Contact> findByLastName(String lastName);
}
