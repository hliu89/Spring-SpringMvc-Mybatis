package springmvc.service;

import java.util.List;

import springmvc.pojo.Items;

public interface ItemService {

	public List<Items> selectByExample();
	public Items selectById(Integer id);
	public void updateById(Items item);
	public void deleteByIds(Integer[] ids);
	public void updateByList(List<Items> itemList);
}
