/**
 * 
 */
package h.demo;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

/**
 * @author yuandong.huang@gmail.com
 *
 */
public class Client {
	
	// 接口
	@Inject
	private Service service;
	
	// 直接实现类
	@Inject
	private Concrete concrete;
	
	// 自定义Provider
	@Inject
	private Energy energy;
	
	// @Provides方法
	@Inject
	private Bar bar;
	
	@Inject
	@TheAnswer
	private int count;
	
	@Inject
	@Named("userAge")
	private int userAge;
	
	@Inject
	@Named("userName")
	private String userName;
	
//	@Inject
//	public Client(Service service) {
//		this.service = service;
//	}
	
//	@Inject
//	public void setService(Service service) {
//		this.service = service;
//	}
	
//	@Inject
//	public void injectService(Service service) {
//		this.service = service;
//	}
	
//	@Inject
//	public void injectEn(EnergyProvider provider) {
//		this.energy = provider.get();
//	}
	
	@Inject
	public void injectAtm(Provider<Money> atm) {
		Money one = atm.get();
		Money two = atm.get();
		System.out.println(one);
		System.out.println(two);
	}

	public int execute() {
		this.service.go();
		this.concrete.impl();
		
		System.out.println(count);
		
		System.out.println(userAge);
		
		System.out.println(userName);
		
		System.out.println(energy);
		
		System.out.println(bar);
		
		return this.service.getValue();
	}

}
