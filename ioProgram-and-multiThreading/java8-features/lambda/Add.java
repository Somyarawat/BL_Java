
class Add {
    public static void main(String[] args) {
        SumInter sumInter = (a, b) -> a + b;
        System.out.println(sumInter.sum(4,5));
        System.out.println(sumInter.sum(5, 5));
    }
}