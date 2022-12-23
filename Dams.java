package com.collectorMethods.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dams {

	public static void main(String[] args) {

		Collection<String> karnatak = new ArrayList<String>();
		karnatak.add("KRS");
		karnatak.add("Kodasalli");
		karnatak.add("Harangi");
		karnatak.add("Karanja");
		karnatak.add("Tunga Bhadra");

		Collection<String> telangana = new ArrayList<String>();
		telangana.add("Nizam Sagar");
		telangana.add("Singur");
		telangana.add("Mid Manair");

		Collection<String> kerala = new ArrayList<String>();
		kerala.add("KRS");
		kerala.add("Idukki");
		kerala.add("Kundala");
		kerala.add("Parambikulam");
		kerala.add("Neyyar");

		Collection<String> madhyaPradesh = new ArrayList<String>();
		madhyaPradesh.add("Barna ");
		madhyaPradesh.add("Bargi  ");
		madhyaPradesh.add("Bansagar  ");
		madhyaPradesh.add("Gandhi Sagar ");

		Collection<String> maharashtra = new ArrayList<String>();
		maharashtra.add("Yeldari ");
		maharashtra.add("Ujani  ");
		maharashtra.add("Pawna  ");
		maharashtra.add("Mulshi  ");
		maharashtra.add("Koyna  ");

		Collection<String> odisha = new ArrayList<String>();
		odisha.add("Odisha");
		odisha.add("Hirakud");

		Collection<String> uttarakhand = new ArrayList<String>();
		uttarakhand.add("Dhauli Ganga");
		uttarakhand.add("Tehri");

		Collection<String> jharkhand = new ArrayList<String>();
		jharkhand.add("Maithon ");
		jharkhand.add("Chandil ");
		jharkhand.add("Panchet ");

		Collection<String> jammu = new ArrayList<String>();
		jammu.add("Baglihar ");
		jammu.add("Dumkhar Hydroelectric ");
		jammu.add("Uri Hydroelectric ");

		Collection<String> himachalPradesh = new ArrayList<String>();
		himachalPradesh.add("Pandoh ");
		himachalPradesh.add("Bhakra Nangal");
		himachalPradesh.add("Nathpa Jhakri");
		himachalPradesh.add("Chamera ");

		Collection<String> gujarat = new ArrayList<String>();
		gujarat.add("Ukai ");
		gujarat.add("Dharoi ");
		gujarat.add("Kadana ");
		gujarat.add("Dantiwada ");

		Collection<String> andhraPradesh = new ArrayList<String>();
		andhraPradesh.add("Somasila ");
		andhraPradesh.add("Srisailam ");
		andhraPradesh.add("Jalaput ");
		andhraPradesh.add("Prakasham Barrage ");

		Collection<String> tamilNadu = new ArrayList<String>();
		tamilNadu.add("Vaigai ");
		tamilNadu.add("Perunchani ");
		tamilNadu.add("Mettur ");

		Collection<String> uttarPradesh = new ArrayList<String>();
		uttarPradesh.add("Rihand ");

		Collection<String> arunachalPradesh = new ArrayList<String>();
		arunachalPradesh.add("Ranganadi");
		arunachalPradesh.add("Dibang");

		Collection<String> chhattisgarh = new ArrayList<String>();
		chhattisgarh.add("Dudhawa");
		chhattisgarh.add("Tandula");
		chhattisgarh.add("Sondur");
		chhattisgarh.add("Murrum Silli");
		chhattisgarh.add("Gangrel");

		Collection<String> bihar = new ArrayList<String>();
		bihar.add("Job");
		bihar.add("Jalkund");
		bihar.add("Phulwaria");
		bihar.add("Nagi");
		bihar.add("Belharna");

		Collection<String> goa = new ArrayList<String>();
		goa.add("Salaulim");
		goa.add("Moisal");
		goa.add("Anjunem");
		goa.add("Amthane");

		Collection<String> haryana = new ArrayList<String>();
		haryana.add("Pathrala barrage");
		haryana.add("Anangpur");
		haryana.add("Kaushalya");
		haryana.add("Ottu barrage");
		haryana.add("Palla barrage");

		Collection<String> manipur = new ArrayList<String>();
		manipur.add("Khuga");
		manipur.add("Tipaimukh");

		Collection<String> mizoram = new ArrayList<String>();
		mizoram.add("Tuirial");
		mizoram.add("Serlui");

		Collection<String> punjab = new ArrayList<String>();
		punjab.add("Ranjit Sagar");

		Collection<String> rajasthan = new ArrayList<String>();
		rajasthan.add("Jawahar Sagar");
		rajasthan.add("Gandhi Sagar");
		rajasthan.add("Rana Pratap Sagar");
		rajasthan.add("Jakham");
		rajasthan.add("Chavli");

		Collection<String> sikkim = new ArrayList<String>();
		sikkim.add("Rangit");

		Collection<String> westBengal = new ArrayList<String>();
		westBengal.add("Durgapur Barrage");
		westBengal.add("Farakka Barrage");
		westBengal.add("Panchet");
		westBengal.add("Maithon");
		westBengal.add("Mukutmanipur");

		Collection<String> indanDams = new ArrayList<String>();
		indanDams.addAll(chhattisgarh);
		indanDams.addAll(andhraPradesh);
		indanDams.addAll(arunachalPradesh);
		indanDams.addAll(karnatak);
		indanDams.addAll(kerala);
		indanDams.addAll(westBengal);
		indanDams.addAll(sikkim);
		indanDams.addAll(jammu);
		indanDams.addAll(jharkhand);
		indanDams.addAll(gujarat);
		indanDams.addAll(madhyaPradesh);
		indanDams.addAll(maharashtra);
		indanDams.addAll(manipur);
		indanDams.addAll(mizoram);
		indanDams.addAll(rajasthan);
		indanDams.addAll(punjab);
		indanDams.addAll(goa);
		indanDams.addAll(bihar);
		indanDams.addAll(telangana);
		indanDams.addAll(tamilNadu);
		indanDams.addAll(odisha);
		indanDams.addAll(uttarakhand);
		indanDams.addAll(himachalPradesh);

		System.out.println(indanDams.size());

		System.out.println(indanDams);

		System.out.println("\n");

		for (String string : indanDams) {
			System.out.println(string.toUpperCase());

		}

		System.out.println("\n");

		for (String string : indanDams) {
			System.out.println(string.toLowerCase());

		}

		Iterator<String> elements = indanDams.iterator();
		while (elements.hasNext()) {
			String string = (String) elements.next();
			if (string.startsWith("T")) {
				System.out.println("The dam name stating with T are :  " + string);

			}

		}

		System.out.println("\n");
		Iterator<String> elements1 = indanDams.iterator();
		while (elements1.hasNext()) {
			String string2 = (String) elements1.next();
			if (string2.endsWith("ar")) {
				System.out.println("The dam name ending with ar are : " + string2);

			}

		}

		System.out.println("\n");
		for (String leng : indanDams) {
			if (leng.length() > 15) {
				System.out.println("The dame name greater than 15 characters are :" + leng);
			}
		}

		System.out.println("\n");
		Iterator<String> delet = indanDams.iterator();
		while (delet.hasNext()) {
			String s = delet.next();
			if (s.contains("P")) {

				delet.remove();

				System.out.println("The dame name cont"
						+ "ains p are : " + s);

			}

		}

		System.out.println("\n");

		System.out.println("The size after removing is : " + indanDams.size());

		System.out.println("\n");

		for (String string : indanDams) {
			System.out.println("After removing : " + string);

		}
		System.out.println("\n");
		Iterator<String> iterator = indanDams.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			StringBuffer buffer = new StringBuffer(string);
			buffer.reverse();
			
			String all = buffer.toString();
			if (string.equals(all)) {
				System.out.println("Is palindrome : " +buffer);
				
			}
			else {
				System.out.println("Not a palindrome : " +buffer);
			}
			
		}

	}

}
