import {Injectable} from '@angular/core';
import {Dictionary} from '../model/Dictionary';

@Injectable({
  providedIn: 'root'
})

export class DictionaryService {
  dictionaryList: Dictionary[] = [];

  constructor() {
    this.dictionaryList.push(
      {id: 1, word: 'Hello', means: 'Xin chào'},
      {id: 2, word: 'Goodbye', means: 'Tạm biệt'},
      {id: 3, word: 'Dog', means: 'Con Chó'},
      {id: 4, word: 'Cat', means: 'Con Mèo'},
      {id: 5, word: 'Pig', means: 'Con Heo'},
    );
  }

  getAll() {
    return this.dictionaryList;
  }


  findById(number: number) {
    return this.dictionaryList.filter(d => d.id === number);
  }


  searchWord(name: string) {
    return this.dictionaryList.filter(d => d.word.includes(name));
  }
}
