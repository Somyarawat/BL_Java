class Sum<T extends Number>{
    T[] nums;

    Sum(T[] nums){
        this.nums = nums;
    }

    double sum(){
        double sum = 0;
        for(T i : nums){
            sum += i.doubleValue();
        }
        return sum;
    }
}

@SuppressWarnings("unused")
class UpperBound {
    public static void main(String[] args){
        Integer[] iNums = {22, 01, 26, 24, 06};
        Sum<Integer> iSum = new Sum<>(iNums);
        System.out.println("Integer Sum: " + iSum.sum());

        Double[] dNums = {22.2, 1.6, 26.26, 24.24, 6.1};
        Sum<Double> dSum = new Sum<>(dNums);
        System.out.println("Double Sum: " + dSum.sum());
    }
}