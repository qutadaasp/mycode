import { Component,OnInit } from '@angular/core';

import { AuthService } from '../auth.service';
import {FormControl,FormGroup,Validators} from '@angular/forms';
import { Data, Router } from '@angular/router';
import Swal from 'sweetalert2/dist/sweetalert2.js';
@Component({
  selector: 'app-questions',
  templateUrl: './questions.component.html',
  styleUrls: ['./questions.component.css']
})


export class QuestionsComponent implements OnInit {

  RegisterForm:FormGroup=new FormGroup({
    streetnumber:new FormControl(null),
    pavedstreet:new FormControl(null),
    vitalcenter:new FormControl(null),
    services:new FormControl(null),
    propertycontract:new FormControl(null),
    landtype:new FormControl(null),
    slope:new FormControl(null),
    materials:new FormControl(null),
    landlocation:new FormControl(null),
    health:new FormControl(null),
    quality:new FormControl(null),
    elevator:new FormControl(null),
    floor:new FormControl(null),
    permit:new FormControl(null),
    rebound:new FormControl(null),
    park:new FormControl(null),
    streettype:new FormControl(null),


  })

  
  errorMessage:string='';
  register(data:FormGroup){
  this._AuthService.signUp(data.value).subscribe({
    
    next:(data)=>this.result(`the price per meter is : `+<string> data +` JD`,"success",'✓')
   
//    next:(data)=>{
      //if (data.message=="success"){
       // this.errorMessage="";
  //      this._Router.navigate(['./result'])
    //  }
    //}
  })
}
result(title : any , icon : any,iconHtml : any){
      Swal.fire({
       title: <any> title,
       icon: <any> icon,
       iconHtml: iconHtml,
      confirmButtonText: 'حسناً',
      showCancelButton: false,
      showConfirmButton : true
    })
   }


  constructor(private _AuthService:AuthService,private _Router:Router ){};


  ngOnInit(): void {
     
  }
  
}