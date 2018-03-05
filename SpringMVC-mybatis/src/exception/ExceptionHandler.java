package exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class ExceptionHandler implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception arg3) {
		// TODO Auto-generated method stub
		ModelAndView mav=new ModelAndView();
		if(arg3 instanceof MessageException) {
			MessageException me=(MessageException)arg3;
			mav.addObject("error", me.getMsg());
			
		}else {
		mav.addObject("error", "There is a exception");
		}
		mav.setViewName("error");
		return mav;
	}

}
