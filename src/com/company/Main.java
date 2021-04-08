package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        FictionBook fic1 = new FictionBook("Росмэн","Андерсен",300, "Детские");
        FictionBook fic2 = new FictionBook("Росмэн","Кинг",400);
        FictionBook fic3 = new FictionBook();

        Print(fic1);
        Print(fic2);
        Print(fic3);

        SientificBook book1 = new SientificBook("Росмэн","Куйбышев",400,"Химия","Средняя сложность");
        SientificBook book2= new SientificBook("Росмэн","Прилучный",400);
        SientificBook book3 = new SientificBook();
        Print(book1);
        Print(book2);
        Print(book3);

    }

    public static void Print(FictionBook fic){
        System.out.print("Издательство:"+ fic.GetPublisher()+ "; Автор: "+fic.GetAuthor()+"; Количество страниц: "+fic.GetPages_Amount()+"; жанр: "+fic.GetGenre()+"\n");
    }

    public static void Print (SientificBook book){
        System.out.print("Издательство:"+ book.GetPublisher()+ "; Автор: "+book.GetAuthor()+"; Количество страниц: "+book.GetPages_Amount()+"; предмет: "+book.GetSubject()+"; Сложность: "+book.GetDifficulty()+"\n");
    }



}
