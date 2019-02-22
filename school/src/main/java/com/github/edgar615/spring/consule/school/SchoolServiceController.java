package com.github.edgar615.spring.consule.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolServiceController {

    @Autowired
    StudentExtenalDelegate studentExtenalDelegate;

    @GetMapping("/students/{schoolname}")
    public String getStudents(@PathVariable String schoolname)
    {
        System.out.println("Going to call student service to get data!");
        return studentExtenalDelegate.callStudentServiceAndGetData(schoolname);
    }
}
