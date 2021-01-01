public void insertMoney(int amount)
{
	if(amount > 0){
		balance = balance + amount;
	}
	else {
		System.out.println("Masukkan uang benilai positif : " + amount);
	}
}