package com.launchcode.helloworld.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    //we need a method

    //a request mapping -> maps an HTTP [path + method} to a Java router handler
    //value -> path (RELATIVE PATH, relative to the controller
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody // annotation to send back literal value returned from method
    public String Hello() {
        return "<form action='/form' method= 'post'> " +
                "<input type='text' name='name'>" +
                " <select name='language'> " +
                "  <option value='1'>English</option> " +
                "  <option value='2'>French</option> " +
                "  <option value='3'>Spanish</option> " +
                "  <option value='4'>Chinese</option> " +
                "  <option value='5'>Japanese</option> " +
                "  </select>" +
                "<input type='submit' name='Greet me!'>" +
                "</form>";
    }


    @RequestMapping(value = "form", method = RequestMethod.POST)
    @ResponseBody // annotation to send back literal value returned from method
    public static String SubmitForm(String name, String languague){
       String UserName, Userlanguage;

        return "hello";
    }
}