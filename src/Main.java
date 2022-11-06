import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        JobPosition.Builder b = new JobPosition.Builder(LocalDate.now(), "nothing", true);
        JobPosition jb = b.yearsRequired(3000).Build();
        System.out.println(jb.toString());
    }
}