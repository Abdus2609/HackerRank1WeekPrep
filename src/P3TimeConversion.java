public class P3TimeConversion {
    
    public static String timeConversion(String s) {

        String[] sections = s.split(":");

        String hrs = sections[0];
        String mins = sections[1];
        String secs = sections[2].substring(0, 2);
        String timeOfDay = sections[2].substring(2, 4);

        if (timeOfDay.equals("AM") && hrs.equals("12")) {
            hrs = "00";
        } else if (timeOfDay.equals("PM") && !hrs.equals("12")) {
            int hours = Integer.valueOf(hrs);
            hours += 12;
            hrs = Integer.toString(hours);
        } 

        return hrs + ":" + mins + ":" + secs;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:01:00AM"));
    }
}
