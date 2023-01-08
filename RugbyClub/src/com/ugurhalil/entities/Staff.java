package com.ugurhalil.entities;

import java.util.Objects;

/**
 * Staff
 *
 * @author halilugur
 */
public class Staff {

    private Integer id;
    private String name;
    private String surname;

    /**
     * Staff
     *
     * @param id unique id
     * @param name name
     * @param surname surname
     */
    public Staff(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    /**
     * get Full Name
     *
     * @return combine name and surname
     */
    public String getFullName() {
        return getName() + " " + getSurname();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CoachingStaff) {
            if (Objects.nonNull(obj)) {
                return ((CoachingStaff) (obj)).getId().equals(this.getId());
            }
            return obj.hashCode() == this.hashCode();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname());
    }
}
