/**
 * 
 */
package h.demo;


/**
 * @author huangyuandong
 * @ImplementedBy(Class)的注释方式。可以直接从你的接口指向一个缺省的实现，
 * 而省略掉对com.google.inject.Module的实现。其实这样就违背了多态的原则，
 * 一般使用较少，最后还是把控制权交给Module来处理。
 */
//@ImplementedBy(ServiceImpl.class)
public interface Service {
	
	void go();
	
	int getValue();

}
