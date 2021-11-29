import java.util.ArrayList;
import java.util.List;

public class ItemsStream {
	public static void main(String[] args) {
		List<Items> itemsList = new ArrayList<Items>();
		itemsList.add(new Items(1,"Laptop",30000f,"Lenovo"));
		itemsList.add(new Items(2,"Telivision",35000f,"Samsung"));
		itemsList.add(new Items(3,"Camera",40000f,"Sony"));
		itemsList.add(new Items(4,"Laptop",50000f,"Toshiba"));
		itemsList.add(new Items(5,"Drill",15000f,"Makita"));
		itemsList.add(new Items(6,"Mobile",70000f,"Apple"));
		itemsList.add(new Items(7,"Headphone",25000f,"Bose"));
		itemsList.add(new Items(8,"Owen",30000f,"Hitachi"));
		itemsList.add(new Items(9,"Pc",30000f,"Acer"));
		itemsList.add(new Items(10,"Ac",30000f,"Sansui"));
		itemsList.stream().filter(i->i.brand.startsWith("T"))
		         .forEach(i->System.out.println(i.brand));

	}
}
