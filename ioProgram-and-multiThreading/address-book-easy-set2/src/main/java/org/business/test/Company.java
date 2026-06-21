package org.business.test;

public class Company {
    private String companyName;
    private String contactEmail;
    private String officePhone;
    private String industry;

    Company(String companyName,String contactEmail,String officePhone,String industry){
        this.companyName = companyName;
        this.contactEmail = contactEmail;
        this.officePhone = officePhone;
        this.industry = industry;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public String getIndustry() {
        return industry;
    }

    public String toString(){
        return "Company Name: " + companyName + ", Contact Email: " + contactEmail +
                ", Office Phone: " + officePhone + ", Industry: " + industry;
    }


}
