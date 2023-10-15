package designs.splitwise.models;

import java.util.HashMap;
import java.util.Map;

/**
 * This Will Hold the info of any User That Participated in a group
 */
public class GroupParticipant {

    private int groupId;

    private User user;

    private int totalExpense;

    private Map<Integer,Double> balanceMap;

    public GroupParticipant(int groupId, User user, HashMap<Integer,Double> balanceMap) {

        this.groupId = groupId;
        this.user = user;
        this.balanceMap = balanceMap;

    }

    public int getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense() {
        this.totalExpense = totalExpense;

    }


}
