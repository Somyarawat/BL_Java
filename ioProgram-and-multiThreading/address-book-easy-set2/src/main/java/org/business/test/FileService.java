package org.business.test;

import java.io.*;

public class FileService {

    public static void importCompanies(String fileName, SimpleRepository<Company> repository){
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = br.readLine()) != null){
                String[] data = line.split(",");
                String companyName = data[0];
                String email = data[1];
                String phone = data[2];
                String industry = data[3];

                if(!email.contains("@")){
                    System.out.println("Invalid Company:" + companyName);
                    continue;
                }

                Company company = new Company(companyName, email, phone, industry);
                repository.add(company);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }

    public static void exportCompanyCard(Company company, String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("{\n");
            fw.write("\"companyName\":\"" + company.getCompanyName() + "\",\n");
            fw.write("\"contactEmail\":\"" + company.getContactEmail() + "\",\n");
            fw.write("\"officePhone\":\"" + company.getOfficePhone() + "\",\n");
            fw.write("\"industry\":\"" + company.getIndustry() + "\"\n");
            fw.write("}");
            fw.close();
            System.out.println("JSON File Created");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
