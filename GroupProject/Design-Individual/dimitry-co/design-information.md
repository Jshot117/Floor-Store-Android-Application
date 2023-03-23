1 - to implement this requirement theres a Store class along with the the getInStoreStock(storeid) method that returns a list of all products and stock by square feet in the store

2-  the Employee class is added along with attributes addProduct(), editsProduct() and deletedProduct() that take in necessary parameters id(from parent class User), storeid and item name

3 - there are classes for all categories (tile,stone,wood,laminate and vinyl) of floor that ineherit from the parent class floor

4 - the floor class is added to the diagram to realize this requirement along with all the attributes associated with the floors. see 7.


5 -  the store class will have operations searchByCategory(category): list and every class of categories will have operations searchByType: list. this way the first search option must be the category, then the type

6 - another search operation will be added to the store class: searchByName(name): list

7 - the floor class, a parent class to all floor categories will have the attributes color: string, size: double, brand: string, type: list, price: double. as well ass attribute name and getters and setters operations for all these attributes

8 - the materials they are made of are atttributes of the classes tile and stone along with get and set materials operations for these classes

9 - species attribute, along with get adn set species operations are added to the wood class

10 - laminate class will have isWaterResistant attribute that is a boolean. the vinyl class will include a isWaterProof attribute that is a boolean. if it's false then the vinyl floor will be water resistent

11- this is not considered in the class design digram
