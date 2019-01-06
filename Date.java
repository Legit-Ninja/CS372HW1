public class Date {

        private int[] date = {1,1,0};  //month,day,year
        const int[] monthDays = { 31, 28, 31, 30, 31, 30, 31 ,31, 30, 31, 30, 31}
        public static void setDate (int day_, int month_, int year_)    //sets current date
        {
            date[0] = month_;
            date[1] = day_;
            date[2] = year_;
            }
        }
        public static String getDate ()     //return the date in string form
        {
            return (date[0] + "/" + date[1] + "/" + date[2]);
        }
        public static int getNumOfDays (int m) {        //gets number of days in a certain month
            int days = 31;
            if (m == 2){ days = 28; }
            else if (m == 4 || 6 || 9 || 11) { days = 30; }
            return days;
        }
        public static int getDay() {return date[1]; }
        public static int getMonth() (return date[0]; )
        public static int getYear() (return date[2]; )
        public static int getDifference(Date otherDate)     //is supposed to be able to return the difference in days between two dates
        {
                //PT -- this could be done more efficiently. The totalDays code probably should be a function
            int totalDays = 365* this.getYear();      //adds up number of days since 1/1/0000
            for (int i = 0; i < this.getMonth(), i++)      //adds to current month
                totalDays+=monthDays[i]
            totalDays += this.getDay();      //adds to current day



            int totalDays2 = 365 * otherDate.getYear();     //adds up number of days since 1/1/000-
        for (int i = 0; i < otherDate.getMonth(), i++)      //adds to current month
            totalDays+=monthDays[i]
        totalDays += otherDate.getDay();

        return (totalDays - totalDays2);
        }

        public static Date newDate(int day_, int month_, int year_)
        {
                //PT -- What if these values aren't legal?  -3
            Date newerDate = new Date(day_, month_, year_);
            return newerDate;
        }

}
