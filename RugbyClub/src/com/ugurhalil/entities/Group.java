package com.ugurhalil.entities;

import com.ugurhalil.constants.DayType;
import com.ugurhalil.constants.GroupType;
import com.ugurhalil.utils.NumberUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author halilugur
 */
public class Group {

    private final String id;
    private final String name;
    private final GroupType groupType;
    private final DayType day;
    private CoachingStaff coach;
    private List<Player> players;

    /**
     * Group
     * 
     * @param name of Group
     * @param groupType of Group
     * @param day of Group
     */
    public Group(String name, GroupType groupType, DayType day) {
        this.id = NumberUtil.stringId();
        this.name = name;
        this.groupType = groupType;
        this.day = day;
        this.players = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GroupType getGroupType() {
        return groupType;
    }

    public DayType getDay() {
        return day;
    }

    public CoachingStaff getCoach() {
        return coach;
    }

    public void setCoach(CoachingStaff coach) {
        this.coach = coach;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "\n"
                + getClass().getSimpleName() + "{"
                + "\n" + "Id : " + getId()
                + "\n" + "Name : " + getName()
                + "\n" + "Group Type : " + getGroupType()
                + "\n" + "Day Type : " + getDay()
                + "\n" + "Coach : " + getCoach()
                + "\n" + "Players : " + getPlayers()
                + "}"
                + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Group) {
            return obj.equals(this);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, groupType);
    }
}
