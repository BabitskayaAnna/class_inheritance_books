package com.company;

public class Book {

    protected String publisher;
    protected String author;
    protected  int pages_amount;

    public Book(String publisher, String author, int pages_amount){
        this.publisher=publisher;
        this.author=author;
        this.pages_amount=pages_amount;
    }

    public Book(){
        this.publisher="Издательство неизвестно";
        this.author="Автор неизвестен";
        this.pages_amount= 0;
    }

    public Book(String publisher,String author){
        this.publisher = publisher;
        this.author=author;
        this.pages_amount = 300;
    }

    public  String GetPublisher(){
        return publisher;
    }

    public String GetAuthor(){
        return  author;
    }

    public int GetPages_Amount(){
        return pages_amount;
    }

    public void Name(){
        System.out.println(publisher + author);
    }
}
