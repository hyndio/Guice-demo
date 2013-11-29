/**
 * 
 */
package h.demo;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author yuandong.huang@gmail.com
 * 
 */
public class EnergyProvider implements Provider<Energy> {

	final Service service;

	@Inject
	EnergyProvider(Service service) {
		this.service = service;
	}

	public Energy get() {
		this.service.go();
		return new Energy();
	}

}
