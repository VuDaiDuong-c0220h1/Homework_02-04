public class Student extends Person {
    public int id;
    public int scoreAverage;
    public String email;

    public Student(){}

    public Student(int id, int scoreAverage, String email) {
        this.id = id;
        this.scoreAverage = scoreAverage;
        this.email = email;
    }

    public Student(String fullname, boolean isMale, int dayOfBirth, String address, int id, int scoreAverage, String email) {
        super(fullname, isMale, dayOfBirth, address);
        this.id = id;
        this.scoreAverage = scoreAverage;
        this.email = email;
    }

    public boolean isScholarship() {
        if (scoreAverage > 8) {
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public int getScoreAverage() {
        return scoreAverage;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScoreAverage(int scoreAverage) {
        this.scoreAverage = scoreAverage;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void display() {
        super.display();
    }
}
