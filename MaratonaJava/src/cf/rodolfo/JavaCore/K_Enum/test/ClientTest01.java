package cf.rodolfo.JavaCore.K_Enum.test;

import cf.rodolfo.JavaCore.K_Enum.domain.Client;
import cf.rodolfo.JavaCore.K_Enum.domain.ClientType;
import cf.rodolfo.JavaCore.K_Enum.domain.PaymentType;

public class ClientTest01 {
	public static void main(String[] args) {
		Client client01 = new Client("Tommy", ClientType.NATURAL_PERSON, PaymentType.DEBIT);
		Client client02 = new Client("Jackson", ClientType.LEGAL_PERSON, PaymentType.CREDIT);
		System.out.println(client01);
		System.out.println(client02);
		
		System.out.println(PaymentType.DEBIT.calculateDiscount(100));
		System.out.println(PaymentType.CREDIT.calculateDiscount(100));
		
		ClientType clientType = ClientType.reportNameClientType("Natural Person");
		System.out.println(clientType);

	}
}
