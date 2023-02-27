package com.indopay.myapp.indopay_myapp.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.indopay.myapp.indopay_myapp.model.ResponseApi;
import com.indopay.myapp.indopay_myapp.service.NewsService;

@Controller
public class NewsController {
    
    @GetMapping(value = "/Categorizednews/{country}/{category}")
	public String sendCategorizedUpdate(@PathVariable String country,@PathVariable String category, Model model) throws ParseException, IOException {
        List<ResponseApi> response = NewsService.sendCategorizedUpdate(country,category);
        model.addAttribute("respones", response);
		model.addAttribute("categories", category);
		return "news";

	} 
}
