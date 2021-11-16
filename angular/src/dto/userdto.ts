import {Usertype} from './usertype';
import {ClienteDTO} from './clientedto';


export class UserDTO {

   id: number;

   username: string;

   password: string;

   nome: string;

   cognome: string;

   usertype: Usertype;

   cliente: ClienteDTO[];

}

