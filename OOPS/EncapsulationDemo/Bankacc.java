package OOps;

public class Bankacc {
public static void main(String[] args) {
	encapsulationDemo acc = new encapsulationDemo();
	
	acc.setBankname("Axis Bank");
	acc.setAcc_no(2222233333l);
	acc.setName("Guna");
	acc.setEmail("guna@gmail.com");
	acc.setAmount(250000);
	acc.setPno(70203333);
	
	 System.out.println("Bankname:" +acc.getBankname());
	 System.out.println("Account number:"+acc.getAcc_no());
	 System.out.println("Name of account holder:"+acc.getName());
	 System.out.println("Email:"+acc.getEmail());
	 System.out.println("Deposit amount:"+acc.getAmount());
	 System.out.println("Phone number:"+acc.getPno());
	
	
}
}
