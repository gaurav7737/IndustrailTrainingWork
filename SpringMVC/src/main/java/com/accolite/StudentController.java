package com.accolite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class StudentController {
   @RequestMapping(value = "/student", method = RequestMethod.GET,produces = "application/json")
   public ModelAndView student() {
      return new ModelAndView("student", "command", new Student());
   }
   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
      public String addStudent(@ModelAttribute("SpringAssignment")Student student, 
   
   ModelMap model) {
      model.addAttribute("studentName", student.getStudentName());
      model.addAttribute("studentId", student.getStudentId());
      
      return "result";
   }
}
