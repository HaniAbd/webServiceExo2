package exoAddition.session;

import javax.ejb.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
@WebService (
name="nEssai",
//nom du PortType
serviceName="snEssai",
//nom du service
targetNamespace="http://localhost:8080/snEssai/nEssai")
@Stateless (mappedName="exoAddition")
public class AdditionBean implements AdditionItf {
	@WebMethod(operationName="addInt")
	public int addition(int a, int b) {
		return (a+b);
	}
}
