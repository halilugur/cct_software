package com.ugurhalil.factories;

import com.ugurhalil.constants.DayType;
import com.ugurhalil.constants.GroupType;
import com.ugurhalil.entities.CoachingStaff;
import com.ugurhalil.entities.Group;
import com.ugurhalil.entities.Player;
import com.ugurhalil.utils.NumberUtil;
import static com.ugurhalil.utils.RandomUtil.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author halilugur
 */
public class GroupFactory {

    /**
     * generate a Group
     * 
     * @return Group
     */
    public Group generateGroup() {
        return new Group(randomGroupName(), randomGroupType(), randomDay());
    }

    /**
     * generate a Group by Group Type
     * 
     * @param groupType type
     * @return Group
     */
    public Group generateGroup(GroupType groupType) {
        return new Group(randomGroupName(), groupType, randomDay());
    }

    /**
     * generate Group List
     * 
     * @param numberOfGroup list of group size
     * @return list of group
     */
    public List<Group> generateGroupList(int numberOfGroup) {
        List<Group> listOfEntity = new ArrayList<>();
        for (int i = 0; i < numberOfGroup; i++) {
            // generate group and add the list
            listOfEntity.add(generateGroup());
        }
        return listOfEntity;
    }

    /**
     * set Players Tor Groups
     * 
     * @param groups groups
     * @param players list of player list
     */
    public void setPlayersToGroups(List<Group> groups, List<List<Player>> players) {
        for (int i = 0; i < groups.size(); i++) {
            // get group and set list of player
            groups.get(i).setPlayers(players.get(i));
        }
    }

    /**
     * set Coaches To Groups
     * 
     * @param groups groups
     * @param coachingStaffs list of coach
     */
    public void setCoachesToGroups(List<Group> groups, List<CoachingStaff> coachingStaffs) {
        // find min iteration between groups and coaching list
        int minIteration = Math.min(groups.size(), coachingStaffs.size());
        for (int i = 0; i < minIteration; i++) {
            // get a coach from coahc list
            CoachingStaff coach = coachingStaffs.get(i);
            // get a group and set the coach.
            groups.get(i).setCoach(coach);
        }

        for (int i = coachingStaffs.size() - 1; i < groups.size(); i++) {
            // get a random coach from the coach list without head couch.
            CoachingStaff coach = coachingStaffs.get(NumberUtil.random(1, coachingStaffs.size() - 1));
            // get group
            Group group = groups.get(i);
            // find coach working days
            Map<DayType, Long> dayCount = countDayForCoach(groups, coach);
            // If the coach works more than 2 days in the same day
            boolean isMoreThanTwo = dayCount.get(group.getDay()) > 1;
            // if true skip this coach and decrement the i (because we didn't set the coach)
            if (isMoreThanTwo) {
                i--;
                continue;
            }
            // if false set coach the group
            group.setCoach(coach);
        }
    }

    /**
     * count Day For Coach
     * 
     * @param groups groups
     * @param coach coach
     * @return map of days
     */
    private Map<DayType, Long> countDayForCoach(List<Group> groups, CoachingStaff coach) {
        // search coach by day in group
        return Arrays.asList(DayType.values()).stream()
                // to map
                .collect(Collectors.toMap(day -> day,
                        day -> groups.stream()
                                // filter null coach object in group
                                .filter(gr -> Objects.nonNull(gr.getCoach()))
                                // find coach that work on group
                                .filter(gr -> gr.getCoach().equals(coach))
                                // filter the same day on group
                                .filter(gr -> gr.getDay().equals(day))
                                // return count of that day.
                                .count()));
    }
}
