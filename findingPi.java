//Aaron Prince Anu
class findingPi 
{
    /*public static void main(String[] args) {
        int numPoints = 1000000; // number of points to generate
        int numInside = 0; // number of points inside the quarter circle
        double x;
        double y;

        for (int i = 0; i < numPoints; i++) {
            // generate random point in square
            x = Math.random();
            y = Math.random();

            // check if point is inside quarter circle
            if (x*x + y*y <= 1 && x >= 0 && y >= 0) {
                numInside++;
            }
        }

        // calculate and print probability
        double probability = (double) numInside / numPoints;
        System.out.println("Probability that a random point is inside the quarter circle: " + probability);
        System.out.println("Expected probability: " + Math.PI / 4);
    }*/

    public static void main(String[] args) 
    {
        //initialize vars
        double x;
        double y;
        double distance;
        double pi;

        int circleProbalility = 0;
        int squareProbability = 0;

        //loop
        for (int i = 0; i <= 1000; i++)
        {
            x = Math.random() * 2 - 1;
            y = Math.random() * 2 - 1;
            distance = x * x + y * y;

            if (distance < 1) 
            {
                circleProbalility++;    
            }

            squareProbability++;

            pi = ((4.0*circleProbalility)/squareProbability);

            if (i%1000 == 0)
            {
                System.out.println("at " + i + " repititions, estimated pi is " + pi); //final output
            }
        }

    }
}