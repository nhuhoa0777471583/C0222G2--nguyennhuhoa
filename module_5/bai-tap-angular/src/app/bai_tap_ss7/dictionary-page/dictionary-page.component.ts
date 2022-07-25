import {Component, OnInit} from '@angular/core';
import {DictionaryService} from '../service/dictionary-service';
import {Dictionary} from '../model/Dictionary';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.css']
})
export class DictionaryPageComponent implements OnInit {
  dictionarys: Dictionary[] = [];



  constructor(private dictionaryService: DictionaryService) {
  }

  ngOnInit(): void {
    this.dictionarys = this.dictionaryService.getAll();
  }

  search(nameSearch: NgForm) {
    this.dictionarys = this.dictionaryService.searchWord(nameSearch.value.nameSearchVal);
  }


}
