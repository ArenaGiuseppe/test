import { Injectable } from '@angular/core';
import {AbstractService} from './abstractservice';
import {DocumentoDTO} from '../dto/documentodto';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DocumentoService extends  AbstractService<DocumentoDTO> {

  constructor(http: HttpClient) {
    super(http);
    this.type = 'documento';
  }
  leggiDocumento(documentoDTO: DocumentoDTO): Observable<DocumentoDTO> {
    return this.http.post<any>('http://localhost:8080/' + this.type + 'read/{nomedocumento}', documentoDTO);
  }
}
