package module_10.home_work;

public class MyNullPointerException extends NullPointerException {

    private String exceptionMessage;

    public MyNullPointerException(String message) {
        super(message);
        exceptionMessage = message;
    }

    public void showExceptionMessage() {
        System.out.println(exceptionMessage);
    }

}