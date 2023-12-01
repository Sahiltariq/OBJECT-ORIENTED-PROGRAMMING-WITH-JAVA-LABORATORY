public class Technical  extends Staff{
    private String skills;
    public Technical(String staffId, String name, long phNum, long salary,String skills) {
        super(staffId, name, phNum, salary);
    }

    public String toString() {
        return "Technical{" +
                "skills='" + skills + '\'' + ", staffId='" + staffId + '\'' + ", name='" + name + '\'' + ", phNum=" + phNum +
                ", salary=" + salary + '}';
    }

}
