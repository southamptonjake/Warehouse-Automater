import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// RatioFinder.findRatio();
		// for(int i = 0; i < RatioFinder.skus.size(); i ++)
		// {
		//	 System.out.println(RatioFinder.skus.get(i) + " " + RatioFinder.ratios.get(i));
		// }
		RatioFinder.tester();
		String toronto = "KK-10";
		String victoria = "KH-33";
		String hamilton = "KP-66";
		ArrayList<Integer> timeToGet = new ArrayList<Integer>();
		timeToGet.add(5);
		timeToGet.add(8);
		timeToGet.add(20);
		timeToGet.add(45);
		timeToGet.add(60);
		ArrayList<Integer> space = new ArrayList<Integer>();
		space.add(3);
		space.add(3);
		space.add(3);
		space.add(3);
		space.add(3);
		Warehouse w = new Warehouse(timeToGet,space);

		Item i1 = new Item(toronto);
		Item i2 = new Item(victoria);
		Item i3 = new Item(hamilton);
		Item i4 = new Item(hamilton);
		Item i5 = new Item(toronto);
		Item i6 = new Item(toronto);
		Item i7 = new Item(victoria);
		Item i8 = new Item(toronto);
		Item i9 = new Item(victoria);
		Item i10 = new Item(hamilton);
		try {
			w.placeItem(i1, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			w.placeItem(i2, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			w.placeItem(i3, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			w.placeItem(i4, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			w.placeItem(i5, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			w.placeItem(i6, 2);
		} catch (Exception e1) {
		}
		try {
			w.placeItem(i7, 2);
		} catch (Exception e) {
		}
		try {
			w.placeItem(i7, 2);
		} catch (Exception e) {
		}
		ArrayList<Double> recip = w.currentRatio();
		int count = 0;
		for(String s : RatioFinder.skus)
		{
			System.out.println(s + " Current " + recip.get(count) + " Optimal " + RatioFinder.ratios.get(count));
			count ++;
		}

		try {
			System.out.println(w.findBestZone(i8));
		} catch (Exception e) {
		}
		try {
			System.out.println(w.findBestZone(i9));
		} catch (Exception e) {
		}
		try {
			System.out.println(w.findBestZone(i10));
		} catch (Exception e) {
		}

		System.out.println(w);




	}

}
