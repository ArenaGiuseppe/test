import {UserDTO} from "./userdto";
import {DocumentoDTO} from "./documentodto";


export class ProgettoDTO{

    id: number;
    nomeProgetto: string;
    user: UserDTO;
    documento: DocumentoDTO;


}