package exam03;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트 tv");

		Tv tv = product1.getKind();
		String s = product1.getModel();
		
	}
}
