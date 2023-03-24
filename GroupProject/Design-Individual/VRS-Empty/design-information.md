There's a Store class along with the the SearchProduct method that returns a product information and stock by square feet in the store

The Employee class is set with attributes EditProduct(), AddProduct() and DeletedProduct() which take product parameters

There are classes for all categories of floor that inherit from the parent class Product

The user info, store info, and product info are added to the diagram to realize this requirement along with all the info are saved in the database.

The product class will have an operation to check floor's category first. Then every category will have operations to search for different types. 

A search operation is added to the user class which takes the name or id of the product, in return for the product.

The product class, a parent class to all floor categories will have the attributes color, size, brand, price and its amount in feet.

The materials they are made of are attributes of the classes wood, tile, and stone along with MaterialID to identify their material.

There are only 3 types for Laminate and Vinyl. So I used a number to represent the type where I used TypeId to return the number representing the type of the floor.
