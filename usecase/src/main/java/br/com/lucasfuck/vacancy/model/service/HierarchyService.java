package br.com.lucasfuck.vacancy.model.service;

import br.com.lucasfuck.port.PersonOutputPort;
import br.com.lucasfuck.port.input.HierarchyInputPort;
import br.com.lucasfuck.vacancy.entity.Person;
import br.com.lucasfuck.vacancy.model.exception.IllegalParentOverrideException;
import org.springframework.stereotype.Service;

@Service
public class HierarchyService implements HierarchyInputPort {

    private final PersonOutputPort personOutputPort;

    public HierarchyService(PersonOutputPort personOutputPort) {
        this.personOutputPort = personOutputPort;
    }

    @Override
    public void setParent(String childIdentifier, String parentIdentifier) {
        Person child = personOutputPort.findByIdentifier(childIdentifier);

        if (child.getParent() != null)
            throw new IllegalParentOverrideException("Child already has a parent");

        Person parent = personOutputPort.findByIdentifier(parentIdentifier);

        child.setParent(parent);
        personOutputPort.save(child);
    }
}
