package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




public class RepairJob implements Serializable {
private static final long serialVersionUID =  -1655643868305080309L;
    private Integer JobId;
    
    private String Description;

  
    private Customer customer;

   
    private List<Employee> employees = new ArrayList<>();

    public RepairJob() {
    }

    public RepairJob(Integer JobId) {
        this.JobId = JobId;
    }

    public RepairJob(Integer JobId, String Description, Customer customer) {
        this.JobId = JobId;
        this.Description = Description;
        this.customer = customer;
    }

    public Integer getJobId() {
        return JobId;
    }

    public void setJobId(Integer JobId) {
        this.JobId = JobId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return Description;
    }

  

    
}