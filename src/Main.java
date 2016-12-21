/**
 * Created by Me Mkvia on 22.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] arraySample = {0,1,2,3,4,5,6,7,8};

        ArraysUtils.findEvenElements(arraySample);
        ArraysUtils.reverse(arraySample);

        User[] usersArray = new User[10];
        usersArray[0] = new User(111111111, "John", "Snow",4500, 10000);
        usersArray[1] = new User(222222222, "Peter", "Rein", 2920, 5000);
        usersArray[3] = new User(333333333, "David", "Wind",3560,5000);
        usersArray[4] = new User(444444444, "Samuel", "Sun", 2500,5200);
        usersArray[5] = new User(222222222, "Paul", "Hot", 2920, 5000);
        usersArray[6] = new User(555555555, "Joachim", "Cold", 2800, 60000);
        usersArray[7] = new User(666666666, "Preston","Eggplant", 2100,85000);
        usersArray[9] = new User(222222222, "William", "Watermelon", 2920, 5000);

        UserUtils.uniqueUsers(usersArray);
        UserUtils.usersWithContitionalBalance(usersArray, 5000);
        UserUtils.getUsersId(usersArray);
        UserUtils.paySalaryToUsers(usersArray);
        UserUtils.deleteEmptyUsers(usersArray);
    }
}
