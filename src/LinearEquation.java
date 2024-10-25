public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;








    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }




    public double roundHundredth(double val){
        return Math.round(val * 100.0) / 100.0;
    }




    public double distance(){
        return roundHundredth(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }




    public double slope(){
        return roundHundredth((double)(y2 - y1) / (x2 - x1));
    }




    public double yIntercept(){
        return roundHundredth((y1 - (slope() * x1)));
    }




    public String equation() {
        double slope = roundHundredth(slope());
        double yIntercept = roundHundredth(yIntercept());
        String slopeStr;
        String yInterceptStr = "";
        if (slope == (int) slope) {
            slopeStr = String.valueOf((int) slope);
        } else {
            slopeStr = String.valueOf(slope);
        }
        if (yIntercept > 0) {
            yInterceptStr = " + " + yIntercept;
        } else if (yIntercept < 0) {
            yInterceptStr = " - " + Math.abs(yIntercept);
        }
        return "y = " + slopeStr + "x" + yInterceptStr;
    }




    public String coordinateForX(double xValue) {
        double slope = slope();
        double yIntercept = yIntercept();




        double yValue = roundHundredth(slope * xValue + yIntercept);




        return "(" + roundHundredth(xValue) + ", " + yValue + ")";
    }




    public String lineInfo() {
        double slope = roundHundredth(slope());
        double yIntercept = roundHundredth(yIntercept());
        double distance = roundHundredth(distance());




        String slopeStr;
        if (slope == (int) slope) {
            slopeStr = String.valueOf((int) slope);     }
        else {
            slopeStr = String.valueOf(slope);
        }








        String yInterceptStr = "";
        if (yIntercept > 0) {
            yInterceptStr = " + " + yIntercept;
        } else if (yIntercept < 0) {
            yInterceptStr = " - " + Math.abs(yIntercept);
        }








        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\n" +
                "The equation of the line between these points is: y = " + slopeStr + "x" + yInterceptStr + "\n" +
                "The y-intercept of the line is: " + yIntercept + "\n" +
                "The slope of the line is: " + slopeStr + "\n" +
                "The distance between the points is: " + distance;
    }




}




