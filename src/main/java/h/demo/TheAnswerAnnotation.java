/**
 * 
 */
package h.demo;

import java.lang.annotation.Annotation;

/**
 * @author yuandong.huang@gmail.com
 *
 */
public class TheAnswerAnnotation {
	
	final int value;
	
	public TheAnswerAnnotation(int value) {
		super();
		this.value = value;
	}

	public Class<? extends Annotation> annotationType() {
		return TheAnswer.class;
	}

	public int value() {
		return this.value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TheAnswerAnnotation other = (TheAnswerAnnotation) obj;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TheAnswerAnnotation [value=" + value + "]";
	}

}
