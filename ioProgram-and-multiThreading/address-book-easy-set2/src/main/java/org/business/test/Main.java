package org.business.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        SimpleRepository<Company> repository = new SimpleRepository<>();
        FileService.importCompanies("businessess.csv", repository);
        repository.getAll().forEach(System.out::println);

        System.out.println("Enter Company Name: ");
        String keyword = sc.nextLine();
        repository.getAll().stream().filter(company -> company.getCompanyName()
                .startsWith(keyword)).forEach(System.out::println);

        System.out.println("Enter phone to delete: ");
        String phone = sc.nextLine();
        repository.remove(company -> company.getOfficePhone().equalsIgnoreCase(phone));
        System.out.println("Companies after deletion: ");
        repository.getAll().forEach(System.out::println);

        if(!repository.getAll().isEmpty()){
            FileService.exportCompanyCard(repository.getAll().get(0),"company-card.json");
        }

        System.out.println("Thread State");
        Thread monitorThread = new Thread(new MonitorTask());
        System.out.println("After Creation: " + monitorThread.getState());
        monitorThread.start();
        System.out.println("After start: " + monitorThread.getState());
        monitorThread.join();
        System.out.println("After completion: " + monitorThread.getState());
    }
}
