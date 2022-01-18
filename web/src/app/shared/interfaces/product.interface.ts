import { ProductCategory } from "./productCategory.interface";

/**
 * This is a 1 to 1 mapping of the product class.
 */

export interface  Product {
    id: number;

    productName: string;
    productDescription: string;
    ProductCategory: ProductCategory;
}