import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Product } from '../interfaces/product.interface';

const connectionString: string ='http://localhost:8080/catalog/';

@Injectable({
  providedIn: 'root'
})
export class CatalogService {

  constructor(private httpClient: HttpClient) { 

  }

  /**
   * This method queries the DB for a full list of products
   * @returns an observable of list of products.
   */
  public getAllProducts(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(connectionString + "products");
  }
}
