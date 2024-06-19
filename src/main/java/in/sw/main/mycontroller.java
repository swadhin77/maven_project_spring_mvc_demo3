package in.sw.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mycontroller 
{
	@GetMapping("/open")
  public ModelAndView page()
  {
	  ModelAndView mav=new ModelAndView();
	  mav.setViewName("hello");
	  return mav;
  }
}
