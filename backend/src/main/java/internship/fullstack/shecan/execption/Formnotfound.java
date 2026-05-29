package internship.fullstack.shecan.execption;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class Formnotfound extends RuntimeException {
    public Formnotfound(String message) {
        super(message);
    }
}
