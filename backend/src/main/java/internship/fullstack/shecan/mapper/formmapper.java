package internship.fullstack.shecan.mapper;

import internship.fullstack.shecan.dto.Formdto;
import internship.fullstack.shecan.entity.Form;

public class formmapper {
    public static Formdto maptoformdto(Form form){
    return new Formdto(
            form.getName(),
            form.getEmail(),
            form.getMessage()
    );
    }

    public static Form maptoform (Formdto formdto){
        return new Form(

                formdto.getName(),
                formdto.getEmail(),
                formdto.getMessage()
        );
    }
}
