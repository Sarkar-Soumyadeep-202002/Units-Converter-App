package au.edu.jcu.assignment1;

public class Calculations {

    public static double convert_kg_to_pounds(double kg){

       return kg * 2.205;

    }

    public static double convert_lbs_to_Kg(double pound){

        return pound * 0.454;

    }

    public static double convert_meters_to_feet(double meter){

        return meter * 3.281;

    }

    public static double convert_feet_to_meters(double feet){

        return feet * 0.305;

    }

    public static double convert_celcius_to_fahrenheit(double celcius){

        return celcius * 1.8 + 32;

    }

    public static double convert_celcius_to_kelvin(double celcius){

        return celcius + 273.15;

    }

    public static double convert_fahrenheit_to_celcius(double fahrenheit){

        return (fahrenheit - 32) * 0.5556;

    }

    public static double convert_minutes_to_seconds(double minutes){

        return minutes * 60;

    }

    public static double convert_years_to_months(double years){

        return years * 12;

    }

}
