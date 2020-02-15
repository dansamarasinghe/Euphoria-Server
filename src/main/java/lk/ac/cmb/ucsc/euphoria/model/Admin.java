package lk.ac.cmb.ucsc.euphoria.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.mail.imap.IdleManager;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminID;

    @NotBlank
    private String adminUsername;
    private String email;
    private String FirstName;
    private String LastName;
    private String activeStatus; //active - active account inactive - deleted account

    @NotBlank
    @Transient
    private String adminPassword;

    public Admin() {
    }

    public Admin(
            Long ID,
            @JsonProperty("adminUsername") String Username,
            @JsonProperty("email") String Email,
            @JsonProperty("adminPassword") String Password,
            @JsonProperty("activeStatus") String Status
    ) {
        this.adminID = ID;
        this.adminUsername = Username;
        this.email = Email;
        this.adminPassword = Password;
        this.activeStatus = Status;
    }

    public long getAdminID() {
        return adminID;
    }

    public void setAdminID(Long adminID) {
        this.adminID = adminID;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() { return FirstName; }

    public void setFirstName(String firstName) { FirstName = firstName; }

    public String getLastName() { return LastName; }

    public void setLastName(String lastName) { LastName = lastName; }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
