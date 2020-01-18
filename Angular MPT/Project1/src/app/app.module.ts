import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CustomerComponent } from './customer/customer.component';
import { ProductsComponent } from './products/products.component';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { DataFromJsonComponent } from './data-from-json/data-from-json.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CustomerComponent,
    ProductsComponent,
    LoginComponent,
    HeaderComponent,
    DataFromJsonComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: '', component: HomeComponent},
      {path: 'customer', component: CustomerComponent},
      {path: 'products', component: ProductsComponent},
      {path: 'login', component: LoginComponent},
      {path: 'header', component: HeaderComponent},
      {path: 'data-from-json', component: DataFromJsonComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent],

})
export class AppModule { }
