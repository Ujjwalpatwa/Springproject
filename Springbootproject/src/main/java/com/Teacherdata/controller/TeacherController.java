package com.Teacherdata.controller;

import com.Teacherdata.entities.teacher;
import com.Teacherdata.service.teacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Teacher")
@CrossOrigin("*")
public class TeacherController {
    @Autowired
    private teacherService teacherRecordService;

    @PostMapping("/create")
    public teacher createTeacher(@RequestBody teacher teacherRecord){
        return this.teacherRecordService.createTeacher(teacherRecord);
    }
    @GetMapping("/getTeacher/{TeacherId}")
    public teacher getTeacher(@PathVariable Integer TeacherId ){
         return this.teacherRecordService.teacherById(TeacherId);
    }
    @PutMapping("/update/{TeacherId}")
    public teacher updateTeacherRecord(@PathVariable Integer TeacherId,@RequestBody teacher teacherRecord){
        return this.teacherRecordService.updateteacher(TeacherId,teacherRecord);
    }
    @DeleteMapping("/delete/{TeacherId}")
    public void deleteTeacherRecord(@PathVariable int TeacherId){
         this.teacherRecordService.deleteteacher(TeacherId);
    }

}
