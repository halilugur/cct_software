package com.ugurhalil;

import com.ugurhalil.constants.ClubStaffType;
import com.ugurhalil.constants.CoachType;
import com.ugurhalil.constants.DayType;
import com.ugurhalil.entities.CoachingStaff;
import com.ugurhalil.entities.Group;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.ugurhalil.constants.StaffType;

/**
 * Menu
 *
 * @author halilugur
 */
public final class Menu {

    public final List<StaffType> staffTypes = new ArrayList<>();
    public final List<DayType> days = Arrays.asList(DayType.values());
    private final List<String> options = Arrays.asList(
            "List all staff",
            "List staff by a category chosen by the user",
            "List all groups, showing the coach and the number of players in the group",
            "List groups by the day they train",
            "List all the players in a particular group",
            "List the players coached by a particular coach",
            "List all players in the club");

    public Menu() {
        printMenu();
    }

    /**
     * Print menu
     */
    public void printMenu() {
        printTitle();
        printOptions();
        System.out.print("Please select an option: ");
    }

    /**
     * Print title RugbyClub
     */
    private void printTitle() {
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        System.out.println(" ___        __ _  _     _  _         ___  _        _    \n"
                + "| _ \\ _  _ / _` || |__ | || |       / __|| | _  _ | |__ \n"
                + "|   /| || |\\__. ||  _ \\ \\_. |      | (__ | || || ||  _ \\\n"
                + "|_|_\\ \\_._||___/ |____/ |__/        \\___||_| \\_._||____/");
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
    }

    /**
     * Print options
     */
    private void printOptions() {
        for (int i = 0; i < options.size(); i++) {
            // numbered the option list and show on command line
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
    }

    /**
     * print Options For Main Option Two
     */
    public void printOptionsForOptionTwo() {
        // add all staff type in list
        this.staffTypes.addAll(Arrays.asList(ClubStaffType.values()));
        this.staffTypes.addAll(Arrays.asList(CoachType.values()));
        for (int i = 0; i < this.staffTypes.size(); i++) {
            // divide by 5 column to showing
            if ((i + 1) % 5 == 0) {
                // if i + 1 come as 5 we need to do println for new line
                System.out.println((i + 1) + ". " + this.staffTypes.get(i) + "\t");
            } else {
                // if not we can do print for same line
                System.out.print((i + 1) + ". " + this.staffTypes.get(i) + completeSpace(this.staffTypes.get(i).toString(), 15) + "\t");
            }
        }
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");

    }

    /**
     * print Options For Main Option Four
     */
    public void printOptionsForOptionFour() {
        // set size of days
        for (int i = 0; i < days.size(); i++) {
            // divide by 4 column to showing
            if ((i + 1) % 4 == 0) {
                // if i + 1 come as 4 we need to do println for new line
                System.out.println((i + 1) + ". " + days.get(i) + "\t");
            } else {
                // if not we can do print for same line
                System.out.print((i + 1) + ". " + days.get(i) + completeSpace(days.get(i).toString(), 15) + "\t");
            }
        }
        System.out.println("");
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
    }

    /**
     * print Groups Option
     * 
     * @param groups group list
     */
    public void printGroupOptions(List<Group> groups) {
        // size of groups
        for (int i = 0; i < groups.size(); i++) {
            // create name
            String name = groups.get(i).getName() + " (" + groups.get(i).getDay() + ")";
            // divide by 5 column to showing
            if ((i + 1) % 5 == 0) {
                // if i + 1 come as 5 we need to do println for new line
                System.out.println((i + 1) + ". " + name + "\t");
            } else {
                // if not we can do print for same line
                System.out.print((i + 1) + ". " + name + completeSpace(name, 30) + "\t");
            }
        }
        System.out.println("");
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
    }

    /**
     * print Coach Options
     * 
     * @param coachList list of coach
     */
    public void printCoachOptions(List<CoachingStaff> coachList) {
        // size of coach list
        for (int i = 0; i < coachList.size(); i++) {
            // create name
            String name = coachList.get(i).getFullName() + " (" + coachList.get(i).getCoachType() + ")";
            // divide by 5 column to showing
            if ((i + 1) % 5 == 0) {
                // if i + 1 come as 5 we need to do println for new line
                System.out.println((i + 1) + ". " + name + "\t");
            } else {
                // if not we can do print for same line
                System.out.print((i + 1) + ". " + name + completeSpace(name, 30) + "\t");
            }
        }
        System.out.println("");
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
    }

    /**
     * To put spaces between columns
     * 
     * @param string text of column
     * @param maxLength max length of text
     * @return space
     */
    private String completeSpace(String string, int maxLength) {
        String space = "";
        for (int i = string.length(); i < maxLength; i++) {
            // add space to current string 
            space += " ";
        }
        return space;
    }
}
