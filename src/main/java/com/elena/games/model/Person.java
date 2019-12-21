package com.elena.games.model;


import java.util.List;

public class Person {
    private String name;
    private String surname;
    private Integer id;
    private List<BoardGame> game;

    public Person() {
    }

    public Person(String name, String surname, Integer id, List<BoardGame> game) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.game = game;
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

    public List<BoardGame> getGame() {
        return game;
    }

    public void setGame(List<BoardGame> game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", game=" + game +
                '}';
    }
}