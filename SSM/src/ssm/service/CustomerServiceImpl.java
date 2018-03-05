package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.mapper.CustomerDao;
import ssm.pojo.Customer;
import ssm.pojo.QueryVo;
import ssm.utils.Page;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	//通过四个条件查询分页对象
	public Page<Customer> selectPageByQueryVo(QueryVo vo){
		Page<Customer> page=new Page<Customer>();
		page.setSize(20);
		vo.setSize(5);
		if(vo!=null) {
			
			if(vo.getCustName()!=null&&!vo.getCustName().trim().equals("")) {
				vo.setCustName(vo.getCustName().trim());
			}
            if(vo.getCustIndustry()!=null&&!vo.getCustIndustry().trim().equals("")) {
				vo.setCustIndustry(vo.getCustIndustry().trim());
			}
            if(vo.getCustSource()!=null&&!vo.getCustSource().trim().equals("")) {
			    vo.setCustSource(vo.getCustSource().trim());	
			}
            if(vo.getCustLevel()!=null&&vo.getCustLevel().trim().equals("")) {
            	vo.setCustLevel(vo.getCustLevel().trim());
            }
            if(vo.getPage()!=null) {
            	vo.setStart((vo.getPage()-1)*vo.getSize());
				page.setPage(vo.getPage());
				
			}
		}

		page.setTotal(customerDao.customerCount(vo));
		page.setRows(customerDao.selectCustomerListByQueryVo(vo));
		return page;
	}
	@Override
	public Customer selectCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.selectCustomerById(id);
	}
	@Override
	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
	     customerDao.updateCustomer(c);
	}
	public void deleteCustomer(Integer id) {
		customerDao.deleteCustomer(id);
	}
	
}
