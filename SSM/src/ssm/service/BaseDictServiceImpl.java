package ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.mapper.BaseDictDao;
import ssm.pojo.BaseDict;

@Service
public class BaseDictServiceImpl implements BaseDictService {

	
	@Autowired
	private BaseDictDao baseDictDao;

	@Override
	public List<BaseDict> selectBaseDictListByCode(String code) {
		// TODO Auto-generated method stub
		return baseDictDao.selectBaseDictListByCode(code);
	}

}
