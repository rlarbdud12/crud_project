package co.kr.ex5.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kr.ex5.service.Ex5Service;
import co.kr.ex5.vo.Ex5VO;

@Controller
public class Ex5Controller {
	@Resource(name = "ex5Service")
	private Ex5Service service;
	
	@RequestMapping(value = "main.do")
	public String main(Model md){
/*		
		List<Ex5VO> ex5List = service.getList();
		md.addAttribute("data", ex5List);
*/	
		md.addAttribute("data", service.getList());
		
		return "main";
	}
	
	@RequestMapping(value = "detail.do")
	public String detail(Model md, int id){
		md.addAttribute("data", service.getDetail(id));
		return "detail";
	}
	
}
