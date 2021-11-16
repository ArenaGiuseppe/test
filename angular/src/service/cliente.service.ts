import { Injectable } from '@angular/core';
import {AbstractService} from './abstractservice';
import {ClienteDTO} from '../dto/clientedto';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ClienteService extends  AbstractService<ClienteDTO> {

  constructor(http: HttpClient) {
    super(http);
    this.type = 'cliente';
  }
}
