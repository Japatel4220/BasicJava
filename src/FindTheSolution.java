public class FindTheSolution {

    public int abc = 20; // anywhere

    private static int def = 25; //withing class

    protected static int xyz = 30; //package and subclasses (inheritance)

    static int ged =  10; //package

    public static void main(String[] args) {
        FindTheSolution findthesolution = new FindTheSolution();
        System.out.println(findthesolution.abc);

    }
}
