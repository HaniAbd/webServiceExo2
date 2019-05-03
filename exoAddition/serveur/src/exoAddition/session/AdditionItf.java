package exoAddition.session;

import javax.ejb.Remote;

@Remote
public interface AdditionItf {
	public int addition(int a, int b);
	
}
