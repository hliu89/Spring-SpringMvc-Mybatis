package ssm.mapper;

import java.util.List;

import ssm.pojo.BaseDict;

public interface BaseDictDao {

	 List<BaseDict> selectBaseDictListByCode(String code);
	
}
