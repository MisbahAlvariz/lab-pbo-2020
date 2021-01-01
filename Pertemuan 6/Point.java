public class Point {
 	private int x;
 	private int y;

 	public Point()
 	{
 		x = 0;
 		y = 0;
 	}

 	public Point(int x, int y)
 	{
 		this.x = x;
 		this.y = y;
 	}

 	public int getX()
 	{
 		return this.x;
 	}

 	public void setX(int x)
 	{
 		this.x = x;
 	}

 	public int getY()
 	{
 		return this.y;
 	}

 	public void sety(int y)
 	{
 		this.y = y;
 	}

 	public String toString()
 	{
 		return "Titik dengan x=" +x+ " y=" +y ;
 	}
}

/*Keterangan code:
	sama halnya seperti class line, code diatas error.
	disebabkan Class Line di atas belum lengkap jadi lengkapi dengan sisa method lainnya yaitu getBeginX, setBeginX,
	getBeginY, setBeginY, getEndX, setEndX, getEndY, setEndY, toString dan getLength.
	Method getLength akan mengembalikan panjang dari garis/line. Gunakan rumus ukur panjang garis.

*/