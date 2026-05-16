import java.util.Scanner;

class Tumbolv2 {

    private String name;
    private int latitude;
    private int longitude;
    private int population;
    private int availBudget;

    public Tumbolv2(String name, int latitude, int longitude, int population) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.population = population;
        this.availBudget = 5_000 * population;
    }

    public int allocateBudget(int[] budgets) {
        boolean printed = false;
        int availBudgetOriginal = this.availBudget;
        for (int i = 0; i < budgets.length; ++i) {
            if (this.availBudget > budgets[i]) {
                System.out.print((i + 1) + " ");
                printed = true;
                this.availBudget -= budgets[i];
            }
        }
        if (!printed) {
            System.out.println("none");
        } else {
            System.out.println();
        }
        return availBudgetOriginal - this.availBudget;
    }

}

public class Tumbol2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        Tumbolv2[] tumbols = new Tumbolv2[k];
        for (int i = 0; i < k; ++i) {
            String name = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int population = scan.nextInt();
            tumbols[i] = new Tumbolv2(name, x, y, population);
        }

        int total = 0;
        for (int i = 0; i < k; ++i) {
            int N = scan.nextInt();
            int[] budget = new int[N];
            for (int j = 0; j < N; ++j) {
                budget[j] = scan.nextInt();
            }
            total += tumbols[i].allocateBudget(budget);
        }
        System.out.println(total);
    }
}