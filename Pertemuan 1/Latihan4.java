public class Latihan4
{
	public static void main(String args[]) 
	{
		int a = 60;	/* 60 = 0011 1100 */
		int b = 13; /* 13 = 0000 1101 */ 
		int c = 0;

		c = a & b;	/*12=	0000 1100	*/
		System.out.println("a & b	= " + c );	

		c = a | b;	/*61=	0011 1101	*/
		System.out.println("a | b	= " + c );	
	
		c = a ^ b;	/*49=	0011 0001	*/
		System.out.println("a ^ b	= " + c );	

		c = ~a;	/*-61 =	1100 0011	*/
		System.out.println("~a = " + c	);	

		c = a << 2; /* 240 = 1111 0000 */ 
		System.out.println("a << 2 = " + c );

		c = a >> 2;	/* 15 = 0000 1111 */
		System.out.println("a >> 2	= " + c );

		c = a >>> 2; /* 15 = 0000 1111 */ 
		System.out.println("a >>> 2 = " + c );
	}
}

/*
	program diatas merupakan program operator bitwise yang bekerja pada level bit dan melakukan operasi bit per bit
	
	c = a & b = 60 & 13 = 12 (caranya adalah dengan melakukan operasi bitwise AND pada angka biner dari 60 dan 13 sehingga menghasilkan angka biner dari 12)
	c = a | b = 60 | 13 = 61 (caranya adalah dengan melakukan operasi bitwise OR pada angka biner dari 60 dan 13 sehingga menghasilkan angka biner dari 61)
	c = a ^ b = 60 ^ 13 = 49 (caranya adalah dengan melakukan operasi bitwise XOR pada angka biner dari 60 dan 13 sehingga menghasilkan angka biner dari 49)
	c = ~a = ~60 = -61 (bitwise compiment ini secara singkat dapat dicari denga rumus (-a)-1= (-60)-1= -61)
	c = a << 2 = 240 (caranya adalah dengan melakukan operasi bitwise SHIFT LEFT pada angka biner dari 60 sehingga menghasilkan angka biner dari 240)
	c = a >> 2 = 15 (caranya adalah dengan melakukan operasi bitwise SHIFT RIGHT pada angka biner dari 60 sehingga menghasilkan angka biner dari 15)
	c = a >>> 2 = 15 (caranya adalah dengan melakukan operasi bitwise SHIFT RIGHT juga namun nilai yang digeser diganti dengan angka 0 pada angka biner dari 60 sehingga menghasilkan angka biner dari 15)
*/
