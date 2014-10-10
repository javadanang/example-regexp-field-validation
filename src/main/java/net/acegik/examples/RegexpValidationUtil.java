package net.acegik.examples;

/**
 *
 * @author pnhung177
 */
public class RegexpValidationUtil {

    public static final String EMPTY_STRING = "";

    //--------------------------------------------------------------------------

    public static final String UUID_PATTERN =
            "^[a-fA-F0-9]{8}-?[a-fA-F0-9]{4}-?[a-fA-F0-9]{4}-?[a-fA-F0-9]{4}-?[a-fA-F0-9]{12}$";

    public static boolean verifyUUID(String uuid) {
        if (uuid == null) return false;
        return uuid.matches(UUID_PATTERN);
    }
    
    //--------------------------------------------------------------------------

    private static final String USERNAME_PATTERN =
		"^[a-z0-9_-]{3,16}$";

    public static boolean verifyUsername(String username) {
        if (username == null) return false;
        return username.matches(USERNAME_PATTERN);
    }
    
    //--------------------------------------------------------------------------

    private static final String EMAIL_PATTERN =
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static boolean verifyEmail(String email) {
        if (email == null) return false;
        return email.matches(EMAIL_PATTERN);
    }

    //--------------------------------------------------------------------------

    private static final String PASSWORD_PATTERN =
		"^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

    public static boolean verifyPassword(String password) {
        if (password == null) return false;
        return password.matches(PASSWORD_PATTERN);
    }

    //--------------------------------------------------------------------------

    private static final String FULLNAME_PATTERN =
            "^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ" +
            "ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ" +
            "ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s]+$";

    public static boolean verifyFullname(String fullname) {
        if (fullname == null) return false;
        return fullname.matches(FULLNAME_PATTERN);
    }
}
