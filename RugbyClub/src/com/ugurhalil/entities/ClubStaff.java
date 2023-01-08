package com.ugurhalil.entities;

import com.ugurhalil.constants.ClubStaffType;
import com.ugurhalil.utils.NumberUtil;

/**
 * ClubStaff
 *
 * @author halilugur
 */
public class ClubStaff extends Staff {

    private final ClubStaffType clubStaffType;

    /**
     * ClubStaff
     * 
     * @param name of ClubStaff
     * @param surname of ClubStaff
     * @param clubStaffType of ClubStaff 
     */
    public ClubStaff(String name, String surname, ClubStaffType clubStaffType) {
        super(NumberUtil.id(), name, surname);
        this.clubStaffType = clubStaffType;
    }

    public ClubStaffType getClubStaffType() {
        return clubStaffType;
    }

    @Override
    public String toString() {
        return "\n"
                + getClass().getSimpleName() + "{"
                + "\n" + "id: " + getId()
                + "\n" + "name: " + getName()
                + "\n" + "surname: " + getSurname()
                + "\n" + "clubStaffType: " + clubStaffType
                + "}"
                + "\n";
    }
}
