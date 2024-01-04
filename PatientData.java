import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatientData {
    private String patientNo;
    private String patientName;
    private String phoneNo;
    private String address;

    public PatientData(String patientNo, String patientName, String phoneNo, String address) {
        this.patientNo = patientNo;
        this.patientName = patientName;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return address;
    }

    // Add any additional getters/setters as needed
}
