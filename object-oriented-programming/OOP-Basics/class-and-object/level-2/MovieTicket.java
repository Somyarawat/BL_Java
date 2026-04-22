class MovieTicket{
    String movieName;
    int seatNumber;
    double price;

    void book(String m, int s){
        movieName = m;
        seatNumber = s;
        if(seatNumber <= 25) {
            price = 400;
        }
        else {
            price = 200;
        }
    }

    void display(){
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }
    
    public static void main(String[] args) {
        MovieTicket m1 = new MovieTicket();
        MovieTicket m2 = new MovieTicket();
        m1.book("Bhoot Bangla", 20);
        m2.book("Stree", 30);
        m1.display();
        m2.display();    
    }
}