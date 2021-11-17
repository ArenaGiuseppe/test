import { Component, OnInit } from '@angular/core';

import {ClienteDTO} from '../../../dto/clientedto';
import {ClienteService} from '../../../service/cliente.service';
import {UserDTO} from '../../../dto/userdto';
import {ProgettoDTO} from '../../../dto/progettodto';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.css']
})
export class ClienteComponent implements OnInit {

  cliente: ClienteDTO[];
  user: UserDTO[];
  progetto: ProgettoDTO[];

  insertCliente: ClienteDTO = new ClienteDTO();

  constructor(
      private service: ClienteService,

  ) { }

  ngOnInit() {
    this.getClienti();

  }

  getClienti() {
    this.service.getAll().subscribe(cliente => this.cliente = cliente); // uso l'arrow function per popolare l'array
  }

  deleteClienti(cliente: ClienteDTO) {
    this.service.delete(cliente.id).subscribe(() => this.getClienti());
  }

  updateClienti(cliente: ClienteDTO) {
    this.service.update(cliente).subscribe(() => this.getClienti());
  }

  insertClienti(cliente: ClienteDTO) {
    this.service.insert(cliente).subscribe(() => this.getClienti());
  }

  clear() {
    this.insertCliente = new ClienteDTO();
  }
}
