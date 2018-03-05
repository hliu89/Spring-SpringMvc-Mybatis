package ssm.service;

import ssm.pojo.Customer;
import ssm.pojo.QueryVo;
import ssm.utils.Page;

public interface CustomerService {

	public Page<Customer> selectPageByQueryVo(QueryVo vo);
	public Customer selectCustomerById(Integer id);
	public void updateCustomer(Customer c);
	public void deleteCustomer(Integer id);
}
