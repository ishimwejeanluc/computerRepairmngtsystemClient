package Model;
import Model.RepairJob;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




public class Employee implements Serializable {

    
    private Integer employeeId;
    
    private String Names;
     
    private String PhoneNumber;

   
    private List<RepairJob> repairJobs= new ArrayList<>();

    public Employee() {
    }

    public Employee(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(Integer employeeId, String Names, String PhoneNumber) {
        this.employeeId = employeeId;
        this.Names = Names;
        this.PhoneNumber = PhoneNumber;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String Names) {
        this.Names = Names;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public List<RepairJob> getRepairJobs() {
        return repairJobs;
    }

    public void setRepairJobs(List<RepairJob> repairJobs) {
        this.repairJobs = repairJobs;
    }

    
}