package s0515;

public class Item {

	String name;
	int price;

	Item(String str) {
		name = "제품명:" + str;
	}

	Item(String name, int price) {
		this.name = "제품명:" + name;
		this.price = price * 1000;
	}

	void priceItemInfo() {
		System.out.println(name+'\n'+"출고가:"+price+"\n=====================");
		
		

	}
}
