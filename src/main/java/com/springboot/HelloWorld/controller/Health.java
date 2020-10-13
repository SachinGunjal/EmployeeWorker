package com.springboot.HelloWorld.controller;

import com.springboot.HelloWorld.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Health {

    private static final Logger logger = LoggerFactory.getLogger(Health.class);

    @RequestMapping(method = RequestMethod.GET)

    public String sayHello() {
        return "Hello";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{employeeNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Employee sayHelloWorld(@PathVariable int employeeNumber) {
        logger.info("setting employee details");
        Employee emp = new Employee();
        emp.setEmployeeNumber(employeeNumber);
        emp.setEmployeeName("Sachin");
        emp.setEmployeeAge(29);
        return emp;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/emp", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Employee getEmployee(@RequestBody Employee emp) {
        logger.info("returning employee details");
        return emp;
    }
}
