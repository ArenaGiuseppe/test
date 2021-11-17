import { Component, OnInit } from '@angular/core';
import {DocumentoDTO} from '../../../dto/documentodto';
import {DocumentoService} from '../../../service/documento.service';
import {ProgettoDTO} from '../../../dto/progettodto';

@Component({
  selector: 'app-documento',
  templateUrl: './documento.component.html',
  styleUrls: ['./documento.component.css']
})
export class DocumentoComponent implements OnInit {

  documento: DocumentoDTO[];
  progetto: any;
  progettoDTO: ProgettoDTO[];
  insertDocumento: DocumentoDTO = new DocumentoDTO();

  constructor(
      private service: DocumentoService,

  ) { }

  ngOnInit() {
    this.getDocumenti();
    this.progetto = JSON.stringify(this.progettoDTO);

  }

  getDocumenti() {
    this.service.getAll().subscribe(documento => this.documento = documento); // uso l'arrow function per popolare l'array
  }

  deleteDocumenti(documento: DocumentoDTO) {
    this.service.delete(documento.id).subscribe(() => this.getDocumenti());
  }

  updateDocumenti(documento: DocumentoDTO) {
    this.service.update(documento).subscribe(() => this.getDocumenti());
  }

  insertDocumenti(documento: DocumentoDTO) {
    this.service.insert(documento).subscribe(() => this.getDocumenti());
  }

  clear() {
    this.insertDocumento = new DocumentoDTO();
  }
}
