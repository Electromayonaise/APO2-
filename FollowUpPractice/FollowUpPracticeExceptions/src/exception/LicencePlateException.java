package exception;

public class LicencePlateException  extends Exception{
    
    public LicencePlateException(){
        super("License plate format is invalid");
    }
    
    public LicencePlateException(String message){
        super(message);
    }
    
}
