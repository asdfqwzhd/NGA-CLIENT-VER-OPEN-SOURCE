package gov.anzong.androidnga.base.util;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @author Justwen
 */
public class StringUtils {

    private static Map<String, Pattern> sPatternMap = new HashMap<>();

    public static String replaceAll(String content, String regex, String replacement) {
        Pattern pattern = sPatternMap.get(regex);
        if (pattern == null) {
            pattern = Pattern.compile(regex);
            sPatternMap.put(regex, pattern);
        }
        return pattern.matcher(content).replaceAll(replacement);
    }
}
