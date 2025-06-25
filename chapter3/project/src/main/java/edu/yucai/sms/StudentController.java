package edu.yucai.sms;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private final List<Student> students = new ArrayList<>(List.of(new Student("李华", "男", 10)));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return this.students;
    }

    @GetMapping("/students/{index}")
    public Student getStudent(@PathVariable int index) {
        return this.students.get(index);
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student request) {
        this.students.add(request);
        return request;
    }

    @PutMapping("/students/{index}")
    public Student updateStudent(@PathVariable int index, @RequestBody Student request) {
        this.students.set(index, request);
        return request;
    }

    @DeleteMapping("/students/{index}")
    public void deleteStudent(@PathVariable int index) {
        this.students.remove(index);
    }
}
