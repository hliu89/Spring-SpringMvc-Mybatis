package bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
//<bean name="user" class="bean.User">
@Scope(value="prototype")
public class User {
@Value("tom")
	private String name;
@Value(value="18")
	private Integer age;
//@Autowired
@Resource(name="car")
	private Car car;
	
	
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void init(){
		System.out.println("init method is used");
	}
	public void destory(){
		System.out.println("destory method is used");
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	
}
