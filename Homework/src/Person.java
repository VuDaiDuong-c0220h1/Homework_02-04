public class Person {
    public String fullname;
    public boolean isMale = false;
    public int dayOfBirth;
    public String address;

    public Person() {
    }

    public Person(String fullname, boolean isMale, int dayOfBirth, String address) {
        this.fullname = fullname;
        this.isMale = isMale;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String gender(){
        if(isMale){
            return "Male";
        } else {
            return "Female";
        }
    }

    public void display() {
        System.out.println(this.fullname + "/" + this.gender()
                + "/" + this.dayOfBirth + "/" + this.address);
    }
}
