import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {concat, concatWith, Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

   //BaseUrl:string="https://localhost:44379/api/values?permit=notexist&quality=good&health=good&material=naturalwith&slope=large&landtype=stone&landlocation=C&elevator=exist&floor=1&park=exist&propertycontract=sorted&rebound=exist&pavedstreet=paved&streettype=residential&vitalcenter=proximity&services=lacke&streetnumber=three&id=0&pid=1"
  queryParam:string = "https://localhost:44379/api/values?";
  key:any={};
  //result : any =""; 
  constructor(private _HttpClient:HttpClient) { }

  signUp(data:any):Observable <any>{
   for(this.key in data){this.queryParam += `${this.key}=${data[this.key]}&`}
   //this.result = <any>this._HttpClient.get(this.queryParam);
   return this._HttpClient.get(this.queryParam)
  }

  
}
