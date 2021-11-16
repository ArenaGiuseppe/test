import { Injectable } from '@angular/core';
import {AbstractService} from './abstractservice';
import {ProgettoDTO} from '../dto/progettodto';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProgettoService extends  AbstractService<ProgettoDTO> {

  constructor(http: HttpClient ) {
    super(http);
    this.type = 'progetto';
  }
  leggiProgetto(progettoDTO: ProgettoDTO): Observable<ProgettoDTO> {
    return this.http.post<any>('http://localhost:8080/' + this.type + 'read/{nomeprogetto}', progettoDTO);
  }

}
