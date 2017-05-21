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
    public Boolean checkPersonNameField(String personName)
    {
        char[] chars = personName.toCharArray();
        for (char c : chars){
        if (Character.isLetter(c)||Character.isSpace(c))
        {
            return true;
        }
    }
        return false;
}
    public Boolean checkPersonIDField(String personID)
    {
        char[] chars = personID.toCharArray();
        for (char c : chars){
        if (Character.isDigit(c))
        {
            return true;
        }
    }
        return false;
}
    public Boolean checkPersonAgeField(String personAge)
    {
        char[] chars = personAge.toCharArray();
        for (char c : chars){
        if (Character.isDigit(c))
        {
            return true;
        }
    }
        return false;
}
    public Boolean checkPersonGenderField(String personGender)
    {
        char[] chars = personGender.toCharArray();
        for (char c : chars){
        if (Character.isLetter(c))
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