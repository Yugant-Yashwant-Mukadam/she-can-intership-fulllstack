package internship.fullstack.shecan.service.impl;


import internship.fullstack.shecan.dto.Formdto;
import internship.fullstack.shecan.entity.Form;
import internship.fullstack.shecan.execption.Formnotfound;
import internship.fullstack.shecan.mapper.formmapper;
import internship.fullstack.shecan.repository.formrepo;
import internship.fullstack.shecan.service.Formservice;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class Formimpl implements Formservice {

private formrepo fromrepository;

    @Override
    public Formdto createFrom(Formdto formdto) {
        Form form = formmapper.maptoform(formdto);
        Form savedform = fromrepository.save(form);

        return formmapper.maptoformdto(savedform) ;
    }

    @Override
    public Formdto getFormById(Long formdId) {
        Form service = fromrepository.findById(formdId)
                .orElseThrow(()->
                        new Formnotfound("form with such email doesnot exit"+formdId));
        return formmapper.maptoformdto(service);
    }

    @Override
    public List<Formdto> getAllForm() {
        List<Form> form =fromrepository.findAll();
        return form.stream().map((f)-> formmapper.maptoformdto(f))
                .collect(Collectors.toUnmodifiableList());
    }
}
