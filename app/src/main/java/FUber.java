public class FUber {

    public static float euclidean(float x1, float y1, float x2, float y2) {
        // Implement the method here
        float x_dif = x2 - x1;
        float y_dif = y2 - y1;
        float square_sums = (x_dif * x_dif) + (y_dif * y_dif);
        float d = (float) Math.sqrt(square_sums);
        return d;}

    public static float manhattan(float x1, float y1, float x2, float y2) {
        // Implement the method here
        float x_dif = x2 - x1;
        float y_dif = y2 - y1;

        if (x_dif < 0) {
            x_dif = x_dif * -1;}
        if (y_dif < 0) {
            y_dif = y_dif * -1;
        }

        float d2 = x_dif + y_dif;
        return d2;
}



    public static void main(String[] args) {
        float x1 = 5, y1 = 9;
        float x2 = 6, y2 = 15;

        System.out.println("Eucliidian is: " + euclidean(x1, y1, x2, y2));
        System.out.println("Manhattan is: " + manhattan(x1, y1, x2, y2)); } }