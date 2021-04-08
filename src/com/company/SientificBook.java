package com.company;

public class SientificBook extends Book {
    protected  String subject;
    protected  String difficulty;

    public SientificBook(String publisher, String author, int pages_amount,String subject, String difficulty){
        super(publisher,author,pages_amount);
        this.subject=subject;
        this.difficulty=difficulty;
    }

    public SientificBook(String publisher, String author, int pages_amount){
        super(publisher,author,pages_amount);
        this.subject="Научная";
        this.difficulty="Средняя";
    }

    public SientificBook(){
        super();
        this.subject="Неизвестно";
        this.difficulty="Информация не доступна";
    }

    public String GetSubject(){
        return subject;
    }

    public String GetDifficulty(){
        return difficulty;
    }

    public void Name (){
        System.out.println(publisher+author+subject+difficulty);
    }
}
