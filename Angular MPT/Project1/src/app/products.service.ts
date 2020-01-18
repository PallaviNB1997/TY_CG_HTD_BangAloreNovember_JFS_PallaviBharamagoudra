import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  selectProductToUpdate: Product;
  api = `http://localhost:8080`;

  constructor(private http: HttpClient) { }

  postData(product): Observable<any> {
    return this.http.post<any>(
      `${this.api}/products`,
      product);
  }

  getData(): Observable<any> {
    return this.http.get<any>(`${this.api}/view-allproducts`);
  }
}

