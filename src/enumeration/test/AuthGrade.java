package enumeration.test;

import java.util.ArrayList;
import java.util.List;

public enum AuthGrade {
    GUEST(1, "guest"),
    LOGIN(2, "user"),
    ADMIN(3, "admin");
    
    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public static List<String> getMenuList(AuthGrade authGrade) {
        List<String> menuList = new ArrayList<>();
        menuList.add("- Menu Page");

        if(authGrade == AuthGrade.LOGIN) {
            menuList.add("- Email management");
        } else if(authGrade == AuthGrade.ADMIN) {
            menuList.add("- Email Page");
            menuList.add("- Admin Page");
        }

        return menuList;
    }
}
