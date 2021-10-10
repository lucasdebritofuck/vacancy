package br.com.lucasfuck.vacancy.controller;

import br.com.lucasfuck.dto.HierarchyDTO;
import br.com.lucasfuck.port.input.ManageHierarchy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/hierarchy")
public class ManagerHierarchyController {

    private final ManageHierarchy manageHierarchy;

    public ManagerHierarchyController(ManageHierarchy manageHierarchy) {
        this.manageHierarchy = manageHierarchy;
    }

    @PostMapping
    public void setParent(@Valid @RequestBody HierarchyDTO hierarchyDTO) {
        manageHierarchy.setParent(hierarchyDTO.getChildIdentifier(),
                hierarchyDTO.getParentIdentifier());
    }
}
