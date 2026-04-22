class PalindromeChecker {
    String text;

    PalindromeChecker(String t){
        this.text = t;
    }

    boolean check(){
        String rev = "";
        for(int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return text.equalsIgnoreCase(rev);
    }

    void display(){
        System.out.println(check() ? "Palindrome" : "Not Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker pChecker = new PalindromeChecker("MADAM");
        pChecker.display();
    }
}