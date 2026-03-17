package com.gla.constructors.AccessModifiers;

class Book{
    public String ISBN;
    protected String title;
    private String author;
    public Book(String i,String t,String a) {
        ISBN=i;
        title=t;
        author=a;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String a) {
        author=a;
    }
}
class EBook extends Book{
    public EBook(String i,String t,String a) {
        super(i,t,a);
    }
    void display(){
        System.out.println(ISBN);
        System.out.println(title);
    }
    public static void main(String args[]) {
        EBook b=new EBook("101","Java","James");
        System.out.println(b.getAuthor());
        b.setAuthor("Robert");
        System.out.println(b.getAuthor());
        b.display();
    }
}