import java.util.Scanner;
class Song {
    int songId;
    String songName;
    Song next;

    Song(int songId, String songName) {
        this.songId = songId;
        this.songName = songName;
        this.next = null;
    }
}

class CircularLinkedList {
    Song head = null;
    Song tail = null;

    void addSong(int id, String name) {
        Song newSong = new Song(id, name);
        if (head == null) {
            head = newSong;
            tail = newSong;
            tail.next = head;
        }
        else {
            tail.next = newSong;
            tail = newSong;
            tail.next = head;
        }
        System.out.println("Song Added");
    }

    void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is Empty!");
        }
        Song temp = head;
        while (temp.next != head) {
            System.out.println("Song ID : " + temp.songId);
            System.out.println("Song Name : " + temp.songName);
            temp = temp.next;
        }
        System.out.println("Song ID : " + temp.songId);
        System.out.println("Song Name : " + temp.songName);
    }

    void searchSong(int searchId) {
        if (head == null) {
            System.out.println("Playlist is Empty!");
        }
        Song temp = head;
        while (temp.next != head) {
            if (temp.songId == searchId) {
                System.out.println("Song Found!");
                System.out.println("Song ID : " + temp.songId);
                System.out.println("Song Name : " + temp.songName);
            }
            temp = temp.next;
        }
        if (temp.songId == searchId) {
            System.out.println("Song Found!");
            System.out.println("Song ID : " + temp.songId);
            System.out.println("Song Name : " + temp.songName);
        }
        System.out.println("Song Not Found!");
    }

    void deleteSong(int deleteId) {
        if (head == null) {
            System.out.println("Playlist is Empty!");
        }
        if (head.songId == deleteId) {
            if (head == tail) {
                head = null;
                tail = null;
            }
            else {
                head = head.next;
                tail.next = head;
            }
            System.out.println("Song Deleted");
        }
        Song temp = head;
        while (temp.next != head) {
            if (temp.next.songId == deleteId) {
                if (temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                tail.next = head;
                System.out.println("Song Deleted");
            }
            temp = temp.next;
        }
        System.out.println("Song Not Found!");
    }
}

public class PlaylistManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList playlist = new CircularLinkedList();
        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Add Song");
            System.out.println("2. Display Playlist");
            System.out.println("3. Search Song");
            System.out.println("4. Delete Song");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Song ID : ");
                    int id = sc.nextInt();
                    System.out.print("Enter Song Name : ");
                    String name = sc.next();
                    playlist.addSong(id, name);
                }
                case 2 -> playlist.displayPlaylist();
                case 3 -> {
                    System.out.print("Enter Song ID to Search : ");
                    int searchId = sc.nextInt();
                    playlist.searchSong(searchId);
                }
                case 4 -> {
                    System.out.print("Enter Song ID to Delete : ");
                    int deleteId = sc.nextInt();
                    playlist.deleteSong(deleteId);
                }
                case 5 -> System.out.println("Program Ended.");
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}