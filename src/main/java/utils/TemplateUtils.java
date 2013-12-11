package utils;

/**
 * Created with IntelliJ IDEA.
 * User: dervism
 * Date: 06.12.13
 * Time: 13:07
 */
public class TemplateUtils {


    // unicode font names
    public final static String UNICODE_TRUETYPE_SOURCE_SANS_PRO = "'Source Sans Pro'";
    public final static String UNICODE_TRUETYPE_DEJAVU_SANS = "'DejaVu Sans'";

    /**
     * Just a helper method for getting template code.
     * Can be used if there is any resouce problems.
     *
     * @return
     */
    public static String getPdfTemplate() {
        return "";
    }

    /**
     * This code will return template HTML code for inserting a new page.
     * The CSS class value is declared in the "permitpdf-template.html" file.
     *
     * @return
     */
    public final static String getPageBreak() {
        return "<div class=\"page-break\"></div>";
    }

    /**
     * Returns a line break.
     * @return
     */
    public static String getBreak() {
        return "<br />";
    }

    /**
     * Returns an empty string if the given object is null.
     *
     * @param o
     * @return
     */
    public static String safestring(String o) {
        return o == null ? "" : o;
    }

}
