package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by NESOY on 2017-02-04.
 */
@Controller
public class TestController {
	@RequestMapping(value = "/")
	public String test(){
		return "index";
	}
}
