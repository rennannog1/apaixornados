package application;

import java.util.Scanner;

import entities.Residence;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer c = 0;
		sc.nextLine();

		// while for each city
		while (n != 0) {
			c++;

			// for to each residence
			for (int i = 0; i < n; i++) {
				String line = sc.nextLine();
				String[] fields = line.split(" ");
				int x = Integer.parseInt(fields[0]);
				int y = Integer.parseInt(fields[1]);
				int z = (int) Math.floor(y / x);
				list.add(new Residence(x, y, z));
				map.put(c, list);
			}
	}
}
