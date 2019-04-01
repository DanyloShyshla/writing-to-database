/*
package ua.lviv.iot.dbsample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    @RequestMapping("/student")
    public Student getStudent() {
        return studentRepository.findById(2).get();
    }

    @PostMapping
    @RequestMapping("/student")
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
}*/
