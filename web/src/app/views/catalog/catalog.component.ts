import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/shared/interfaces/product.interface';
import { CatalogService } from 'src/app/shared/services/catalog.service';



@Component({
  selector: 'app-catalog',
  templateUrl: './catalog.component.html',
  styleUrls: ['./catalog.component.css']
})
export class CatalogComponent implements OnInit {

  products: Product[] | undefined;

  constructor(private catalogService: CatalogService) {

  }

  ngOnInit(): void {
    this.catalogService.getAllProducts()
    .subscribe(productsFound => {
      this.products = productsFound;
    });
  }

}
