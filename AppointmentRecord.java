import java.util.Vector;

// Data class to represent an Appointment record
public class AppointmentRecord {
    private String appointmentNo;
    private String doctorName;
    private String patientName;
    private String roomNo;
    private String date;

    // Constructor
    public AppointmentRecord(String appointmentNo, String doctorName, String patientName, String roomNo, String date) {
        this.appointmentNo = appointmentNo;
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.roomNo = roomNo;
        this.date = date;
    }

    // Getters
    public String getAppointmentNo() {
        return appointmentNo;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public String getDate() {
        return date;
    }

    // Static method to convert a Vector to an AppointmentRecord
    public static AppointmentRecord fromVector(Vector<String> vector) {
        return new AppointmentRecord(
                vector.get(0),
                vector.get(1),
                vector.get(2),
                vector.get(3),
                vector.get(4)
        );
    }
}
