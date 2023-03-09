package com.example.crudrapido.controller;

import com.example.crudrapido.entity.Teacher;
import com.example.crudrapido.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/teachers")
public class TeacherController {
    // hacemops inyeccion y llamamos los servicios
    @Autowired
    private TeacherService teacherService;
    //buscar
    @GetMapping
    public List<Teacher> getAll(){
        return teacherService.getTeacher();
    }
    //Buscar por ID
    @GetMapping("{teacherId}")
    public Optional<Teacher> getById(@PathVariable("teacherId") Long teacherId){
        return teacherService.getTeacher(teacherId);
    }
    //guardar y actualizar
    @PostMapping
    public Teacher save(@RequestBody Teacher teacher){
        teacherService.saveOrUpdate(teacher);
        return teacher;
    }
    //borrar por id
    @DeleteMapping("{teacherId}")
    public void delete(@PathVariable("teacherId") Long teacherId){
        teacherService.delete(teacherId);
    }
}
