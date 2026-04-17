
class Bonus {

    public static double[][] data() {
        double[][] d = new double[10][2];
        for (int i = 0; i < 10; i++) {
            d[i][0] = (int)(Math.random()*90000)+10000;
            d[i][1] = (int)(Math.random()*10)+1;
        }
        return d;
    }

    public static void main(String[] args) {
        double[][] d = data();
        double totalBonus=0, old=0, news=0;

        for (int i = 0; i < 10; i++) {
            double sal = d[i][0];
            double yr = d[i][1];

            double b = yr > 5 ? sal*0.05 : sal*0.02;
            double ns = sal + b;

            totalBonus += b;
            old += sal;
            news += ns;
        }

        System.out.println(old);
        System.out.println(news);
        System.out.println(totalBonus);
    }
}