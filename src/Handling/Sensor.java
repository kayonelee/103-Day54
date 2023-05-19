package Handling;

public interface Sensor {
    // IF THE SENSOR IS ON-WILL RETURN TRUE \ IF OFF RETURN FALSE
    boolean isOn();
    // SETS THE SENSOR ON
    void setOn();
    // SETS THE SENSOR OFF
    void setOff();
    // READING SENSOR VALUE-IF SENSOR IS ON-RETURNS VALUE. IF SENSOR IS NOT ON THROW ILLEGALSTATEEXCEPTION
    int read();
}

