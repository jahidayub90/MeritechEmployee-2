package com.MeritechEmployee.Controller;

import com.MeritechEmployee.Entity.Employee;
import com.MeritechEmployee.Repository.EmployeeRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository emprepo;


    @PostMapping("/register")
    public String EmployeeResidter(@ModelAttribute Employee emp, HttpSession session) {
       System.out.println(emp);
        emprepo.save(emp);
        session.setAttribute("message" , "User Register Successfully...");




        return "Registered Successfully...";


    }
}