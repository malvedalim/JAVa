public class person {
    private int age;
    private String fname;
    private String nationality;
    private String lname;
    private String gender;
    public void setName (String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
    public String getName(){
        return this.fname + " " + this.lname;
    }

}
