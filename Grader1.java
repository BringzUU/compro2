
public class Grader1 {
    public String name;
    public String desc;
    public int[] pts;
    public String[] sols;
    public Grader1(String name,String desc,int[] pts,String[] sols){
        this.name =name;
        this.desc =desc;
        this.pts = java.util.Arrays.copyOf(pts, pts.length);
        this.sols = java.util.Arrays.copyOf(sols, sols.length);
    }
}