import java.io.*;

public class Year3000 {
  public static void main(String[] args) throws IOException {
    DateInterface d = new MyDate();
    d.set(1, 25, 2026, 0);
    while (d.getYear() < 3000) {
      d.tomorrow();
      // un-comment the next line to help with debugging
      // System.out.println(d);
    }
    // at this point, d represents January 1, 3000
    System.out.println(d);
    d.set(1, 25, 2026, 0);
    while (d.getYear() > 1799) {
      d.yesterday();
      // un-comment the next line to help with debugging
      // System.out.println(d);
    }
    // at this point, d represents January 1, 1800
    d.tomorrow();
    System.out.println(d);
  }

}