import {Drink} from "./drink";
import {Book} from "./book";
import {Food} from "./Food";
import {RentType} from "./rentType";

export interface ProductType {
  id?: number,
  name?: string
  rentType?: RentType,
  price?:number,
  author?: string,
  creationDate?: string,
  category?: string,
  madeIn?: string,
  yesNoGas?: string,
  careSugarOrSalty?: string,
}
