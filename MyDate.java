
public class MyDate implements DateInterface {
  private int day;
  private int dow;
  private int month;
  private int year;

  /** @return the day of the month (1-31) */
  public int getDay() {
    return day;
  }

  /** @return the day of the week (0-6) */
  public int getDow() {
    return dow;
  }

  /** @return the month of the year (1-12) */
  public int getMonth() {
    return month;

  }

  /** @return the year (four digits) */
  public int getYear() {
    return year;
  }

  /**
   * sets the date
   * 
   * @param m   the month of the year (1-12)
   * @param d   the day of the mongth (1-31)
   * @param y   the year (four digits)
   * @param dow the day of the week (0-6)
   */
  public void set(int m, int d, int y, int dow) {
    month = m;
    day = d;
    year = y;
    dow = dow;
  }

  /** moves the date forward by exactly one day */
  public void tomorrow() {
    if (month == 12 && day == 31) {
      day = 0;
      month = month + 1;
      dow = dow + 5;
      if (dow > 6) {
        dow = 0 + (dow - 7);
      }
    }
    if (day == 30) {
      day = 0;
      month = month + 1;
      dow = dow + 2;
      if (dow > 6) {
        dow = 0 + (dow - 7);
      }
    }
    if (month > 12) {
      month = 1;
      year = year + 1;
    }

    if (day < 30) {
      day = day + 1;
      dow = dow + 1;
      if (dow > 6) {
        dow = 0 + (dow - 7);
      }

    }
  }

  /** @return the date as a String in the format "Monday March 18, 2002" */
  public String toString() {
    String[] daysName = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    String[] monthsName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December" };
    return daysName[dow] + " " + monthsName[month - 1] + " " + day + ", " + year;
  }

  /**
   * sets the date to today;
   * make this empty {} unless you do the extra credit.
   */
  public void today() {

  }

  /**
   * Moves the date backward by exactly one day;
   * make this empty {} unless you do the extra credit.
   */
  public void yesterday() {
    day = day - 1;
    if (day == 0) {
      month = month - 1;
      if (month < 1) {
        month = 12;
        year = year - 1;
      }
      day = 31;
    }
    dow = dow - 1;
    if (dow < 0) {
      dow = 6;
    }
  }
}
