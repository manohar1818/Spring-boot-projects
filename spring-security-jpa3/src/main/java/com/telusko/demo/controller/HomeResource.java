package com.telusko.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import org.dom4j.rule.Mode;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;


import com.telusko.demo.model.Article;
import com.telusko.demo.repository.ArticleRepository;
import com.telusko.demo.service.ArticleService;



@Controller

public class HomeResource {
	
	
	
    @Autowired
    ArticleRepository articleRepository;
    
    
	@RequestMapping("/add")
	public String addAlien(Article article)
	{
		articleRepository.save(article);
		return "home.jsp";
	}
    
    
    @RequestMapping("/addArticle") // Map ONLY POST Requests
    public @ResponseBody String addNewUser ( @RequestParam String title,
        @RequestParam String Category,
        @RequestParam String Description,
    @RequestParam String image_link,
    @RequestParam Timestamp start_time,
    @RequestParam Timestamp end_time,
    @RequestParam String official_link) {
      // @ResponseBody means the returned String is the response, not a view name
      // @RequestParam means it is a parameter from the GET or POST request
    	System.out.println(start_time);
      Article a = new Article();
      a.setTitle(title);
      a.setCategory(Category);
      a.setDescription(Description);
      a.setEnd_time(end_time);
      a.setImage_link(image_link);
      a.setOfficial_link(official_link);
      a.setStart_time(start_time);
      articleRepository.save(a);
      return "Saved";
    }
    
    
    
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Article> getAllUsers() {
      // This returns a JSON or XML with the users
      return articleRepository.findAll();
    }

	@RequestMapping("/article/{aid}")
	@ResponseBody
	public Optional<Article> getAlien(@PathVariable("aid")int aid)
	{
		return articleRepository.findById(aid);
		
		
	}
	
	@RequestMapping("/getArticle")
	public ModelAndView getAlien1(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView("showArticle.jsp");
		Article article=articleRepository.findById(aid).orElse(new Article());
		
		//System.out.println(repo.findByTech("Java"));
		//System.out.println(repo.findByAidGreaterThan(101));
		//System.out.println(repo.findByTechSorted("Java"));
		mv.addObject(article);
		return mv;
	}
	
	@RequestMapping("/showAll")
	public ModelAndView getAlien11()
	{
		ModelAndView mv=new ModelAndView("showArticles.jsp");
		List<Article> articles=articleRepository.findAll();
		System.out.println(articles);
		//System.out.println(repo.findByTech("Java"));
		//System.out.println(repo.findByAidGreaterThan(101));
		//System.out.println(repo.findByTechSorted("Java"));
		mv.addObject("articles",articles);
		return mv;
	}
	
	
 
    
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 /*
 
 
 
 
    
    @RequestMapping("/admin/save")
    public ModelAndView save(@Valid @ModelAttribute Article article, BindingResult bindingResult) {
        //if(bindingResult.hasErrors()) {
          //  ModelAndView modelAndView = new ModelAndView("admin/new-product");
           // return modelAndView;
       // }
        ModelAndView modelAndView = new ModelAndView("redirect:/admin/index");
        articleService.save(article);
        return modelAndView;
    }
    

    @RequestMapping("/admin/new")
    public ModelAndView newArticleForm() {
        ModelAndView modelAndView = new ModelAndView("admin/new-product");
        Article article = new Article();
        modelAndView.addObject("article", article);
        return modelAndView;
    }
    
    */
    
    
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/aboutus")
	public String aboutus()
	{
		return "Aboutus.jsp";
	}
	

	@RequestMapping("/contactus")
	public String contactus()
	{
		return "contactus.jsp";
	}
	
	@RequestMapping("/a")
	public String home33()
	{
	
		return "a.jsp";
	}
	
	@RequestMapping("/user")
	public String home11()
	{
		return "cardlayout.jsp";
	}
	
	@RequestMapping("/admin")
	public String admin()
	{
		return "admin.jsp";
	}
	

	@RequestMapping("/login")
	public String loginPage()
	{
		return "login.jsp";
	}
	
	//@RequestMapping("/logout")
	//public String logoutPag()
	//{
		//return "home.jsp";
//	}
	
	
	
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return "logout.jsp";
	}
	
	

}
