import java.util.*;

public class BipartMatch {

	private static int[][] graph;
	private static boolean[] visited;
	private int[] left = new int[256];
	private int[] right = new int[256];



	private int Bipartite(int x) {

		for (int i = 0; i < x; i++) {

			if (graph[x][i] == 1) {

				if (visited[i]) continue;
				visited[i] = true;

				if (right[i] < 0 || Bipartite(right[i]) == 1) {

					left[x] = i;
					right[i] = x;

					return 1;

				}

			}

		}

		return 0;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		graph = new int[x][y];
		visited = new boolean[x];
		int numedges = in.nextInt();
		String input;

		for (int i = 0; i < x; i++ ) {

			for (int j = 0; j < y; j++ ) {

				graph[i][j] = 1;

			}

		}

		TreeSet<Edges> edges = new TreeSet<Edges>();

		for (int i =0; i < numedges; i++) {

			input = in.nextLine();
			String v1 = input.substring(0, input.indexOf(" "));
			input = input.substring(input.indexOf(" ") + 1, input.length());
			String v2 = input;
			edges.add(new Edges(v1, v2));

		}

		int count = 0;

		for (int i = 0; i < x; i++) {

			if (Bipartite(i) == 1) {

				count++;

			}

		}

	}

}
