import java.util.Scanner;

class Tumbol {

    private String name;
    private int latitude;
    private int longitude;
    private int population;
    private int availBudget;

    public Tumbol(String name, int latitude, int longitude, int population) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.population = population;
        this.availBudget = 5_000 * population;
    }

    public void allocateBudget(int[] budgets) {
        boolean printed = false;

        for (int i = 0; i < budgets.length; ++i) {
            if (this.availBudget > budgets[i]) {
                System.out.print((i + 1) + " ");
                printed = true;
                this.availBudget -= budgets[i];
            }
        }
        if (!printed) {
            System.out.println("none");
        }

    }

}

public class Tumbol1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int latitude = sc.nextInt();
        int longitude = sc.nextInt();
        int population = sc.nextInt();
        int N = sc.nextInt();
        int[] budgets = new int[N];
        for (int i = 0; i < N; ++i) {
            budgets[i] = sc.nextInt();
        }

        Tumbol tb = new Tumbol(name, latitude, longitude, population);
        tb.allocateBudget(budgets);
    }
}