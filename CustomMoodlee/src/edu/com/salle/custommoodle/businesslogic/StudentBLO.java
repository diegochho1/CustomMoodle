/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.com.salle.custommoodle.businesslogic;

import edu.com.salle.custommoodle.dataacess.StudentDAO;
import edu.com.salle.custommoodle.dataacess.imple.StudentDAOListImple;
import edu.com.salle.custommoodle.dataacess.imple.StudentDAOMySQL;
import edu.com.salle.custommoodle.model.Student;
import java.util.List;

/**
 *
 * @author dieg
 * CAPA DE LOGICA DE NEGOCIOOOSS
 */
public class StudentBLO {
    private StudentDAO studentDAO;
    
    public StudentBLO(){
        studentDAO =                                                                                                            new StudentDAOListImple();
    }
            
    public Student save(Student student){
       return studentDAO.save(student);
    }
    public List<Student> findAll(){
        return studentDAO.findAll();
    }
    public Student find(String id){
        return studentDAO.find(id);
    }
    public List<Student> findByLastName(String lastName){// ahora va a retornar una lsita
        return studentDAO.findByLastName(lastName);
    }
    
    public void delete(Student student){
        studentDAO.delete(student);
    }
    
    public void update(Student student){
        studentDAO.update(student);
    }
    public void load(){ //metodos para mandar a llamar
       studentDAO.load(); 
    }
    public void commitChanges(){
        studentDAO.commitChanges();
    }
     public List<Student> findById(String name1){// ahora va a retornar una lsita
        return studentDAO.findById(name1);
    }
}
