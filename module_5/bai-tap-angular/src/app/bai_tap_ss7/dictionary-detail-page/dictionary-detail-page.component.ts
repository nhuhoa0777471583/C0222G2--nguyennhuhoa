import {Component, OnInit} from '@angular/core';
import {Dictionary} from '../model/Dictionary';
import {DictionaryService} from '../service/dictionary-service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-dictionary-detail-page',
  templateUrl: './dictionary-detail-page.component.html',
  styleUrls: ['./dictionary-detail-page.component.css']
})
export class DictionaryDetailPageComponent implements OnInit {
  // @ts-ignore
  dictionary: Dictionary = {};

  constructor(private dictionaryService: DictionaryService, private activatedRoute: ActivatedRoute, private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
        const id = paramMap.get('id');
        this.dictionary = this.dictionaryService.findById(parseInt(id))[0];

      }, error => {
      },
      () => {
      });
  }

  ngOnInit(): void {
  }

  showComponentDetail(){
    this.router.navigateByUrl('/list');
  }

}
