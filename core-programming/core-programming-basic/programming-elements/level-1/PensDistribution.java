class PensDistribution {
    public static void main(String[] args){

        int pens = 14;
        int student = 3;

        int perStudent = pens / student;
        int remaining = pens % student;

        System.out.println("The Pen Per Student are " + perStudent + " and the remaining pens are " + remaining);
    }
}