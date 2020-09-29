package com.example.myjavacode;

public class ItBegins {

    static Human Bob;
    static Human Don = new Human();
    static Human Adam;
    static Mutant Iron_Man;
    static Mutant Thor;

    public static void main(String[] args) {

        //Bob = new Human(5, 100);
        //Don = new Human(7, 120);
           Don.Height(2);

           Bob = new Human ();
           Bob.Weight(100);
           Bob.Height(5);
           Bob.Distance(100);
           Bob.Talk("My name is Bob");

           Adam = new Human ();
           Adam.Distance(200);
           Adam.Talk("My name is Adam");
           Adam.Weight(115);
           Adam.Height(5);

           Iron_Man = new Mutant();
           Iron_Man.Superhero(1);
           Iron_Man.Weight(1000);
           Iron_Man.Height(6);
           Iron_Man.Talk("And I, am, Iron Man");

           Thor = new Mutant();
           Thor.Superhero(1);
           Thor.Weight(220);
           Thor.Height(7);

    }
}




