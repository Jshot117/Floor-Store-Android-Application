
1. As a user of the system I want to be able to see each store's offering and the amount of
product in stock by square feet.

This was implemented by creating a user class that has methods to view the stores and its offers with an association to a store class with methods that searches the product as well as the amount of product in stock in the store.


2. The application must allow employees to add new products to the system. As well as
delete and edit them.

This was implemented by creating a class called Employees which allows to add products, delete products and edit products in the system.

3. The different categories of floors available are tile, stone, wood, laminate and vinyl

The floorCategorySet class contains an addFloor(FloorCategoryName) which allows employees to add floor categories to be used when creating new floor products in the FloorCategorySet class. 

4. The application must contain a database (DB) of floors.

Database of floors was implemented but not modeled as part of the UML guidelines. Once a new floor is created, the Employee class will update the database as the CRUD for floors.

5. Users must be able to search for products by picking from a hierarchical list, where the
first level is the floor category, and the second level is the floor type.

When the user invokes the addProduct method there is a class called FloorCategory that has a list of predined FloorCategory in which the employee can choose from, at which point theres another class named FloorType, that handles gthe creation of floor products as objects.

6. Users must also be able to specify an item by typing its name (search functionality).

In the User class there is a method called searchFloorProduct() in which the user can search for the floor product by directly querying the database across multiple floor products which is handled by the searchFloorProduct method. 

7. All floors regardless of their category have an associated color, size, brand, type and
price

This was implemented by creating a class named FloorProducts which has all the necessary attributes that describes the product.

8. Categories tile and stone have different materials they are made of, e.g. Tile - porcelain,
ceramic, resin; Stone - marble, pebble, slate

Implemented as an attribute in the FloorType class as FloorMaterial which will return a string of the material type.

9. Wood floors have both a type (solid, engineered, bamboo, etc) and species (oak,
hickory, maple, etc.)

Implemented as an attribute in the FloorType class as FloorType which return a string of the floor type for wood and a Species which returns a string of the kind of species.

10.  Laminate can be regular laminate or water resistant, whereas vinyl can be water
resistant or waterproof

Implemented as attributes in the FloorType class as data types boolean. IsWaterResistant() and IsRegularLaminate determines whether the laminate floor type will be water resitant or regular laminate as for vinyl floor type IsWaterResistant() and IsWaterProof() will determine if vinyl will be water resistant or waterproof.


11.  The User Interface (UI) must be intuitive and responsive.

The User Interface does not need to be included in the design as it will not affect the design. 