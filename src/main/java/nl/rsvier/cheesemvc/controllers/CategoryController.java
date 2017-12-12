package nl.rsvier.cheesemvc.controllers;

import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import nl.rsvier.models.*;
import nl.rsvier.models.data.CategoryDao;


@Controller
@RequestMapping("chooseCategory")
public class CategoryController {
	
	@Autowired private CategoryDao categoryDao;
	
	
	@RequestMapping  
	public String category(Model model){

		model.addAttribute("title","Categories");
		model.addAttribute("categories", categoryDao.findAll());
	
		return "chooseCategory";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
