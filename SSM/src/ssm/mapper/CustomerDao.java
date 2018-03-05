package ssm.mapper;

import java.util.List;


import ssm.pojo.Customer;
import ssm.pojo.QueryVo;

public interface CustomerDao {

	 public Integer customerCount(QueryVo vo);
	 public List<Customer> selectCustomerListByQueryVo(QueryVo vo);
	 public Customer selectCustomerById(Integer id);
	 public void updateCustomer(Customer c);
	 public void deleteCustomer(Integer id);
	
}
