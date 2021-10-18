package hackerearth;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @since 11/10/2021
 * @author brunolima
 * @see https://www.hackerearth.com/practice/algorithms/dynamic-programming/2-dimensional/practice-problems/algorithm/collecting-apples-69/
 */

import java.util.Scanner;

public class CollectApples {
	public static void main(String args[]) throws Exception {
//		solution1();
		solution2();
	}

	private static void solution2() {
		Scanner s = new Scanner(System.in);
		int testCases = Integer.valueOf(s.nextLine()); // Reading input from STDIN

		while (testCases-- > 0) {
			String farmsAndEnergy = s.nextLine();
			int farms = Integer.valueOf(farmsAndEnergy.split(" ")[0]);
			int energy = Integer.valueOf(farmsAndEnergy.split(" ")[1]);

			int dp[][] = new int[farms + 1][farms + 1];
			int apples[] = new int[farms + 1];
			int milks[] = new int[farms + 1];

			String[] milkValues = s.nextLine().split(" ");
			String[] appleValues = s.nextLine().split(" ");

			int k = 0;
			for (int i = 1; i <= farms; i++) {
				milks[i] = Integer.valueOf(milkValues[k]);
				k++;
			}

			k = 0;
			for (int i = 1; i <= farms; i++) {
				apples[i] = Integer.valueOf(appleValues[k]);
				k++;
			}

			for (int i = 0; i <= farms; i++) {
				Arrays.fill(dp[i], -1);
			}
			
			dp[0][energy] = 0;

			for (int i = 1; i <= farms; i++) {
				for (int j = 1; j <= farms; j++) {
					if (dp[i - 1][j] == -1) {
						continue;
					}

					// take apple from ith farm
					dp[i][j - 1] = Math.max(dp[i][j - 1], dp[i - 1][j] + apples[i]);

					// take milk from ith farm
					dp[i][Math.min(j + milks[i] - 1, farms)] = Math.max(dp[i][Math.min(j + milks[i] - 1, farms)],
							dp[i - 1][j]);
				}

				dp[i][0] = Math.max(dp[i][0], dp[i - 1][0]);
			}

			int max = 0;

			for (int i = 0; i <= farms; i++) {
				max = Math.max(max, dp[farms][i]);
			}

			System.out.println(max);
		}

		s.close();
	}

	private static void solution1() {
		Scanner s = new Scanner(System.in);
		int testCases = Integer.valueOf(s.nextLine()); // Reading input from STDIN

		while (testCases > 0) {
			int totalApples = 0;

			String farmsAndEnergy = s.nextLine();

			int totalFarms = Integer.valueOf(farmsAndEnergy.split(" ")[0]);
			int monkEnergy = Integer.valueOf(farmsAndEnergy.split(" ")[1]);

			System.out.println("totalFarms > " + totalFarms);
			System.out.println("totalEnergy > " + monkEnergy);

			String[] milkValues = s.nextLine().split(" ");
			String[] appleValues = s.nextLine().split(" ");

			ArrayList<Farm> farms = new ArrayList<Farm>();
			for (int i = 0; i < appleValues.length; i++) {
				farms.add(new Farm(Integer.valueOf(milkValues[i]), Integer.valueOf(appleValues[i])));
			}

			farms.forEach(f -> System.out.println(f));

			for (int farm = 0; farm < totalFarms; farm++) {
				if (canDecreaseMonkEnergy(monkEnergy)) {
					monkEnergy--;
				}

				Farm farmActual = farms.get(farm);

				if (monkHasEnergy(monkEnergy)) {
					totalApples += farmActual.getApples();
				} else {
					monkEnergy += farmActual.getMilk();
				}
			}

			System.out.println(totalApples);

			testCases--;
		}

		s.close();
	}

	private static boolean monkHasEnergy(int energy) {
		return energy > 0;
	}

	private static boolean canDecreaseMonkEnergy(int energy) {
		return energy > 0;
	}
}

class Farm {

	private Integer milk;
	private Integer apples;

	public Farm(Integer milk, Integer apples) {
		this.milk = milk;
		this.apples = apples;
	}

	public Integer getMilk() {
		return milk;
	}

	public Integer getApples() {
		return apples;
	}

	@Override
	public String toString() {
		return "Farm [milk=" + milk + ", apples=" + apples + "]";
	}

}
