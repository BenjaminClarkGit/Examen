package Exam;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Starter {

	public static void main(String[] args) {
		Plane Plane1 = new Plane();
		Plane Plane2 = new Plane();
		Plane Plane3 = new Plane();
		Plane Plane4 = new Plane();
		Plane Plane5 = new Plane();
		Plane Plane6 = new Plane();
		Plane Plane7 = new Plane();
		Plane.BomberPlane Plane8 = Plane1.new BomberPlane();
		Plane.BomberPlane Plane9 = Plane1.new BomberPlane();
		Plane.BomberPlane Plane10 = Plane1.new BomberPlane();
		
		Plane1.Naam="1";
		Plane1.Vluchtplafond=200;
		Plane1.Stuwkracht=100;
		Plane1.Breete=25;
		Plane1.Lengte=40;
		
		Plane2.Naam="2";
		Plane2.Vluchtplafond=5245;
		Plane2.Stuwkracht=555;
		Plane2.Breete=211;
		Plane2.Lengte=321;
		
		Plane3.Naam="3";
		Plane3.Vluchtplafond=2125;
		Plane3.Stuwkracht=155;
		Plane3.Breete=156;
		Plane3.Lengte=215;
		
		Plane4.Naam="4";
		Plane4.Vluchtplafond=4545;
		Plane4.Stuwkracht=323;
		Plane4.Breete=98;
		Plane4.Lengte=156;
		
		Plane5.Naam="5";
		Plane5.Vluchtplafond=6565;
		Plane5.Stuwkracht=54;
		Plane5.Breete=32;
		Plane5.Lengte=54;
		
		Plane6.Naam="6";
		Plane6.Vluchtplafond=8965;
		Plane6.Stuwkracht=654;
		Plane6.Breete=255;
		Plane6.Lengte=336;
		
		Plane7.Naam="7";
		Plane7.Vluchtplafond=5455;
		Plane7.Stuwkracht=561;
		Plane7.Breete=55;
		Plane7.Lengte=93;
		
		Plane8.Naam="8";
		Plane8.Vluchtplafond=5465;
		Plane8.Stuwkracht=55;
		Plane8.Breete=(int)Math.random()*697;
		Plane8.Lengte=956;
		Plane8.Bommen=7;
		
		Plane9.Naam="9";
		Plane9.Vluchtplafond=5548;
		Plane9.Stuwkracht=2654;
		Plane9.Breete=544;
		Plane9.Lengte=612;
		Plane9.Bommen=1;
		
		Plane10.Naam="10";
		Plane10.Vluchtplafond=4564;
		Plane10.Stuwkracht=(int)Math.random()*38;
		Plane10.Breete=85;
		Plane10.Lengte=165;
		Plane10.Bommen=5;
		
		ArrayList<Plane> Planes = new ArrayList<Plane>();
		Planes.add(Plane1);
		Planes.add(Plane2);
		Planes.add(Plane3);
		Planes.add(Plane4);
		Planes.add(Plane5);
		Planes.add(Plane6);
		Planes.add(Plane7);
		Planes.add(Plane8);
		Planes.add(Plane9);
		Planes.add(Plane10);
		
		try {
			FileWriter Writer = new FileWriter("output.txt", true);
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	public void GemHoogte(ArrayList<Plane> a, FileWriter write) throws IOException {
		int c=0;
		for (int b=0;b<a.size();b++) {
			c= c+a.get(b).Vluchtplafond;
		}c=c/a.size();
		write.write("Gemiddelede hoogte:"+c);
		
	}
	public void MaxStuw(ArrayList<Plane> a, FileWriter write) throws IOException {
		int d=0;
		String e ="";
		for (int b=0;b<a.size();b++) {
			int c=a.get(b).Stuwkracht;
			if(d<c) {
				e = a.get(b).Naam;
				d=c;
			}
		}
		write.write("Maximum stuwkracht:"+d+" naam:"+e);
	}
	public void MinLeng (ArrayList<Plane> a, FileWriter write) throws IOException {
		int d=10000;
		String e ="";
		for (int b=0;b<a.size();b++) {
			int c=a.get(b).Lengte;
			if (c<d) {
				e=a.get(b).Naam;
				d=c;
			}
		}
		write.write("Minimum lengte:"+d+" naam:"+e);
	}
}