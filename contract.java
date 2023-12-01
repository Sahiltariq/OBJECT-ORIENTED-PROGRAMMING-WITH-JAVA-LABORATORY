package jit.cse.oops.lab;

public class contract extends Staff {
    private String period;

    public contract(String staffId, String name, long phNum, long salary,String period) {
        super(staffId, name, phNum, salary);
        this.period=period;
    }

    @Override
    public String toString() {
        return "contract{" +
                "period='" + period + '\'' +
                ", staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", phNum=" + phNum +
                ", salary=" + salary +
                '}';
    }
}
