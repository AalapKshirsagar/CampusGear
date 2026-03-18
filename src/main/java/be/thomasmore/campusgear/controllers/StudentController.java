package be.thomasmore.campusgear.controllers;

import be.thomasmore.campusgear.model.Student;
import be.thomasmore.campusgear.repositories.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/studentlist")
    public String studentList(Model model) {
        Iterable<Student> studenten = studentRepository.findAll();
        model.addAttribute("studenten", studenten);
        return "studentlist";
    }

    @GetMapping({"/studentdetails", "/studentdetails/{id}"})
    public String studentDetails(
            @PathVariable(required = false) Integer id,
            Model model) {
        if (id != null) {
            Optional<Student> studentFromDb = studentRepository.findById(id);
            if (studentFromDb.isPresent()) {
                model.addAttribute("student", studentFromDb.get());
            }
        }
        return "studentdetails";
    }
}