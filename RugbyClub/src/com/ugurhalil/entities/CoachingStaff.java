package com.ugurhalil.entities;

import com.ugurhalil.constants.CoachType;
import com.ugurhalil.utils.NumberUtil;

/**
 * CoachingStaff
 *
 * @author halilugur
 */
public class CoachingStaff extends Staff {

    private final Integer qualification;
    private final CoachType coachType;

    /**
     * CoachingStaff
     *
     * @param name of CoachingStaff
     * @param surname of CoachingStaff
     * @param coachType of CoachingStaff
     */
    public CoachingStaff(String name, String surname, CoachType coachType) {
        super(NumberUtil.id(), name, surname);
        this.coachType = coachType;
        this.qualification = findQualification(coachType);
    }

    /**
     * find Qualification by coach type
     * Just Head Coach can be 5
     *
     * @param coachType type of coach
     * @return Integer between 1-5
     */
    private Integer findQualification(CoachType coachType) {
        if (coachType.equals(CoachType.HEAD)) {
            return 5;
        }
        return NumberUtil.random(1, 5);
    }

    public Integer getQualification() {
        return qualification;
    }

    public CoachType getCoachType() {
        return coachType;
    }

    @Override
    public String toString() {
        return "\n"
                + getClass().getSimpleName() + "{"
                + "\n" + "id: " + getId()
                + "\n" + "name: " + getName()
                + "\n" + "surname: " + getSurname()
                + "\n" + "coachType: " + coachType
                + "\n" + "qualification: " + qualification
                + "}"
                + "\n";
    }
}
