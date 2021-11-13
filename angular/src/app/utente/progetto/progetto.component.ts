import { Component, OnInit } from '@angular/core';
import {ProgettoDTO} from "../../../dto/progettodto";
import {ProgettoService} from "../../../service/progetto.service";

@Component({
  selector: 'app-progetto',
  templateUrl: './progetto.component.html',
  styleUrls: ['./progetto.component.css']
})
export class ProgettoComponent implements OnInit {

  project: ProgettoDTO[];

  insertProgetto: ProgettoDTO = new ProgettoDTO();

  constructor(
      private service: ProgettoService,

  ) { }

  ngOnInit() {
    this.getProgetti()

  }

  getProgetti(){
    this.service.getAll().subscribe(project => this.project = project);//uso l'arrow function per popolare l'array
  }

  deleteProgetti(progetto: ProgettoDTO){
    this.service.delete(progetto.id).subscribe(() => this.getProgetti())
  }

  updateProgetti(progetto: ProgettoDTO){
    this.service.update(progetto).subscribe(()=> this.getProgetti())
  }

  insertProgetti(progetto: ProgettoDTO){
    this.service.insert(progetto).subscribe(()=> this.getProgetti())
  }

  clear(){
    this.insertProgetto = new ProgettoDTO()
  }
}
