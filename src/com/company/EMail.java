package com.company;

/***
 * This Class represent an EMail. it have email test attachment and sender of email.
 */
public class EMail {
    private String eMailText;
    private String senderName;
    private boolean isContainsAttachments;

    /***
     * Constructor used to initializes the default vale of data field of class.
     */
    public EMail() {
        this.eMailText = "Auto Generate Email";
        this.senderName = "University";
        this.isContainsAttachments = false;
    }

    /***
     * Constructor used to initialize the data field of class EMail.
     * @param eMailText
     * @param senderName
     * @param isContainAttachments
     */
    public EMail(final String eMailText, final String senderName, final boolean isContainAttachments) {
        this.eMailText = eMailText;
        this.senderName = senderName;
        this.isContainsAttachments = isContainAttachments;
    }

    /***
     * This method to get value of text of Email.
     * @return String value of eMailText.
     */
    public String getEMailText() {
        return eMailText;
    }

    /***
     * Method used to set text in Email.
     * @param eMailText add to text in email.
     */
    public void setEMailText(String eMailText) {
        this.eMailText = eMailText;
    }

    /***
     * Method to get value of sender name.
     * @return String value of sender name.
     */
    public String getSenderName() {
        return senderName;
    }

    /***
     * Method used to set sender name of Email.
     * @param senderName  to set value.
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /***
     * method will check presence of attachment in email and return true or false.
     * @return boolean value of isContainAttachments.
     */
    public boolean isContainsAttachments() {
        return isContainsAttachments;
    }

    /***
     * Method used to set true or false if attachment contains or not.
     * @param containsAttachments set value of containAttachments.
     */
    public void setContainsAttachments(boolean containsAttachments) {
        isContainsAttachments = containsAttachments;
    }

    @Override
    public String toString() {
        String isContainsAttachmentText = "Email have attachments. Please see attached files.";
        if (isContainsAttachments == false) {
            isContainsAttachmentText = "Email Don't have any attachment.";
        }
        return "EMail{" +
                "EMail Text='" + eMailText + '\n' +
                "Sender Name='" + senderName + '\n' +
                 isContainsAttachmentText +
                '}';
    }

    /***
     * Method to print all details of email with sender name  email text and if any attachment.
     */
    public void printAllDetails() {
        System.out.println("------------\n");
        System.out.println("Details of Email: " + toString());
    }

}

