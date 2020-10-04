public class SwitchExample3 
{
	public static void main(String[] args) 
	{ 
		String dayOfWeekArg = "Thursday"; 
		String typeOfDay = "";

		switch (dayOfWeekArg) {
		case "Monday":
			typeOfDay = "Start of work week";
			break;

		case "Tuesday":
		case "Wednesday":
		case "Thursday":
			typeOfDay = "Midweek";
			break;

		case "Friday":
			typeOfDay = "End of work week";
			break;

		case "Saturday":
		case "Sunday":
			typeOfDay = "Weekend";
			break;
	
		default:
			System.out.println("Invalid day of the week: " + dayOfWeekArg);
		}
			System.out.println(typeOfDay);
	}
}

/*
	Program diatas masih merupakan contoh Seleksi Switch Case yang bermakna hanya akan ada satu pernyataan saja yang akan dipilih.

	Pada program diatas terdapat dua variabel bertipe data string yaitu dayOfWeekArg dan typeOfDay yang dimana dayOfWeekArg memiliki nilai atau berisi "thursday"
		jika case "monday" maka typeOfDay nya adalah " Start of work Week" yang akan dijadikan sebagai Output 
		jika case "Tuesday", "Wednesday", "Thursday" maka typeOfDay nya adalah " Mid Week" yang akan dijadikan sebagai Output
		jika case "Friday" maka typeOfDay nya adalah " End of work Week" yang akan dijadikan sebagai Output 
		jika case "Saturday", "Sunday" maka typeOfDay nya adalah " Week End" yang akan dijadikan sebagai Output
		Apabila dayOfWeekArg diluar dari semua Case tersebut maka akan menghasilkan Outputnya adalah "Invalid day of the week"
	Pada program diatas  dayOfWeekArg memiliki nilai atau berisi "thursday" sehingga typeOfDay nya adalah " Mid Week" yang akan dijadikan sebagai Output
*/
