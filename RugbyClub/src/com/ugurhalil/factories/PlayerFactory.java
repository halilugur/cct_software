package com.ugurhalil.factories;

import com.ugurhalil.entities.Player;
import com.ugurhalil.utils.NumberUtil;
import static com.ugurhalil.utils.RandomUtil.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Create dynamically a player by this class
 *
 * @author halilugur
 */
public class PlayerFactory {

    /**
     * Create a player
     * 
     * @return player
     */
    private Player generatePlayer() {
        return new Player(randomName(), randomSurname(), randomAge(), randomBoolean());
    }

    /**
     * Create a list of player
     * 
     * @param numberOfPlayer size of list
     * @return list of player
     */
    private List<Player> generatePlayerList(int numberOfPlayer) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayer; i++) {
            // generate player and add the players list.
            players.add(generatePlayer());
        }
        return players;
    }

    /**
     * Create list of list player by group size
     * 
     * @param maxNumberOfPlayer max number of player list 
     * @param numberOfGroup players by number of groups
     * @return 
     */
    public List<List<Player>> generatePlayersByGroupSize(int maxNumberOfPlayer, int numberOfGroup) {
        List<List<Player>> playerList = new ArrayList<>();
        for (int i = 0; i < numberOfGroup; i++) {
            // generate player list by random range and add to list of player list
            playerList.add(generatePlayerList(NumberUtil.random(maxNumberOfPlayer / 2, maxNumberOfPlayer)));
        }
        return playerList;
    }
}
