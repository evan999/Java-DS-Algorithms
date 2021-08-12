import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PriceCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		List<String> products = new ArrayList<>();
		List<Float> productPrices = new ArrayList<>();
		int i = 0;
		while (i++ < n) {
			products.add(sc.next());
			productPrices.add(sc.nextFloat());
		}

		List<String> productsSold = new ArrayList<>();
		List<Float> soldPrices = new ArrayList<>();
		int j = 0;
		while (j++ < m) {
			productsSold.add(sc.next());
			soldPrices.add(sc.nextFloat());
		}

		sc.close();
		System.out.println(priceCheck(products, productPrices, productsSold, soldPrices));
	}

	static int priceCheck(List<String> products, List<Float> productPrices, List<String> productsSold,
			List<Float> soldPrices) {
		// Loop through our soldProducts list
		// At current index, get matching product that matches product in soldProducts
		// list
		// Compare productPrice with soldPrice
		// If not equal
		// add 1 to sellingErrors
		// continue
		int sellingErrors = 0;

		for (int prod = 0; prod < productsSold.size(); prod++) {
			String productSold = productsSold.get(prod);
			float soldPrice = soldPrices.get(prod);
			int productIndex = products.indexOf(productSold);
			float productPrice = productPrices.get(productIndex);
			// float productPrice = productPrices.indexOf(soldPrice);

			if (productPrice != soldPrice) {
				sellingErrors++;
			}
		}

		return sellingErrors;
	}
}