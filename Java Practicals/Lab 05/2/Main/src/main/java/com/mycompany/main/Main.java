package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        Speaker poli=new Politician();
        poli.speak();
        
        Speaker pri = new Priest();
        pri.speak();
        
        Speaker lec = new Lecturer();
        lec.speak();
    }
}
