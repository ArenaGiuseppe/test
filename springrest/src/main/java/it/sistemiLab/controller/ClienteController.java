package it.sistemiLab.controller;

import it.sistemiLab.dto.ClienteDTO;


import org.springframework.web.bind.annotation.*;


/**
 * 
 * Questa classe estende AbstractController con tipo ClienteDTO.
 * .
 * 
 * 
 * 
 * @param<ClienteDTO>
 * 
 * @see AbstractController
 *
 */
@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController extends AbstractController<ClienteDTO>{

}