package ssm.service;

import java.util.List;

import ssm.pojo.BaseDict;

public interface BaseDictService {
	public List<BaseDict> selectBaseDictListByCode(String code);
}
