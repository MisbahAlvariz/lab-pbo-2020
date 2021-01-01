class EnumExample5{

	enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
	SATURDAY}
 
 	public static void main(String args[]){
 		Day day=Day.MONDAY;
 		
 		switch(day){
 			case SUNDAY: System.out.println("sunday");
 			break;
 			case MONDAY: System.out.println("monday");
 			break;
 			default:
 			System.out.println("other day");
 		}
 	}
}
 
/*Keterangan code:
	code diatas menghasilkan compilasi :
	monday 

	dimana terdapat deklarasi variabel day denga type data Day 
	Day day=Day.MONDAY;

	kemudian terdapat switch case:
	karena diatas telah dideklarasi maka swtich case, maka:
	case MONDAY: System.out.println("monday");
	 			break;

*/