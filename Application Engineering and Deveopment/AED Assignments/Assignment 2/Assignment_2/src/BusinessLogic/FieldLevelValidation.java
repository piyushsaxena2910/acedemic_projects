/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

/**
 *
 * @author Piyush
 */
public class FieldLevelValidation {
    public Boolean checkPatientNameField(String patientName)
    {
        char[] chars = patientName.toCharArray();
        for (char c : chars){
        if (Character.isLetter(c)||Character.isSpace(c))
        {
            return true;
        }
    }
        return false;
}
    public Boolean checkPatientIDField(String patientID)
    {
        char[] chars = patientID.toCharArray();
        for (char c : chars){
        if (Character.isDigit(c))
        {
            return true;
        }
    }
        return false;
}
    public Boolean checkPatientAgeField(String patientAge)
    {
        char[] chars = patientAge.toCharArray();
        for (char c : chars){
        if (Character.isDigit(c))
        {
            return true;
        }
    }
        return false;
}
    public Boolean checkDoctorNameField(String doctorName)
    {
        char[] chars = doctorName.toCharArray();
        for (char c : chars){
        if (Character.isLetter(c)||Character.isSpace(c))
        {
            return true;
        }
    }
        return false;
}
    public Boolean checkPreferredPharmacyField(String preferredPharmacy)
    {
        char[] chars = preferredPharmacy.toCharArray();
        for (char c : chars){
        if (Character.isLetter(c)||Character.isSpace(c))
        {
            return true;
        }
    }
        return false;
}
    public Boolean checkRespiratoryRate(String respiratoryRate)
    {
        char[] chars = respiratoryRate.toCharArray();
        for (char c : chars){
        if (Character.isDigit(c))
        {
            return true;
        }
    }
        return false;
    }
    public Boolean checkHeartRate(String heartRate)
    {
        char[] chars = heartRate.toCharArray();
        for (char c : chars){
        if (Character.isDigit(c))
        {
            return true;
        }
    }
        return false;
    }
    public Boolean checkBloodPressure(String bloodPressure)
    {
        char[] chars = bloodPressure.toCharArray();
        for (char c : chars){
        if (Character.isDigit(c))
        {
            return true;
        }
    }
        return false;
    }
    public Boolean checkWeightInPounds(String weightInPounds)
    {
        int length = weightInPounds.length();
        if(weightInPounds.contains("."))
        {
        String[] parts = weightInPounds.split("\\.");
        String part1 = parts[0];
        String part2 = parts[1];
        char[] chars1 = part1.toCharArray();
        char[] chars2 = part2.toCharArray();
        int isValid = 1;
        for (char c1 : chars1){
        if (Character.isDigit(c1))
        {
            isValid++;
        }
        }
        for (char c2 : chars2){
        if(Character.isDigit(c2))
        {
            isValid++;
        }
        }
    if(isValid==length)
        return true;
    else
        return false;
    }
    else
            {
                char[] chars = weightInPounds.toCharArray();
        for (char c : chars){
        if (Character.isDigit(c))
        {
            return true;
        }
    }
        return false;
            }    
    }
}