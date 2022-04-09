public class LineComparisonProblem {
    public static void main(String[] args) {

        //first line co-ordinates
        int x1 = 10, y1 = 20;
        int x2 = 20, y2 = 40;
        //second line co-ordinates
        int x3 = 10, y3 = 40;
        int x4 = 20, y4 = 60;

        double lenght1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
            System.out.println("Lenght of first Line= " + lenght1);

        double lenght2 = Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));
            System.out.println("Lenght of second Line= " + lenght2);

        if (lenght1 == lenght2)
            System.out.println("Two lines are equal");
        
        else {
            System.out.println("Two lines are not equal");
        }
        
    }

}


