package com.example.crudrapido.service;

import com.example.crudrapido.entity.Teacher;
import com.example.crudrapido.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    //HAcemos inyeccion, llamamos al repositorio
    @Autowired
    TeacherRepository teacherRepository;
    //creamos metodos
    //Buscar
    public List<Teacher> getTeacher(){
        return teacherRepository.findAll();
    }
    //Buscar por ID
    public Optional<Teacher> getTeacher(Long id){
        return teacherRepository.findById(id);
    }
    //Guardar o actualizar
    public void saveOrUpdate(Teacher teacher){
        teacherRepository.save(teacher);
    }
    //Borrar por id
    public void delete(Long id){
        teacherRepository.deleteById(id);
    }
}

