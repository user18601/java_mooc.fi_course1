
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int yearsDifference = 0;
        if (comparedDate.earlier(this)) {
            yearsDifference = this.year - comparedDate.year;
            MyDate thisDate = new MyDate(this.day, this.month, comparedDate.year);
            if (thisDate.earlier(comparedDate)) {
                yearsDifference--;
            }
        } else {
            yearsDifference = -(this.year - comparedDate.year);
            MyDate thisDate = new MyDate(comparedDate.day, comparedDate.month, this.year);
            if (thisDate.earlier(this)) {
                yearsDifference--;
            }
        }
        return yearsDifference;

    }
}
