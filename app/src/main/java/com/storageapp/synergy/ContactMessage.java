package com.storageapp.synergy;

public class ContactMessage {

    String nameOfPerson,emailOfPerson,contactOfPerson,messageOfPerson;

    public ContactMessage(){

    }

    public ContactMessage(String nameOfPerson,String contactOfPerson,String emailOfPerson,String messageOfPerson)
    {
        this.nameOfPerson = nameOfPerson;
        this.emailOfPerson = emailOfPerson;
        this.contactOfPerson = contactOfPerson;
        this.messageOfPerson = messageOfPerson;
    }


    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public String getContactOfPerson() {
        return contactOfPerson;
    }

    public String getEmailOfPerson() {
        return emailOfPerson;
    }

    public String getMessageOfPerson() {
        return messageOfPerson;
    }
}