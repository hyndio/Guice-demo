/**
 * 
 */
package h.demo.interceptor;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

/**
 * @author yuandong.huang@gmail.com
 * 
 */
public class NotOnWeekendsModule extends AbstractModule {

	@Override
	protected void configure() {
		bindInterceptor(Matchers.any(),
				Matchers.annotatedWith(NotOnWeekends.class),
				new WeekendBlocker());
	}

}
