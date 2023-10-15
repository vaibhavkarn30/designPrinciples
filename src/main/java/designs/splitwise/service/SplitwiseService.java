package designs.splitwise.service;

import designs.splitwise.models.ExpenseGroup;
import designs.splitwise.models.User;

public class SplitwiseService {

    public void useSplitWise() {

        ExpenseGroupService expenseGroupService = new ExpenseGroupService();

        User user1 = new User(1,"Vaibhav","9078814719","karnvaibhav30@gmail.com");
        User user2 = new User ( 2,"Ashmeet","9540919888","ashmeetkb13@gmail.com");
        User user3 = new User(3,"Rajat","9899692840","rajatgupta@gmail.com");

        ExpenseGroup expenseGroup = new ExpenseGroup(1,"RichLads");

        expenseGroupService.joinGroup(expenseGroup,user1);
        expenseGroupService.joinGroup(expenseGroup,user2);
        expenseGroupService.joinGroup(expenseGroup,user3);


    }
}
