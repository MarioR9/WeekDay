public class Main{
    public static void main(String [] args) {
        WeekDay presentday = new WeekDay("Sunday");
	//System will print next day
        System.out.println(presentday.nextDay());
       	//System will print day previous to Sunday
	System.out.println(presentday.previousDay());
        //System will print day previous to Sunday
	System.out.println(presentday.calculateDay(-1));
    }
}
