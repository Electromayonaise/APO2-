package exception;

public class IdException extends Exception {
    
    public IdException(){
        super("Id format is invalid");
    }
    
    public IdException(String message){
        super(message);
    }
    
}
