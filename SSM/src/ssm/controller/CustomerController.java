package ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ssm.pojo.BaseDict;
import ssm.pojo.Customer;
import ssm.pojo.QueryVo;
import ssm.service.BaseDictService;
import ssm.service.CustomerService;
import ssm.utils.Page;

@Controller
public class CustomerController {

	@Autowired
	private BaseDictService baseDictService;
	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping(value="/customer/list")
	public String list(QueryVo vo,Model model) {
		List<BaseDict>fromType= baseDictService.selectBaseDictListByCode("002");
		List<BaseDict>industryType =baseDictService.selectBaseDictListByCode("001");
		List<BaseDict>levelType =baseDictService.selectBaseDictListByCode("006");
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType",industryType);
		model.addAttribute("levelType", levelType);
		Page<Customer> page=customerService.selectPageByQueryVo(vo);
		model.addAttribute("page", page);
		return "customer";
	}
	@RequestMapping(value="/customer/edit.action")
	public @ResponseBody
	Customer toEdit(Integer id) {
		Customer c=customerService.selectCustomerById(id);
		return c;
	}
	@RequestMapping(value="/customer/update.action")
	public @ResponseBody
	String toUpdate(Customer c) {
	    customerService.updateCustomer(c);
		return "OK";
	}
	@RequestMapping(value="/customer/delete.action")
	public @ResponseBody
	String toDelete(Integer id) {
	    customerService.deleteCustomer(id);
		return "OK";
	}
	
}
