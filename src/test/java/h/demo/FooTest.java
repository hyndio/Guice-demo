/**
 * 
 */
package h.demo;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author yuandong.huang@gmail.com
 * 
 */
public class FooTest {

	private Client client;

	@Before
	public void init() {
		// 客户端
		client = new Client();
		// 把module给Guice
		Injector in = Guice.createInjector(new FooModule());
		// 让Guice把需要注入的业务逻辑注入给对象
		in.injectMembers(client);
	}
	
	
	/**
	 * @ImplementedBy(ServiceImpl.class)
	 * @ImplementedBy(Class)的注释方式。可以直接从你的接口指向一个缺省的实现，
	 * 而省略掉对com.google.inject.Module的实现。其实这样就违背了多态的原则，
	 * 一般使用较少，最后还是把控制权交给Module来处理。
	 */
	public void initImplBy() {
		// 客户端
		client = new Client();
		// 把module给Guice
		Injector in = Guice.createInjector();
		// 让Guice把需要注入的业务逻辑注入给对象
		in.injectMembers(client);
	}

	@Test
	public void foo() {
		assertThat(client.execute(), equalTo(0));
	}

}
