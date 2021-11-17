import {UserDTO} from './userdto';
import {DocumentoDTO} from './documentodto';
import {ClienteDTO} from './clientedto';


export class ProgettoDTO {

    id: number;
    nomeProgetto: string;
    cliente: ClienteDTO;
    documento: DocumentoDTO;

 }
