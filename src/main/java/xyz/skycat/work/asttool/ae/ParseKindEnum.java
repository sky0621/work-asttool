package xyz.skycat.work.asttool.ae;

/**
 * Created by SS on 2016/07/08.
 */
public enum ParseKindEnum {

    ACTION("action"),
    LOGIC("logic"),
    SERVICE("service");

    String packageName;

    ParseKindEnum(String packageName) {
        this.packageName = packageName;
    }

    public static boolean hasPackageName(String target) {
        if (target == null) return false;
        for (ParseKindEnum p : values()) {
            if (target.contains(p.packageName)) {
                return true;
            }
        }
        return false;
    }

    public String getPackageName() {
        return packageName;
    }

}
