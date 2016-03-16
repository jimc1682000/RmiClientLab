package tw.jimmy.lab;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;

public class CalculatorClient {

	public static void main(String[] args) {
		try {
			Calculator c = (Calculator) Naming
					.lookup("rmi://localhost:2020/CalculatorService");
			System.out.println(c.sub(4, 3));
			System.out.println(c.add(4, 5));
			System.out.println(c.mul(3, 6));
			System.out.println(c.div(9, 3));
		} catch (MalformedURLException murle) {
			System.out.println();
			System.out.println("MalformedURLException: ");
			murle.printStackTrace();
		} catch (RemoteException re) {
			System.out.println();
			System.out.println("RemoteException: ");
			re.printStackTrace();
		} catch (NotBoundException nbe) {
			System.out.println();
			System.out.println("NotBoundException: ");
			nbe.printStackTrace();
		} catch (ArithmeticException ae) {
			System.out.println();
			System.out.println("ArithmeticException: ");
			ae.printStackTrace();
		}
	}
}