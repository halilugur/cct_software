package com.ugurhalil.factories;

import com.ugurhalil.entities.ClubStaff;
import static com.ugurhalil.utils.RandomUtil.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author halilugur
 */
public class ClubStaffFactory {

    /**
     * generate Club Staff
     * 
     * @return ClubStaff
     */
    public ClubStaff generateClubStaff() {
        return new ClubStaff(randomName(), randomSurname(), randomClubStaffType());
    }

    /**
     * get Club Staff List
     * 
     * @param numberOfClubStaff size of list
     * @return list of club staff
     */
    public List<ClubStaff> getClubStaffList(int numberOfClubStaff) {
        List<ClubStaff> listOfEntity = new ArrayList<>();
        for (int i = 0; i < numberOfClubStaff; i++) {
            // generate club staff and add in list
            listOfEntity.add(generateClubStaff());
        }
        return listOfEntity;
    }
}
