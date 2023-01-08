package com.ugurhalil.entities;

/**
 * Player
 *
 * @author halilugur
 */
public class Player {

    private final String name;
    private final String surname;
    private final Integer age;
    private final boolean gender;

    /**
     * Player
     * 
     * @param name of player
     * @param surname of player
     * @param age of player
     * @param gender of player
     */
    public Player(String name, String surname, Integer age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "\n"
                + getClass().getSimpleName() + "{"
                + "\n" + "Name: " + getName()
                + "\n" + "Surname: " + getSurname()
                + "\n" + "Age: " + getAge()
                + "\n" + "Gender: " + isGender()
                + "}"
                + "\n";
    }
}
