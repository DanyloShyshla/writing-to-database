package ua.lviv.iot.dbsample;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository 
    extends CrudRepository<Student, Integer> {

}
