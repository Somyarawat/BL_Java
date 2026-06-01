class DeprecatedC{
    @Deprecated
    void display(){
        System.out.println("DeprecatedTest Display");
    }
}
public class DeprecatedTest{
    public static void main(String[] args) {
        DeprecatedC d1 = new DeprecatedC();
        d1.display();
    }
}    

