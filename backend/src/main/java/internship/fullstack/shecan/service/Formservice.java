package internship.fullstack.shecan.service;

import internship.fullstack.shecan.dto.Formdto;

import java.util.List;

public interface Formservice {

    Formdto createFrom(Formdto formdto);

    Formdto getFormById(Long formdId);

    List<Formdto> getAllForm();
}
