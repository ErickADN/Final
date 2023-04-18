package onpe.final2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.config.CorsRegistry;

import onpe.final2.services.IResumenService;



@Configuration
@CrossOrigin
@Controller	
public class onpe {
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@Autowired
	private IResumenService iresumenService;
	
	@RequestMapping("/resumen")
	public String resumen(Model modelo){
		modelo.addAttribute("resumenes", iresumenService.getResumen());
	    return "resumen";
	}
}
