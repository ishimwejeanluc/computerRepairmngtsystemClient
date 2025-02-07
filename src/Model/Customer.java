package Model;
import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;


public class Customer implements Serializable  {

   private static final long serialVersionUID = 4249666672022225589L;
    private Integer customerId;
    
    private String Names;

    private String PhoneNumber;

    
    private List<RepairJob> repairJobs = new ArrayList<>();

    public Customer() {
    }

    public Customer(Integer customerId) {
        this.customerId = customerId;
    }

    public Customer(Integer customerId, String Names, String PhoneNumber) {
        this.customerId = customerId;
        this.Names = Names;
        this.PhoneNumber = PhoneNumber;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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

    @Override
    public String toString() {
        return Names;
    }

    

    
    

}