# product-catalogue-service-master
LLD mocroservice module for structuring product details using springBoot

product-catalogue-service
Spring Boot Rest + Spring Data JPA + H2 in-memory database

Api Endpoints:-

Get All products: GET: http://localhost:8080/v1/product/all

Search by type: GET:- http://localhost:8080/v1/product/?productType=cosmetics

Add product: POST:- http://localhost:8080/v1/product

Add ProductToCart : Post:-http://localhost:8080/product/addToCart //



Sample post:
{
    "id": 1,
    "name": "OrangeColor",
    "description": "A product from Liquid Paint catalog",
    "supplierId": "1234",
    "productType": "House Paint Color",
    "quantityPerUnit": 5,
    "unitPrice": 100.0,
    "unitsInStock": 200,
    "discontinued": false
}

{
    "id": 2,
    "name": "RedColor",
    "description": "A product from Car Paint catalog",
    "supplierId": "5678",
    "productType": "Vehicle Paint Color",
    "quantityPerUnit": 5,
    "unitPrice": 100.0,
    "unitsInStock": 200,
    "discontinued": false
}


{
    "id": 3,
    "name": "BlackColor",
    "description": "A product from Car Paint catalog",
    "supplierId": "3456",
    "productType": "productType",
    "quantityPerUnit": 5,
    "unitPrice": 100.0,
    "unitsInStock": 200,
    "discontinued": false
}
