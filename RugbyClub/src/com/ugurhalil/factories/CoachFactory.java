package com.ugurhalil.factories;

import com.ugurhalil.constants.CoachType;
import com.ugurhalil.entities.CoachingStaff;
import static com.ugurhalil.utils.RandomUtil.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author halilugur
 */
public class CoachFactory {

    /**
     * generate Coaching Staff
     * 
     * @return Coaching Staff
     */
    public CoachingStaff generateCoachingStaff() {
        return new CoachingStaff(randomName(), randomSurname(), randomCoachType());
    }

    /**
     * generate Coaching Staff by coach Type
     * 
     * @param coachType coach type
     * @return Coaching Staff
     */
    private CoachingStaff generateCoachingStaff(CoachType coachType) {
        return new CoachingStaff(randomName(), randomSurname(), coachType);
    }

    /**
     * generate Coach List by size
     * 
     * @param numberOfPlayer size of list
     * @return list of coach
     */
    public List<CoachingStaff> generateCoachList(int numberOfPlayer) {
        List<CoachingStaff> listOfEntity = new ArrayList<>();
        // add HEAD coach manuel
        listOfEntity.add(generateCoachingStaff(CoachType.HEAD));
        for (int i = 0; i < numberOfPlayer; i++) {
            // generate coach and add in list
            listOfEntity.add(generateCoachingStaff());
        }
        return listOfEntity;
    }
}
