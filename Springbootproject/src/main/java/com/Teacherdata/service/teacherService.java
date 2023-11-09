package com.Teacherdata.service;


import com.Teacherdata.entities.teacher;
import com.Teacherdata.repositories.teacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class teacherService {
    @Autowired
    private teacherRepo teacherrepoo;

    public teacher createTeacher(teacher teachers ){
        teacher teacherdata =new teacher();
        teacherdata.setTeacher_name(teachers.getTeacher_name());
        teacherdata.setTeacher_salary(teachers.getTeacher_salary());
        teacherdata.setSubject(teachers.getSubject());
        return this.teacherrepoo.save(teacherdata);

    }
    public teacher teacherById(int teacherid){
         return this.teacherrepoo.findById(teacherid).get();
    }
    public teacher updateteacher(int teacherid,teacher updateteacher){
        teacher data=this.teacherrepoo.findById(teacherid).get();
        teacher newdata= new teacher();
        if(data.getTeacher_name()!=null){

            newdata.setTeacher_id(teacherid);
            newdata.setTeacher_name(updateteacher.getTeacher_name());
            newdata.setTeacher_salary(updateteacher.getTeacher_salary());
            newdata.setSubject(updateteacher.getSubject());
             this.teacherrepoo.save(newdata);
        }
        else{
            System.out.println("not found");
        }
        return newdata;
    }
    public void deleteteacher(int teacherid){
        this.teacherrepoo.deleteById(teacherid);
    }
}


