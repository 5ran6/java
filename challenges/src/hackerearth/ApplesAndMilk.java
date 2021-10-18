package hackerearth;

import java.util.Arrays;

/**
 *
 * brunolima on Oct 11, 2021
 * 
 */

public class ApplesAndMilk {
	int[] milk;
	int[] apples;
	int n; // number of farms
	int initialEnergy;
	int[][] solution; // solution[i][j] = number of apples we have at ith farm and our energy is j
						// unit.

	public ApplesAndMilk(int[] milk, int[] apples, int n, int initialEnergy) {
		this.milk = milk;
		this.apples = apples;
		this.n = n;
		this.initialEnergy = initialEnergy;
		this.solution = new int[n + 1][n + 1];
		for (int i = 0; i < n; i++) 
			Arrays.fill(solution[i], -1); // initially fill with -1.
	}

	private int maxApples() {
		solution[0][initialEnergy] = 0; // At zeroth farm and with initial energy = initialEnergy we have zero apples in
										// hand.

		// If we take apples at ith farm our energy is reduced by 1 but number of apples
		// will increase = original number + apples at this farm.
		// solution [i][j-1] = max (solution[i][j-1] , solution[i][j-1] + apples[i])
		// where 1 <= j <= n

		// If we take milk at ith farm then our energy will be increased by amount of
		// milk but number of apples will not change. The energy increased cannot be
		// more than n as we do not need to visit more than n farms.
		// solution[i][ min(j-1+milk[i], n] = max (solution[i][ min(j-1+milk[i], n],
		// solution[i-1][j]) where 1<=j <= n
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n; j++) {
				if (solution[i - 1][j] == -1) {
					continue; // If previous count was -1 continue.
				}
				
				solution[i][j - 1] = Math.max(solution[i][j - 1], solution[i - 1][j] + apples[i]);
				
				solution[i][Math.min(j - 1 + milk[i], n)] = Math.max(solution[i][Math.min(j - 1 + milk[i], n)],
						solution[i - 1][j]);
			}
			
			solution[i][0] = Math.max(solution[i][0], solution[i - 1][0]);
		}
		int max = 0;
		for (int i = 0; i <= n; i++) {
			max = Math.max(max, solution[n][i]);
		}
		return max;
	}

	public static void main(String[] args) {
		int numberOfFarms = 3;
		int initialEnergy = 2;
		int[] milk = new int[numberOfFarms + 1];
		milk[1] = 1;
		milk[2] = 2;
		milk[3] = 1;
		int[] apples = new int[numberOfFarms + 1];
		apples[1] = 100;
		apples[2] = 1;
		apples[3] = 100;
		ApplesAndMilk applesAndMilk = new ApplesAndMilk(milk, apples, numberOfFarms, initialEnergy);
		System.out.println(applesAndMilk.maxApples());
	}
}