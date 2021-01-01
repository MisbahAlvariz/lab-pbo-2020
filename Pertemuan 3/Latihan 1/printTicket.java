public void printTicket()
{
	if(balance >= prince) {
		//simulate the printing of a ticket
		System.out.println("#################");
		System.out.println("# The BlueJ Line");
		System.out.println("# Ticket");
		System.out.println("# " + price + " cents.");
		System.out.println("##################");
		System.out.println();

		//Update the total colled with the price
		total = total + price;
		//Reduce the balance by the price
		balance = balance - price;

		//Jika ada uang kembalian
		int sisa = this.refundBalance();
		if(sisa > 0)
			System.out.println("Uang kembalian : " + sisa);
	}
	else {
		System.out.println("Uang anda kurang, silahkan masukkan : " + (price - balance) + "cents lagi.");
	}
}