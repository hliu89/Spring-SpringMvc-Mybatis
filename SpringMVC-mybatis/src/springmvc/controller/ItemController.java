package springmvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import exception.MessageException;
import springmvc.pojo.Items;
import springmvc.pojo.QueryVo;
import springmvc.service.ItemService;

/**
 * 
 * 商品管理
 * **/
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	//入门程序
	@RequestMapping(value="item/itemlist.action")
	public ModelAndView itemlist() throws Exception {
		//int i=1/0;
		List<Items> list = itemService.selectByExample();
//		if(1==1) {
//			throw new MessageException("列表不能为空");
//		}
		 ModelAndView mav=new ModelAndView();
		 mav.addObject("itemList", list);
		 mav.setViewName("itemList");
		return mav;
	}
	//跳转修改页面
	@RequestMapping(value="/itemEdit.action")
	public ModelAndView toEdit(HttpServletRequest request,HttpServletResponse response,HttpSession sessoion,Model model) {
		String id=request.getParameter("id");
		Items item=itemService.selectById(Integer.parseInt(id));
		ModelAndView mav=new ModelAndView();
		 mav.addObject("item", item);
		 mav.setViewName("editItem");
		return mav;
	}
	//修改商品信息
	@RequestMapping(value="/updateitem.action")
	public String updateitem(Items items, MultipartFile pictureFile) throws Exception, Exception {
		String name=UUID.randomUUID().toString().replaceAll("-", "");
		String oname=FilenameUtils.getExtension(pictureFile.getOriginalFilename());
		pictureFile.transferTo(new File("C:\\Users\\SAN2271\\Downloads\\SpringMVC（74-75天）\\springmvc_day01\\springmvc\\upload\\"+name+"."+oname));
		items.setPic(name+"."+oname);
		itemService.updateById(items);
//		ModelAndView mav=new ModelAndView();
//		 mav.setViewName("success");
		return "redirect:/itemEdit.action?id="+items.getId();
		//return modelandview(带数据，带视图)
		//return String(只能返回试图的路径，此种方式可以通过传入model，把数据放入model里)
	}
	//删除多个商品
	@RequestMapping(value="/deletes.action")
	public ModelAndView updateitem(Integer[] ids) {
		List<Items> list = itemService.selectByExample();
		itemService.deleteByIds(ids);
		 ModelAndView mav=new ModelAndView();
		 mav.addObject("itemList", list);
		 mav.setViewName("itemList");
		return mav;
	}
	
	
	//修改多个商品
	@RequestMapping(value="/updates.action")
	public ModelAndView updateitems(QueryVo vo) {
		
//		itemService.deleteByIds(ids);
		List<Items> itemList=vo.getItemList();
		itemService.updateByList(itemList);
		
		List<Items> list = itemService.selectByExample();
		 ModelAndView mav=new ModelAndView();
		 mav.addObject("itemList", list);
		 mav.setViewName("itemList");
		return mav;
	}
	
	
}
