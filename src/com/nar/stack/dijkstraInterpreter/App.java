package com.nar.stack.dijkstraInterpreter;

public class App {
    public static void main(String[] args) {
        Algorithm al = new Algorithm();
        al.interpretExpression("( ( 1 + 2 ) * ( 3 + 2 ) )");
        al.result();
    }
}
