package module_10.home_work;

public class ThrowThreeNewExceptions {

    public static void throwNewExceptions()
            throws MyNullPointerException, MyNumberFormatException, MyIndexOutOfBoundsException {
        try {
            throw new MyNullPointerException("1st");
        } catch (MyNullPointerException myNPE) {
            myNPE.printStackTrace();

            try {
                throw new MyNumberFormatException();
            } catch (MyNumberFormatException myNFE) {
                myNFE.printStackTrace();

                try {
                    throw new MyIndexOutOfBoundsException();
                } catch (MyIndexOutOfBoundsException myIOE) {
                    myIOE.printStackTrace();

                }
            }
        }
    }
}