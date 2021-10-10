package br.com.lucasfuck.vacancy.controller;

import br.com.lucasfuck.dto.HierarchyDTO;
import br.com.lucasfuck.port.input.HierarchyInputPort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/hierarchy")
public class ManageHierarchyController {

    private final HierarchyInputPort hierarchyInputPort;

    public ManageHierarchyController(HierarchyInputPort hierarchyInputPort) {
        this.hierarchyInputPort = hierarchyInputPort;
    }

    @PostMapping
    public void setParent(@Valid @RequestBody HierarchyDTO hierarchyDTO) {
        hierarchyInputPort.setParent(hierarchyDTO.getChildIdentifier(),
                hierarchyDTO.getParentIdentifier());
    }
}
