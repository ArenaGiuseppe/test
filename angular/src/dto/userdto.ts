import {Usertype} from './usertype';
import {ClienteDTO} from './clientedto';


export class UserDTO {

   id: number;

   username: string;

   password: string;

   nome: string;

   cognome: string;
   
   cliente: ClienteDTO[];

   usertype: Usertype;



}

