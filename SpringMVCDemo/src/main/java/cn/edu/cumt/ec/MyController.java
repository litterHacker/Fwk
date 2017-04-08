package cn.edu.cumt.ec;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/helloworld")
	public String hi(Model model){
		model.addAttribute("name","zhangsanfeng");
		return "HelloWorld";	//逻辑视图名	
	}
	@RequestMapping("/helloec")
	public String hiec(){
		return "HelloEC";		
	}
}
