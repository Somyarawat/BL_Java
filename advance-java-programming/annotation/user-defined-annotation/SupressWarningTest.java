class DeprecatedTest{
    @Deprecated
    void display(){
        System.out.println("DeprecatedTest display");
    }
}

@SuppressWarnings("unused")
class SupressWarningTest{
    @SuppressWarnings({"checked", "deprecation"})
    public static void main(String[] args) {
        DeprecatedTest d = new DeprecatedTest();
        d.display();
    }
}