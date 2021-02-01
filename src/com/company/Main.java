package com.company;

public class Main {

    public static void main(String[] args) {
	    EMail email1 = new EMail("java book attached", "Vijayshree", true);
        EMail email2 = new EMail("python book attached", "Vijayshree", true);
        EMail email3 = new EMail("sql book attached", "Vijayshree", false);
        EmailClient emailClient = new EmailClient();
        emailClient.addEMailInTheEmailList(email1);
        emailClient.addEMailInTheEmailList(email2);
        emailClient.addEMailInTheEmailList(email3);
        emailClient.searchEmailBySenderName("Vijayshree");
        emailClient.removeEmailFromTheList(5);
        System.out.println("hello Mail");
    }
}
