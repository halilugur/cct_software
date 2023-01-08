package com.ugurhalil;

import com.ugurhalil.constants.ClubStaffType;
import com.ugurhalil.constants.CoachType;
import com.ugurhalil.constants.DayType;
import com.ugurhalil.entities.ClubStaff;
import com.ugurhalil.entities.CoachingStaff;
import com.ugurhalil.entities.Group;
import com.ugurhalil.entities.Player;
import com.ugurhalil.entities.Staff;
import com.ugurhalil.factories.ClubStaffFactory;
import com.ugurhalil.factories.CoachFactory;
import com.ugurhalil.factories.PlayerFactory;
import com.ugurhalil.factories.GroupFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import com.ugurhalil.constants.StaffType;

/**
 *
 * @author halilugur
 */
public class RugbyClub {

    private final static Scanner scanner = new Scanner(System.in);
    private final CoachFactory COACH_FACTORY = new CoachFactory();
    private final ClubStaffFactory CLUB_STAFF_FACTORY = new ClubStaffFactory();
    private final PlayerFactory PLAYER_FACTORY = new PlayerFactory();
    private final GroupFactory GROUP_FACTORY = new GroupFactory();

    private final List<CoachingStaff> coachList;
    private final List<ClubStaff> clubStaffList;
    private final List<Group> groupList;
    private final List<Staff> staffs = new ArrayList<>();
    private final List<List<Player>> players;

    /**
     *
     * @param args argument that come from command line
     */
    public static void main(String[] args) {
        // Create RugbyClub
        RugbyClub rugbyClub = new RugbyClub();
        // Create Menu
        Menu menu = new Menu();
        // Read options from user
        int option = scanner.nextInt();
        // When option come as 0 we exit the program
        while (option != 0) {
            // Do action by option
            switch (option) {
                case 1:
                    // print list of staff
                    rugbyClub.listAllStaff();
                    break;
                case 2:
                    // write the options of main second option
                    menu.printOptionsForOptionTwo();
                    System.out.print("Please select a staff type: ");
                    // read option from user and check that it between range.
                    int optionForTwo = rugbyClub.checkNumber(1, menu.staffTypes.size());
                    // show list Staff by Type
                    rugbyClub.listAllStaffByCategory(menu.staffTypes.get(optionForTwo));
                    break;
                case 3:
                    // print list All Group
                    rugbyClub.listAllGroup();
                    break;
                case 4:
                    // write the options of main four option
                    menu.printOptionsForOptionFour();
                    System.out.print("Please select a day: ");
                    // read option from user and check that it between range.
                    int optionForFour = rugbyClub.checkNumber(1, menu.days.size());
                    // show list Groups By Day
                    rugbyClub.listGroupsByDay(menu.days.get(optionForFour));
                    break;
                case 5:
                    // write the options of main five option
                    menu.printGroupOptions(rugbyClub.groupList);
                    System.out.print("Please select a group: ");
                    // read option from user and check that it between range.
                    int optionForFive = rugbyClub.checkNumber(1, rugbyClub.groupList.size());
                    // show list Players By Group
                    rugbyClub.listPlayersByGroup(rugbyClub.groupList.get(optionForFive));
                    break;
                case 6:
                    // write the options of main six option
                    menu.printCoachOptions(rugbyClub.coachList);
                    System.out.print("Please select a coach: ");
                    // read option from user and check that it between range.
                    int optionForSix = rugbyClub.checkNumber(1, rugbyClub.coachList.size());
                    // show list Players By Coach In group
                    rugbyClub.listPlayersByCoach(rugbyClub.coachList.get(optionForSix));
                    break;
                case 7:
                    // print list All Players
                    rugbyClub.listAllPlayers();
                    break;
                default:
                    System.out.println("This option is not available. Please choose an option from the options below.");
            }
            menu.printMenu();
            option = scanner.nextInt();
        }
    }

