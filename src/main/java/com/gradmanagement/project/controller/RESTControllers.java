package com.gradmanagement.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gradmanagement.project.model.GradsInfo;
import com.gradmanagement.project.service.GradsInfoDAO;

@Controller
public class RESTControllers {
	
	@Autowired
	private GradsInfoDAO gradDao;
	
	@RequestMapping("/user/showall")
	@CrossOrigin
	public List<GradsInfo> listGrads()
	{

		return gradDao.listGrad();
	}
	
	@RequestMapping("/user/delete/{id}")
	@CrossOrigin
	public List<GradsInfo> deleteById(@PathVariable int id)
	{
		return gradDao.deleteGrad(id);
	}
	
	
	
	
	
	@GetMapping("/user/new")
	public String newGrad()
	{
		return "new-grad";
	}
	
	@RequestMapping("/user/new/save")
	public String saveGrad(@ModelAttribute GradsInfo grad)
	{
		gradDao.saveGrad(grad);
		return "redirect:/user";
	}
	
	@RequestMapping("/user/edit")
	public String editGrad()
	{
		return "edit-grad";
	}
	
	@RequestMapping("user/edit/{id}")
	public ModelAndView editById(@PathVariable int id)
	{
		GradsInfo obj = gradDao.getGrad(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("fname",obj.getFname());
		mv.addObject("lname",obj.getLname());
		mv.addObject("gender",obj.getGender());
		mv.addObject("age",obj.getAge());
		mv.addObject("email",obj.getEmail());
		mv.addObject("contact",obj.getContact());
		mv.addObject("address",obj.getAddress());
		mv.setViewName("edit-by-id");
		return mv; 
	}
	
	@RequestMapping("/user/update")
	public String editGrad(@ModelAttribute GradsInfo grad)
	{
		gradDao.editGrad(grad);
		return "redirect:/user";
	}
	
	@RequestMapping("/user/delete")
	public String deleteGrad()
	{
		return "delete-grad";
	}
	
}
