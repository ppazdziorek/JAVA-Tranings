package pl.codecouple;

import org.apache.commons.lang3.StringUtils;

class Printer {

    private StringBuilder stringBuilder;

    Printer(String text) {
        if(StringUtils.isEmpty(text)){
            throw new IllegalArgumentException();
        }
        this.stringBuilder = new StringBuilder(text);
    }

    public String reverseString() {
        return stringBuilder.reverse().toString();
    }

    public int getIndexOf(String p) {
        return stringBuilder.indexOf(p);
    }

    public String removeChar(String p) {
        int index = stringBuilder.indexOf(p);
        return stringBuilder.delete(index,index+1).toString();
    }

    public int getLastIndexOf(String p) {
        return stringBuilder.lastIndexOf(p);
    }
}
