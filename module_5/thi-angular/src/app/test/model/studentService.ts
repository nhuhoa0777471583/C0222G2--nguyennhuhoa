import {ClassRoom} from './classRoom';

export interface Student {
  id?: number;
  name?: string;
  dayOfBirth?: string;
  address?: string;
  age?: number;
  classRoom?: ClassRoom;
}
