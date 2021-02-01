package com.company;

import java.util.ArrayList;
import java.util.List;

/***
 * EmailClient represent email client and hold all emails in a list.
 */
public class EmailClient {
    private List<EMail> listOfEMail = new ArrayList<>();

    /***
     *Method to get list of emails.
     * @return List of email.
     */
    public List<EMail> getListOfEMail() {
        return listOfEMail;
    }

    /***
     * Method will add new email in list and return false if is already present in list otherwise true.
     * @param eMail to add in list.
     * @return boolean false or true.
     */
    public boolean addEMailInTheEmailList(EMail eMail) {
        if (eMail != null && listOfEMail.contains(eMail)) {
            System.out.println("Input email object is already in the email list or null.");
            return false;
        } else {
            listOfEMail.add(eMail);
            System.out.println("Following email has been added successfully in the email list: \n" + eMail.toString());
            return true;
        }
    }

    /***
     * Method will remove email on given index and will catch error if index is out of bound .
     * @param index to remove email from list.
     */
    public void removeEmailFromTheList(int index) {
        try {
            if (index < listOfEMail.size()) {
                listOfEMail.remove(index);
                System.out.println("EMail object removed successfully from list of Email");
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("input index provided is out of range");
        }
    }

    /***
     * Method to check is list empty or not?
     * @return boolean true or false.
     */
    public boolean isEmailListEmpty() {
        boolean isEmpty = true;
        if (listOfEMail.isEmpty()) {
            isEmpty = false;
        }
        return isEmpty;
    }

    /***
     * Method to print details of all email(sender name,text email, attachment).
     */
    public void printDetails() {
        if (listOfEMail.isEmpty()) {
            System.out.println("There is no Email in list!");
        } else {
            for (EMail eMail : listOfEMail) {
                System.out.println("------------------" + "\n");
                System.out.println(" Detail of Email is : " + toString());
            }
        }
    }

    /***
     * Method to search  email by sender name,
     * will check condition if "isContainsAttachments" is true.
     * then will print all details of Email.
     * @param senderName to search
     */
    public void searchEmailBySenderName(String senderName) {
        int index = 0;
        while(index < listOfEMail.size()) {
            EMail eMailAtIndex = listOfEMail.get(index);
            // checking sender is same and contains attachment that will make sure email have one or more attachment.
            if (eMailAtIndex.getSenderName().equals(senderName) && eMailAtIndex.isContainsAttachments()) {
                eMailAtIndex.printAllDetails();
                index++;
            }

        }
    }

}



