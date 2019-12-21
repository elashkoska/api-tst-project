package com.elena.games.model;


public class Person {
    private String name;
    private String surname;
    private Integer id;
    protected BoardGame games;

    public Person() {
    }

    public Person(String name, String surname, Integer id, BoardGame games) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.games = games;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BoardGame getGames() {
        return games;
    }

    public void setGames(BoardGame games) {
        this.games = games;
    }
}
