import { Component, OnInit } from '@angular/core';
import {DocumentoDTO} from "../../../dto/documentodto";
import {DocumentoService} from "../../../service/documento.service";

@Component({
  selector: 'app-documento',
  templateUrl: './documento.component.html',
  styleUrls: ['./documento.component.css']
})
export class DocumentoComponent implements OnInit {

  documento: DocumentoDTO[];
  insertDocumento: DocumentoDTO = new DocumentoDTO();

  constructor(
      private service: DocumentoService,
      private documentoService: DocumentoService,
  ) { }

  ngOnInit() {
    this.getProgetti()

  }

  getProgetti(){
    this.service.getAll().subscribe(documento => this.documento = documento);//uso l'arrow function per popolare l'array
  }

  deleteProgetti(documento: DocumentoDTO){
    this.service.delete(documento.id).subscribe(() => this.getProgetti())
  }

  updateProgetti(documento: DocumentoDTO){
    this.service.update(documento).subscribe(()=> this.getProgetti())
  }

  insertProgetti(documento: DocumentoDTO){
    this.service.insert(documento).subscribe(()=> this.getProgetti())
  }

  clear(){
    this.insertDocumento = new DocumentoDTO()
  }
}
