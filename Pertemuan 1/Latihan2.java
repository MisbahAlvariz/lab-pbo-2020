class Latihan2 
{
	public static void main(String args[]) 
	{ 
		int a = 10;
		int b = 20;
		int c = 0;
		
		c = a + b;
		System.out.println("c = a + b = " + c );

		c += a ;
		System.out.println("c += a	= " + c );

		c -= a ;
		System.out.println("c -= a = " + c );

		c *= a ;
		System.out.println("c *= a = " + c );

		a = 10;
		c = 15;
		c /= a ;
		System.out.println("c /= a = " + c );

		a = 10;
		c = 15;
		c %= a ;
		System.out.println("c %= a	= " + c );

		c <<= 2 ;
		System.out.println("c <<= 2 = " + c );

		c >>= 2 ;
		System.out.println("c >>= 2 = " + c );

		c >>= 2 ;
		System.out.println("c >>= 2 = " + c );

 		c &= a ;
		System.out.println("c &= a = " + c );

 		c ^= a ;
		System.out.println("c ^= a = " + c );

 		c |= a ;
		System.out.println("c |= a = " + c ); 
	}
}
/*
 program diats merupakan program operator assigment atau operator penugasan
 c= a + b = 10 + 20 =30 (disimpan di c maka nilai c=30)
 c += a --> c= c + a = 30 + 10 = 40 (disimpan di c Maka sekarang nilai c = 40)
 c -= a --> c= c - a = 40 - 10 =30 (disimpan di c maka sekarang nilai c = 30 )
 c *= a --> c= c * a = 30 * 10 =300 
 c /= a --> c= c / a = 15 / 10 = 1 %5
 c %= a --> c= c % a = 15 % 10 = 5 (disimpan di c maka sekarang nilai c = 5)
 c <<= 2 --> c= c << 2 = 5 << 2 = 20 (disimpan di c maka nilai c sekarang 20) (operasi ini disebut dengan shift left pada angka biner)
 c >>= 2 --> c= c >> 2 = 20 >> 2 = 5 (disimpan di c maka nilai c sekarang 5) (operasi ini disebut dengan shift right pada angka biner)
 c >>= 2 --> c= c >> 2 = 5 >> 2 = 1 (disimpan di c maka nilai c sekarang 1)  (operasi ini disebut dengan shift pada pada angka biner)
 c &= a --> c = c % a = 1 & 10 = 0 (dismpan di c maka nilai c sekarang 0)  (operasi ini disebut dengan AND pada angka biner)
 c ^= a --> c = c ^ a = 0 ^ 10 = 10 (disimpan di c maka nilai c sekaang 10)  (operasi ini disebut dengan XOR pada angka biner)
 c |= a --> c = c | a = 10 | 10 = 10 (maka nilai c adalah 10)  (operasi ini disebut dengan OR pada angka biner)
*/
