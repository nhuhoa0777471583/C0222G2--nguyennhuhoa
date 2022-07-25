export class Customer {
  id: number;
  name: string;
  gender: number;
  birdthday: string;
  idCard: number;
  phone: string;
  email: string;
  address: string;


  constructor(id: number, name: string, gender: number, birdthday: string, idCard: number, phone: string, email: string, address: string) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.birdthday = birdthday;
    this.idCard = idCard;
    this.phone = phone;
    this.email = email;
    this.address = address;
  }
}
