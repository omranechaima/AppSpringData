package enig.tn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import enig.tn.dao.*;
import enig.tn.model.*;

@Controller
public class AppController {
	@Autowired
	private IGesProduit dao;
	@Autowired
	private IGesMagasin dao1;
	
	public void setDao(IGesProduit dao) {
		this.dao = dao;
	}public void setDao1(IGesMagasin dao1) {
		this.dao1 = dao1;
	}
	
	@GetMapping("/home")
	public String fn1(Model m) {
		List<Produit> l =dao.findAll();
		m.addAttribute("liste", l);
		return "page1";
	}
	public String f2(Model m) {
		List<Magasin> l1=dao1.findAll();
		m.addAttribute("liste1",l1);
		return "page2";
	}

}