    /**
     * number should between max and min range
     *
     * @param min minimum of range
     * @param max maximum of range
     * @return a number of between max and min
     */
    public int checkNumber(int min, int max) {
        // read number from customer
        int number = scanner.nextInt();
        // check the number
        if (number < min || number > max) {
            System.out.println("This option is not available. Please choose an option from the options abow.");
            System.out.print("Please select an option: ");
            // number not between min and max, so we need to read again from user
            checkNumber(min, max);
        }
        // decrement the number because arrays start from 0
        return number - 1;
    }

    /**
     * RugbyClub
     */
    public RugbyClub() {
        // prepare coach list
        this.coachList = COACH_FACTORY.generateCoachList(20);
        // prepare clubStaff list
        this.clubStaffList = CLUB_STAFF_FACTORY.getClubStaffList(50);
        // coach and club staff add to staff list
        staffs.addAll(coachList);
        staffs.addAll(clubStaffList);
        // prepare group List
        this.groupList = GROUP_FACTORY.generateGroupList(30);
        // set coach for each group
        // one coach can't give traning same day more than 2
        GROUP_FACTORY.setCoachesToGroups(groupList, coachList);
        // prepare players by group size
        this.players = PLAYER_FACTORY.generatePlayersByGroupSize(300, this.groupList.size());
        // set player to groups
        GROUP_FACTORY.setPlayersToGroups(groupList, players);
    }

    /**
     * list All Group
     */
    public void listAllGroup() {
        groupList.forEach(group -> {
            System.out.println("--------------------------------------");
            System.out.println(group.getCoach());
            System.out.println("Player Size: " + group.getPlayers().size());
            System.out.println("--------------------------------------");
        });
    }

    /**
     * list All Staff
     */
    public void listAllStaff() {
        System.out.println(staffs);
    }

    /**
     * list All Staff By StaffType
     *
     * @param type type of staff
     */
    public void listAllStaffByCategory(StaffType type) {
        List<Staff> result = null;
        // if type is inheretance by ClubStaffType
        if (type instanceof ClubStaffType) {
            result = clubStaffList.stream()
                    // filter the club staff list by type
                    .filter(staff -> staff.getClubStaffType().equals(type))
                    // to list
                    .collect(Collectors.toList());
        }
        // if type is inheretance by CoachType
        if (type instanceof CoachType) {
            result = coachList.stream()
                    // filter the coach staff list by type
                    .filter(staff -> staff.getCoachType().equals(type))
                    .collect(Collectors.toList());
        }
        System.out.println(result);
    }

    /**
     * list Groups By Day
     *
     * @param day
     */
    public void listGroupsByDay(DayType day) {
        System.out.println("-------------------" + day + "-------------------");
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        groupList.stream()
                // filter Group by day
                .filter(group -> group.getDay().equals(day))
                // print
                .forEach(group -> {
                    System.out.println(" Gorup Name: " + group.getName());
                    System.out.println(" Coach: " + group.getCoach().getFullName());
                    System.out.println(" Player Size: " + group.getPlayers().size());
                    System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
                });

        System.out.println("-------------------" + day + "-------------------");
    }

    /**
     * list Players By Group
     *
     * @param group
     */
    public void listPlayersByGroup(Group group) {
        System.out.println(group.getPlayers());
    }

    /**
     * list Players By Coach
     *
     * @param coach coaching staff
     */
    public void listPlayersByCoach(CoachingStaff coach) {
        System.out.println("-------------------" + coach.getFullName() + "-------------------");
        groupList.stream()
                // Filter the group by coach
                .filter(group -> group.getCoach().equals(coach))
                // map all player by group
                .map(Group::getPlayers)
                // flat groups to players
                .flatMap(Collection::parallelStream)
                // printed each player
                .forEach(System.out::println);
        System.out.println("-------------------" + coach.getFullName() + "-------------------");
    }

    /**
     * Show all players in Clup
     */
    public void listAllPlayers() {
        System.out.println(players);
    }

}
