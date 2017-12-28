public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        str1 = str1.trim();
        str2 = str2.trim();
        String str = str1.concat(str2);
        return str;
    }

    public Integer getIndexOrNull(String str, char character) {
        int result = str.indexOf(character);
        if (result == -1) {
            return null;
        }
        return result;
    }

    public Integer getIndexOrNull(String str1, String str2) {
        int result = str1.indexOf(str2);
        if (result == -1) {
            return null;
        }
        return result;
    }

    public String concatSubstring(String str1, int int1, int int2, String str2) {
        String result = str1.substring(int1, int2);
        result = result.concat(str2);
        return result;
    }
}

