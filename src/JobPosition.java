import java.time.LocalDate;

public class JobPosition {
    private LocalDate publishedDate;
    private String title;
    private String description;
    private String location;
    private int salaryCap;
    private boolean isRemote;
    private int yearsRequired;

    public static class Builder {
        private LocalDate publishedDate;
        private String title;
        private String description = "";
        private String location = "Tel Aviv";
        private int salaryCap = Integer.MAX_VALUE;
        private boolean isRemote;
        private int yearsRequired = 0;

        public Builder(LocalDate publishedDate, String title, boolean isRemote) {
            this.publishedDate = publishedDate;
            this.title = title;
            this.isRemote = isRemote;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder salaryCap(int salaryCap) {
            this.salaryCap = salaryCap;
            return this;
        }

        public Builder yearsRequired(int yearsRequired) {
            this.yearsRequired = yearsRequired;
            return this;
        }

        public JobPosition Build() {
            return new JobPosition(this);
        }
    }

    private JobPosition(Builder b) {
        this.description = b.description;
        this.isRemote = b.isRemote;
        this.title = b.title;
        this.salaryCap = b.salaryCap;
        this.yearsRequired = b.yearsRequired;
        this.location = b.location;
        this.publishedDate = b.publishedDate;
    }

    @Override
    public String toString() {
        return this.title + " " + this.description + " " + this.salaryCap + " " + this.location;
    }
}
