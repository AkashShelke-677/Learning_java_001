package ex_024_Exception;

public class lab003_NullPointerException {
    public static void main(String[] args) {
        String name = null;
        name.trim();
        // Nul can not be trimmed
    }
}
