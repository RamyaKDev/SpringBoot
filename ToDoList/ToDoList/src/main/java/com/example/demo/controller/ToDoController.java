package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/todo")
public class ToDoController {
	
	@GetMapping
	public String show_todo_page(Model model, HttpSession session)
	{
	List<String> taskList = (List<String>)	session.getAttribute("tasks"); 
	if(taskList == null)
	{
		taskList = new ArrayList<String>(); 
		session.setAttribute("tasks", taskList);
		
	}
	model.addAttribute("taskL", taskList);
		
		return "todo"; 
	}
	
	@PostMapping("/add")
	public String add_task(@RequestParam String task, HttpSession session)
	{
		List<String> taskList = (List<String>)	session.getAttribute("tasks"); 
		if(taskList == null)
		{
			taskList = new ArrayList<String>(); 
			session.setAttribute("tasks", taskList);
			
		}
		taskList.add(task);
		return "redirect:/todo";
	}
	
	@PostMapping("/remove")
	public String remove_task(@RequestParam int  index, HttpSession session)
	{
		List<String> taskList = (List<String>)	session.getAttribute("tasks"); 
		taskList.remove(index);
		return "redirect:/todo";
	}
	
	@PostMapping("/remove_all")
	public String remove_all_tasks(HttpSession session)
	{
		session.removeAttribute("tasks");
		return "redirect:/todo";
	}
	
	
	
	
	
	
	
	
	
}
