public class Teaching extends Staff {
    private String domain;
    private String publication;

    public Teaching(String staffId, String name, long phNum, long salary,String domain,String publication) {
        super(staffId, name, phNum, salary);
        this.domain=domain;
        this.publication=publication;
    }


    public String toString() {
        return "Teaching{" + "domain='" + domain + '\'' + ", publication='" + publication + '\'' + ", staffId='" + staffId + '\'' +
                ", name='" + name + '\'' + ", phNum=" + phNum + ", salary=" + salary + '}';
    }
}
