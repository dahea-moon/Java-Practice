package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은" + priceLee + "입니다");
		System.out.println(customerKim.showCustomerInfo() + "지불금액은" + priceKim + "입니다");
		
		Customer customerNo = new VIPCustomer();
		customerNo.setCustomerName("나블리");
		customerNo.setCustomerID(10030);
		customerNo.bonusPoint = 1000;
		System.out.println(customerNo.showCustomerInfo() + "지불금액은" + customerNo.calcPrice(10000) + "입니다");

	}

}
