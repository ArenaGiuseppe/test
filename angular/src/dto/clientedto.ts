import {UserDTO} from './userdto';
import {ProgettoDTO} from './progettodto';


export class ClienteDTO {

    id: number;
    nomeCliente: string;
    user: UserDTO;
    progetto: ProgettoDTO;

}
