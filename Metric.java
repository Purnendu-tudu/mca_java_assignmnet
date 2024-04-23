public class Metric {
    public static double kmToMile(double km) {
        return km / 1.5;
    }
    
    public static double mileToKm(double mile) {
        return mile * 1.5;
    }
    
    public static void main(String[] args) {
        double kmDistance = 10.0;
        double mileDistance = 15.0;
        
        System.out.println(kmDistance + " Kilometres is equal to " + kmToMile(kmDistance) + " Miles");
        System.out.println(mileDistance + " Miles is equal to " + mileToKm(mileDistance) + " Kilometres");
    }
}
