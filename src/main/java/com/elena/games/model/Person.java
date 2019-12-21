package com.elena.games.model;


import java.util.List;

public class Person {
    private String name;
    private String lastname;
    private Integer id;
    private List<BoardGame> game;

    public Person() {
        // empty constructor
    }

    public Person(String name, String lastname, Integer id, List<BoardGame> game) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                ", game=" + game +
                '}';
    }
}
