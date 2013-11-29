/**
 * 
 */
package h.demo;

/**
 * @author yuandong.huang@gmail.com
 *
 */
public class Bar {
	
	private String name;
	
	public Bar() {
		super();
	}
	
	public Bar(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bar [name=" + name + "]";
	}
 
}
