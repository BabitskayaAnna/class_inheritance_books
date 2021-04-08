package com.company;

public class FictionBook extends Book {
    private String genre;

    public FictionBook(String publisher, String author, int pages_amount, String genre){
        super(publisher,author,pages_amount);
        this.genre=genre;
    }
    public  FictionBook (String publisher, String author, int pages_amount){
        super(publisher,author,pages_amount);
        this.genre="Жанр неизвестен";
    }

    public FictionBook (){
        super();
        this.genre="По умолчанию";
    }

    public String GetGenre(){
        return genre;
    }

    public void Name(){
        System.out.println(publisher+author+genre);
    }
}
