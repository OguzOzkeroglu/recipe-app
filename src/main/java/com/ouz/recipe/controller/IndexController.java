package com.ouz.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author oguz, created on 2018.10.08
 *
 */
@Controller
public class IndexController {

	@RequestMapping({"", "/", "/index"})
	public String getIndexPage() {
		return "index";
	}
}
