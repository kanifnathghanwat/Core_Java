public class Item {
	public static void main(String[] args)
   {
   	int code, pqty, pprice;
   	String name;
   	class Item(int code, String name, int pqty, int pprice);
   	{
   		this.code=code;
   		this.name=name;
   		this.pqty=pqty;
   		this.pprice=pprice;
   	}
   	
   	void putdata()
   	{
   		System.out.println("Code = " + code);
   		System.out.println("Name = " + name);
   		System.out.println("Pur Qty = " + pqty);
   		System.out.println("Pur Price = " + pprice);
   	}
   }
   
   class Stock extends Item
   {
   	int sqty, sprice, profit, st;
   	Stock(int code, String name, int pqty, int pprice, int sqty, int sprice)
   	{
   		super(code, name, pqty, pprice);
   		this.sqty=sqty;
   		this.sprice=sprice;
   	}
   	
   	void calc()
   	{
   		st = pqty - sqty;
   		profit =sqty * (sprice - pprice);
   	}
   	
   	void putdata
   	{
   		super.putdata();
   		System.out.println("Sale Qty" + sqty);
   		System.out.println("Sale Price" + sprice);
   		System.out.println("Stock" + st);
   		System.out.println("Profit of Item" + prifit);
   	}
   	
   	public static void main(String args [])
   	{
   		Stock s = new Stock(1, "Book", 100, 30, 50, 35);
   		s.calc();
   		s.putdata();
   	}
   }
}
  