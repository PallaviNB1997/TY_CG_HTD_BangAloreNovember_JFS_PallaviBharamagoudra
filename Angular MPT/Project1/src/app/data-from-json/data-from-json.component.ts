import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-data-from-json',
  templateUrl: './data-from-json.component.html',
  styleUrls: ['./data-from-json.component.css']
})
export class DataFromJsonComponent implements OnInit {

  products: Products[];
  constructor(private http: HttpClient) {
     this.getDataFromJSON();
   }
   getDataFromJSON() {
    this.http.get<Product[]>('../../assets/products.json').subscribe(response => {
      console.log(response);
      this.products = response;
    });
  }
  ngOnInit() {
  }

}
interface products {
  // tslint:disable-next-line: ban-types
  name: String;
  // tslint:disable-next-line: ban-types
  image: String;
  price: number;
}

