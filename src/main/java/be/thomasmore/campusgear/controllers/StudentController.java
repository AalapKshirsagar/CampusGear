package be.thomasmore.campusgear.controllers;

import be.thomasmore.campusgear.model.Student;
import be.thomasmore.campusgear.repositories.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/studentdetails")
    public String studentDetails(Model model) {
        Optional<Student> studentFromDb = studentRepository.findById(1);
        if (studentFromDb.isPresent()) {
            model.addAttribute("student", studentFromDb.get());
        }
        return "studentdetails";
    }
}