package designs.splitwise.models;

import java.util.List;

public class ExpenseGroup {
    private int groupId;

    private String groupName;

    private List<GroupParticipant> groupParticipants;

    public ExpenseGroup(int groupId,String groupName) {

        this.groupId = groupId;
        this.groupName = groupName;

    }


    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<GroupParticipant> getGroupParticipants() {
        return groupParticipants;
    }

    public void setGroupParticipants(List<GroupParticipant> groupParticipants) {
        this.groupParticipants = groupParticipants;
    }




}
