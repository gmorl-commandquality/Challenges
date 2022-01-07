package Database;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validate {
    // validate name
    public static boolean validateName( String Name )
    {
        return Name.matches( "[A-Z][a-zA-Z]*" );
    } // end method validateName

    // validate surname
    public static boolean validateSurname( String Surname)
    {
        return Surname.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
    } // end method validaSurname

    // validate email
    static boolean validateUserEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);

    }

    // validate date of birth

    static boolean validateDateofBirth(String birth) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date birthdy = null;
        df.setLenient(false);
        try {
            birthdy = df.parse(birth);
            return true;
        } catch (Exception e) {
            return false;
        }

    }


}
