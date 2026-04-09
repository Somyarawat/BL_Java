class EarthVolume {
    public static void main(String[] args) {
        
        double radius = 6378;
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

        double volumeMiles = volumeKm * 0.239913;

        System.out.println("Volume in km^3: " + volumeKm + " and in miles^3: " + volumeMiles);
    }
}    