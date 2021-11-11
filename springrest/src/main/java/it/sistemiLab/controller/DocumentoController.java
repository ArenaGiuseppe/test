package it.sistemiLab.controller;

import it.sistemiLab.dto.DocumentoDTO;
import it.sistemiLab.service.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *
 * Questa classe estende AbstractController con tipo DocumentoDTO.
 * In aggiunta ai metodi di CRUD si implementa il metodo di login.
 *
 *
 *
 * @param<DocumentoDTO>
 *
 * @see AbstractController
 *
 */
@RestController
@RequestMapping("/documento")
@CrossOrigin(origins = "http://localhost:4200")
public class DocumentoController extends AbstractController<DocumentoDTO>{

    @Autowired
    private DocumentoService documentoService;


    //POST Angular a DocumentoDTO
    @PostMapping(value = "/read/{nomedocumento}")
    public DocumentoDTO getDocumentoByNome( @PathVariable("nomedocumento") String nomeDocumento) {
        return documentoService.findByNome(nomeDocumento);
    }
}