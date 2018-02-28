package pl.codecouple;

class Printer {

    private StringBuilder stringBuilder;

    Printer(String text) {
        this.stringBuilder = new StringBuilder(text);
    }

    public String reverseString() {
        return stringBuilder.reverse().toString();
    }

}
