package org.prog;

import java.util.Scanner;

abstract class Domestic {

	void minbill() {
		System.out.println("Electricity bill: Free");
	}

	void Dbill(double unit, double dfix) {
		double res;

		if (unit <= 200) {
			res = (unit - 100) * 2;
			System.out.println("Electricity bill:" + (res + dfix));
		} else if (unit < 300) {
			res = (100 * 2) + (unit - 200) * 3;
			System.out.println("Electricity bill:" + (res + dfix));
		} else if (unit < 400) {

			res = 100 * 2 + 100 * 3 + (unit - 300) * 5;
			System.out.println("Electricity bill:" + (res + dfix));
		}
		else {
			res=100*3+100*4+100*6+(unit-400)*10;
			System.out.println("Electricity bill:" + (res + dfix));
		}

	}

}

interface Commercial {
	void minbill1();

	void Cbill(double unit, double area);
}

class ElectricBill extends Domestic implements Commercial {

	@Override
	public void Cbill(double unit, double cfix) {
		double res;
		if (unit <= 200) {
			res = (unit - 100) * 3;
			System.out.println("Electricity bill:" + (res + cfix));
		} else if (unit < 300) {
			res = (100 * 3) + (unit - 200) * 5;
			System.out.println("Electricity bill:" + (res + cfix));
		} else if (unit < 400) {

			res = 100 * 3 + 100 * 5 + (unit - 300) * 7;
			System.out.println("Electricity bill:" + (res + cfix));
		}
		else {
			res=100*4+100*5+100*7+(unit-400)*20;
			System.out.println("Electricity bill:" + (res + cfix));
		}

	}

	@Override
	public void minbill1() {
		System.out.println("Electricity bill: Free");

	}

	public static void main(String[] args) {
		Domestic d = new ElectricBill();
		Commercial c = new ElectricBill();
		Division div = new Division();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Electricity type: 1.Domestic 2.commertial");
		int Etype = sc.nextInt();
		System.out.println("Enter the Units:");
		double unit = sc.nextDouble();
		System.out.println("Enter Electricity Area: 1.panchayat 2.union 3.urban 4.rural");
		double area = sc.nextDouble();

		if (Etype == 1) {

			if (unit <= 100) {
				d.minbill();
			} else {

				d.Dbill(unit, div.Darea(area));
			}
		} else {

			if (unit <= 100) {
				c.minbill1();
			} else {

				c.Cbill(unit, div.Carea(area));
			}
		}

	}
}

class Division {
	double Darea(double area) {

		double d[] = { 130, 150, 170, 190 };
		return d[(int) (area - 1)];
	}

	double Carea(double area) {
		double d[] = { 150, 170, 190, 210 };
		return d[(int) (area - 1)];

	}
}
