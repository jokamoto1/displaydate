package com.jeremy.displaydate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeremy.displaydate.App;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
@SpringBootApplication
@Controller
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpringApplication.run(App.class, args);

	}
	// class definition and imports here...
//    @RequestMapping("/")
//    public String index(Model model) {
//        
//        String name = "Grace Hopper";
//        String itemName = "Copper wire";
//        double price = 5.25;
//        String description = "Metal strips, also an illustration of nanoseconds.";
//        String vendor = "Little Things Corner Store";
//        model.addAttribute("name", name);
//        model.addAttribute("itemName", itemName);
//        model.addAttribute("price", price);
//        model.addAttribute("description", description);
//        model.addAttribute("vendor", vendor);
//    	// Your code here! Add values to the view model to be rendered
//    
//        return "index.jsp";
//    }
	@RequestMapping("/")
	public String dashboard() {
		return "dashboard.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		LocalDate date = LocalDate.now();
		model.addAttribute("date",date);
		
		
		
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		LocalTime time = LocalTime.now();
		model.addAttribute("time",time);
		
		
		
		return "time.jsp";
	}
    //

}
