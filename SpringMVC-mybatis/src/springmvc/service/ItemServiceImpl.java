package springmvc.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.Dao.ItemsMapper;
import springmvc.pojo.Items;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemsMapper itemsMapper;
	
	public List<Items> selectByExample(){
		return itemsMapper.selectByExample(null);
	}

	
	public Items selectById(Integer id) {
		// TODO Auto-generated method stub
		return itemsMapper.selectByPrimaryKey(id);
	}
	
	public void updateById(Items item) {
		item.setCreatetime(new Date());
		itemsMapper.updateByPrimaryKeyWithBLOBs(item);
	}
	public void deleteByIds(Integer[] ids) {
		for(Integer i:ids) {
			
			itemsMapper.deleteByPrimaryKey(i);
			
		   }
		}
	public void updateByList(List<Items> itemList) {
		for(Items i:itemList) {
			i.setCreatetime(new Date());
			System.out.println(i.getName()+i.getId()+i.getPrice());
			itemsMapper.updateByPrimaryKeyWithBLOBs(i);
			
		   }
		}
}
