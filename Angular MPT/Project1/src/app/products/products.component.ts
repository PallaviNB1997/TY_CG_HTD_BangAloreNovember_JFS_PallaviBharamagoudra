import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ProductsService } from '../products.service';
@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  message: string;
  productsService: any;

  constructor(private productService: ProductsService) { }

  ngOnInit() {
  }
  products(form: NgForm) {
    this.productsService.postData(form.value).subscribe(data => {
      console.log(data);
      this.message = data.message;
      setTimeout(() => {
        this.message = null;
      }, 2000);
    }, err => {
      console.log(err);
    });

  }

}
