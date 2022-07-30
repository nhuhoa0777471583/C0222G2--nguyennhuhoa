import {Product} from "./product";

export interface Consignment {
  id?: number;
  codeConsignment?: string
  product?: Product
  amount?: number
  dateAdd?: string
  dateOfManuFacture?: string
  dateEnd?: string
}
