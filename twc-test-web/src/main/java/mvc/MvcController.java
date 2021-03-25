package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {

	@RequestMapping("/index")
	public ModelAndView getModeAndView() {
		//创建一个模型视图对象
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	@RequestMapping("/text")
	@ResponseBody
	public String text() {
		return "Text...";
	}

}
