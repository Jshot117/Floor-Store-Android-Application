# Use Case Model

**Author**: Dimitry Gallego

## 1 Use Case Diagram
![](../Resources/useCase-diagram.png)


## 2 Use Case Descriptions

### 1. Add Floor Product:
- Requirements: Allow Employee user to add a floor to the store inventory
- Pre-conditions: The User is authenticated as an employee and the floor doesn't exist in the store database.
- Post-conditions: A new floor is added and stored in the stores database
- Scenarios:
    - Normal:
           When the employee wants to add a new floor item in a store, the user will click on the add floor option and specify the store. This will open up another page. the employee will fill out all the required specifications of the new floor item.if the queantity of an item is not specified a default value will be set when the employee select "add floor"
    - Exception:
        when the employee tries to add a new floor item to the store and the system detects that the floor item already exists, the system will prompt the user with a message indicating that the floor item already excists. the system will ask the user if they instead want to modify the existing floor item.
    - Exception:
        The user is clicking "add floor" but hasnt filled all required fields for the floor item.


### 2. Modify Floor Product
- Requirements: Allows an employee to modify existing floor products in the stores inventory
- Pre-conditions: The user is authenticated as an employee and the floor item exists in the stores database.
- Post-conditions: The floor item information is modified
- Scenarios:
    - Normal:
        the employee can browse the store for the floor item and type in the floor item in the search field. once the floor is found, employee user will click on "modify floor" button on the floor page. The system will display an interface that allows user to edit the floor attributes.the user can then submit change to save them to the store database. after modification of the product, the user should see a confirmation message saying it was a success
    - Exceptional: 
    user searches for floor item in a store and it doesn't exist in the store database. A message will display asking the user if they want to add this floor item to the store


### 3. Delete Product:
- Requirements: Allows an employee to remove an existing product from the store inventory.
- Pre-conditions: User is an employee with appropriate permissions to perform the delete action of a floor item. Floor item must exist in the store inventory.
- Post-conditions: The system removes the floor product from the database and the product is no longer displayed on the stores page or search results.
    - Normal: 
    the user can browse or search for the floor item by its name in the store. once the user is on the floor page, the user selects the "delete" option. the system prompts the user to confirm the deletion.


### 4. Search for Floor item in store:
- Requirements: Allows users to look up a specific floor product either by name or by selecting a category and type.
- Pre-conditions: This search bar functionality is accessible from the stores homepage.
- Post-conditions: The system queries the store's data base for the matching floor product and returns a list of the floors attributes on the store data base.
- Scenarios:
    - Normal: Search bar, or drop-down menu
    When a user wants to search for a floor item in a store, they first select a store that will bring them to the home page of that store. the user then either type the name of the floor they are looking for in the search bar or select a category and type of floor(s) they are interested in from the drop-down menu. Once the user initiates the search, the system queries the store's database for the matching flors(s). if the user's search query matches one or more floors in the stores inventory, the system displays all attributes and informations about the floor(s) that match the search criteria. this may include floor, descriptions, prices, store quantity and images.

    - Exceptional:
    The user's search query does not match any floor(s) in the store inventory, the system will display a message indicating that no floors were found


### 5. Browse store:
- Requirements: Allows a user to browse the floor inventory of the selected store
- Pre-conditions: The User must select a store from the apps home page
- Post-condition: The system displays all information of the floor, including its description, price, quantity, images and any other relevant details.
- Scenarios:
    - Normal:
    User selects a store, taking them to the store homepage. the homepage displays all the floor(s) available for purchase in the store. The user can scroll through the list of products to find the ones they are interested in. the system will also provide filters to narrow down the list of floors by category, type and price.