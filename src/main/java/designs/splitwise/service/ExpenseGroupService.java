package designs.splitwise.service;

import designs.splitwise.models.ExpenseGroup;
import designs.splitwise.models.GroupParticipant;
import designs.splitwise.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpenseGroupService {

    /**
     * Adds a User to a Group
     * @param expenseGroup
     * @param user
     */
    public void joinGroup(ExpenseGroup expenseGroup, User user) {

        GroupParticipant groupParticipant = new GroupParticipant(expenseGroup.getGroupId(), user,new HashMap<>());

        if(expenseGroup.getGroupParticipants()==null || expenseGroup.getGroupParticipants().size()==0) {
            List<GroupParticipant> groupParticipants = new ArrayList<>();
            groupParticipants.add(groupParticipant);
            expenseGroup.setGroupParticipants(groupParticipants);
        }
        else {
            expenseGroup.getGroupParticipants().add(groupParticipant);

        }

    }

    public void addExpense(ExpenseGroup expenseGroup, User payingUser,HashMap<Integer,Double> share) {

    }
}
