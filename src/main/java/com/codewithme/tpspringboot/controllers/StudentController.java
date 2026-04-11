//package com.codewithme.tpspringboot.controllers;
//
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/students")
//public class StudentController {
//
//    @Autowired
//    private repositories.StudentRepository studentRepository;
//
//    @GetMapping
//    public List<Student> getAll() {
//        return studentRepository.findAll();
//    }
//
//    @PostMapping
//    public Student create(@RequestBody @Valid Student student) {
//        return studentRepository.save(student);
//    }
//
//    @GetMapping("/{id}")
//    public Student getById(@PathVariable Long id) {
//        return studentRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Student not found"));
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id) {
//        studentRepository.deleteById(id);
//    }
//}