/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.com.salle.custommoodle.dataacess.imple;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.com.salle.custommoodle.dataacess.StudentDAO;
import edu.com.salle.custommoodle.model.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class StudentDAOListImple implements StudentDAO {
    private static List<Student> studentList = new ArrayList<>();

    @Override
    public Student save(Student student) {
            String Id = Integer.toString(studentList.size() +1);
            student.setId(Id);
            studentList.add(student); //cuando carga mete el archivo a una lista estatica 
            return student;
        }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public Student find(String id) {
     for (Student student : studentList){
         if(student.getId().equals(id)){
             return student;
         }
     }
     return null;
    }

    @Override
    public List<Student> findByLastName(String lastName) {
    List<Student> resStudentList = new ArrayList<>();
    lastName = lastName.toLowerCase().trim();
    for (Student student : studentList){
        if(student.getLastName().toLowerCase().
                contains(lastName)|| student.getName().toLowerCase().contains(lastName)){
            resStudentList.add(student); //se va a meter y todos los que hagan mach va a retornar
        }
    }
    return resStudentList;
    }

    @Override
    public void delete(Student student) {//recibimos un student y directamente sobre la lista eliminamos
      studentList.remove(student);
    }

    @Override
    public void update(Student student) {
       int pos = studentList.indexOf(student);//obtener la posicion
       studentList.set(pos, student);//y en esa misma posicion se le va a set (hacer el cambio)
    }

    @Override
    public void load() { //va a leer todos los studiantes y va a pasar a la libreria
        try{
        Gson gson = new Gson();
        BufferedReader br =
                new BufferedReader(new FileReader("students.json"));
        studentList = gson.fromJson(br, new TypeToken<List<Student>>(){
    }.getType());
        br.close();
        if(studentList == null){
            studentList = new ArrayList<>();
        }
    } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void commitChanges() { //la libreria la va a convertir para guardar al final
        try{
            Gson gson = new Gson();
            FileWriter writer = new FileWriter("students.json");
            writer.write(gson.toJson(studentList));
            writer.close();
        } catch(Exception ex){
            ex.printStackTrace();
        }
        
    }

    @Override
    public List<Student> findById(String name1) {
    List<Student> resStudentList = new ArrayList<>();
    name1 = name1.toLowerCase().trim();
    for (Student student : studentList){
        if(student.getId().toLowerCase().
                contains(name1)){
            resStudentList.add(student); //se va a meter y todos los que hagan mach va a retornar
        }
    }
    return resStudentList; }

}
