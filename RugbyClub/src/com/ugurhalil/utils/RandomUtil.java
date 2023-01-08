package com.ugurhalil.utils;

import com.ugurhalil.constants.ClubStaffType;
import com.ugurhalil.constants.CoachType;
import com.ugurhalil.constants.DayType;
import com.ugurhalil.constants.GroupType;

/**
 * This class created for random generating values.
 *
 * @author halilugur
 */
public class RandomUtil {

    // Defined static meaningful names
    private static final String[] NAMES = {"Antonio", "Gracie", "Fynn", "Molly", "Ewan", "Khalid", "Gladys", "Jed", "Angelina", "Calum", "Tammy", "Fion", "Macie", "Eva", "Georgiana", "Isabella", "Romeo", "Wojciech", "Heath", "Elisabeth"};
    // Defined static meaningful surnames
    private static final String[] SURNAMES = {"Sykes", "Huber", "Short", "Strickland", "Sanders", "Holmes", "Pineda", "Velez", "Price", "Bonilla", "Schultz", "Blanchard", "Maddox", "Knowles", "Goodman", "Parks", "Smith", "Underwood", "Walls", "Vega"};
    // Defined static random true false for gender
    private static final boolean[] BOOLEAN = {true, false};
    // Defined static days names
    private static final DayType[] DAY_TYPE = DayType.values();
    // Defined static Coach Types
    private static final CoachType[] COACH_TYPES = CoachType.values();
    // Defined static Club Staff Types
    private static final ClubStaffType[] CLUB_STAFF_TYPES = ClubStaffType.values();
    // Defined static Group Types
    private static final GroupType[] GROUP_TYPES = GroupType.values();
    // Defined static meaningful group names
    private static final String[] GROUP_NAMES = {"ArmourFit", "Be Fit", "Body Edge", "Burn Spots Personal Training", "Changing Tide", "Curl", "Daily Grind Fitness", "Elite Training", "Fearless Fitness", "Fit From the Core", "Fitworks", "Function First", "Got Muscle", "High Tide Fitness", "Hour of Change Fitness", "Hustle Hut", "Incinerate", "Just You Fitness", "Mindful Body Fitness", "Mission: FIT", "One to One Fitness", "Overload", "Own Your Fitness", "Right Fit", "Shape Up Studio", "Shaping Concepts", "Straight Blasts Gym", "Stronger Fitness", "The Bar Method", "The Blackout Fitness", "Through Christ Fit", "Throwdown", "Victory Fitness Center", "Visualize Fitness", "Wattage"};

    /**
     * get random name
     *
     * @return meaningful name
     */
    public static String randomName() {
        return NAMES[NumberUtil.random(0, NAMES.length)];
    }

    /**
     * get random surname
     *
     * @return meaningful surname
     */
    public static String randomSurname() {
        return SURNAMES[NumberUtil.random(0, SURNAMES.length)];
    }

    /**
     * get Coach Type
     *
     * @return Coach Type
     */
    public static CoachType randomCoachType() {
        return COACH_TYPES[NumberUtil.random(1, COACH_TYPES.length)];
    }

    /**
     * get Club Staff Type
     *
     * @return Club Staff Type
     */
    public static ClubStaffType randomClubStaffType() {
        return CLUB_STAFF_TYPES[NumberUtil.random(0, CLUB_STAFF_TYPES.length)];
    }

    /**
     * get Group Type
     *
     * @return Group Type
     */
    public static GroupType randomGroupType() {
        return GROUP_TYPES[NumberUtil.random(0, GROUP_TYPES.length)];
    }

    /**
     * get Day
     *
     * @return Day Type
     */
    public static DayType randomDay() {
        return DAY_TYPE[NumberUtil.random(0, DAY_TYPE.length)];
    }

    /**
     * get random Group Name
     *
     * @return meaningful Group Name
     */
    public static String randomGroupName() {
        return GROUP_NAMES[NumberUtil.random(0, GROUP_NAMES.length)];
    }

    /**
     * get boolean for gender
     *
     * @return boolean gender
     */
    public static boolean randomBoolean() {
        return BOOLEAN[NumberUtil.random(0, BOOLEAN.length)];
    }

    /**
     * get random Age
     *
     * @return random Age
     */
    public static Integer randomAge() {
        return NumberUtil.random(18, 40);
    }
}
