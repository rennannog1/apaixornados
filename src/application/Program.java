package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		List<Integer> tested = new ArrayList<>();
		List<Integer> apaixornados = new ArrayList<>();
		Integer testing;
		int cont =0;
		int n = sc.nextInt();
		sc.nextLine();
		while (n != 0) {
			String line = sc.nextLine();
			String[] fields = line.split(" ");
			// for to each residence
			for (int i = 0; i < n; i++) {
				list.add(Integer.parseInt(fields[i]));
			}
			for (int i = 0; i < n; i++) {
				testing = list.get(i);
				if(!tested.contains(testing)) {
					cont=0;
					for (int i1 = 0; i1 < n; i1++) {
						if (list.get(i1)==testing) {
							cont++;
						}
					}
					if (cont%2!=0) {
						apaixornados.add(testing);
					}
				}
				tested.add(list.get(i));
			}
			n = sc.nextInt();
			sc.nextLine();
		}
		System.out.println(Arrays.toString(apaixornados.toArray()));
	}
}
