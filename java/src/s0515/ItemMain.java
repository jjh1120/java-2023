package s0515;

public class ItemMain {

	public static void main(String[] args) {

		Item phone = new Item("갤럭시 S22+");
		phone.price = 900000;
		phone.priceItemInfo();

		Item phone2 = new Item("Iphone 15", 1500);
		phone2.priceItemInfo();

		
		
		Item ram = new Item("DDR5", 200);
		ram.priceItemInfo();
		
		
		

	}

}
