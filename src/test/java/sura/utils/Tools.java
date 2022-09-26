package sura.utils;

import sura.enumerators.Option;
import sura.enumerators.User;

public class Tools {

    public static User getUserType(String userType){
        try{
            switch (userType) {
                case "STANDARD_USER":
                    return User.STANDARD_USER;
                case "LOCKED_USER":
                    return User.LOCKED_USER;
                case "PROBLEM_USER":
                    return User.PROBLEM_USER;
                case "GLITCH_USER":
                    return User.GLITCH_USER;
                case "INEXISTENT":
                    return User.INEXISTENT;
                case "ONLY_WITH_USERNAME":
                    return User.ONLY_WITH_USERNAME;
                case "ONLY_WITH_PASSWORD":
                    return User.ONLY_WITH_PASSWORD;
                case "WITH_ALL_FIELDS_EMPTY":
                    return User.WITH_ALL_FIELDS_EMPTY;
                default:
                    throw new Exception ("Usuario no existe");
            }
        }catch(Exception e){
            throw new IllegalArgumentException("Usuario " + userType + "no tiene acceso al sistema");
        }
    }

    public static Option getDropDownValue(String option){
        try{
            switch (option) {
                case "FROM_A_TO_Z":
                    return Option.FROM_A_TO_Z;
                case "FROM_Z_TO_A":
                    return Option.FROM_Z_TO_A;
                case "FROM_LOW_TO_HIGH":
                    return Option.FROM_LOW_TO_HIGH;
                case "FROM_HIGH_TO_LOW":
                    return Option.FROM_HIGH_TO_LOW;
                default:
                    throw new Exception ("Opción no existe");
            }
        }catch(Exception e){
            throw new IllegalArgumentException("Opcion " + option + "no existe");
        }
    }
}

