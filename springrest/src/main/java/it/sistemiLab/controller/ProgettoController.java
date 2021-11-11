package it.sistemiLab.controller;

import it.sistemiLab.dto.ProgettoDTO;
import it.sistemiLab.service.ProgettoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 
 * Questa classe estende AbstractController con tipo ProgettoDTO.
 * In aggiunta ai metodi di CRUD si implementa il metodo di login.
 * 
 * 
 * 
 * @param<ProgettoDTO>
 * 
 * @see AbstractController
 *
 */
@RestController
@RequestMapping("/progetto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProgettoController extends AbstractController<ProgettoDTO>{
	
	@Autowired
	private ProgettoService progettoService;


	//POST Angular a ProgettoDTO
	@PostMapping(value = "/read/{nomeprogetto}")
	public ProgettoDTO getProgettoByNome(@PathVariable("nomeprogetto") String nomeProgetto) {
		return progettoService.findByNomeProgetto(nomeProgetto);
	}
}