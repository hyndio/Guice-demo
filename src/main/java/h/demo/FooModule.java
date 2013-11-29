/**
 * 
 */
package h.demo;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

/**
 * @author yuandong.huang@gmail.com
 *
 */
public class FooModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Service.class).to(ServiceImpl.class).in(Singleton.class);
		bindConstant().annotatedWith(TheAnswer.class).to(42);
		bindConstant().annotatedWith(Names.named("userName")).to("yuandong.huang@gmail.com");
		bindConstant().annotatedWith(Names.named("userAge")).to(65);
		bind(Energy.class).toProvider(EnergyProvider.class);
		
		bindConstant().annotatedWith(Names.named("barName")).to("bar_name");
		// 静态域注入
		//requestStaticInjection(types)
	}
	
	@Provides
	public Bar provideBar(@Named("barName") String name) {
		return new Bar(name);
	}

}
