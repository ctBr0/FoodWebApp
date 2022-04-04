#FoodWebApp
Prototype of Web App for Food Orders

## Installation
Use the package of application, and 
IDE Eclipse or vs code
set up Eclipse.
make sure you have download the jdk and jre
make sure all the files are in pakage named application
Click "Run configuration"
Click "Arguments"
### Environment (need JavaFX)
VM arguments:
Windows:
--module-path "C:\Users\Document\JavaFX\javafx-sdk-18\lib" --add-modules  javafx.controls,javafx.fxml
Mac:<br/>
--module-path <C:\Users\12733\JavaFX\javafx-sdk-18\lib> --add-modules  javafx.controls,javafx.fxml<br/>
"C:\Users\Document\JavaFX\javafx-sdk-18\lib" is your loation of you jre lib 

## Technologies
Java
JavaFX
SceneBuilder
## Contributors
::Ailun Pei::
::Chun Ting Ho::
::Siyi Hu::
::Yi Zhang::

## Feature

	* Menu items 
		*  A picture showing what it looks like
		* A list of ingredients used in the food
		* A price
		* An expected time to prepare the food (does not need to be shown to the customer)
	* Three types of users
		* A guest customer
			* Someone who orders something but doesn’t create an account to save their personal information.
			* These users are not able to use coupons when paying for their order.
			* Can view the menu
			* Can search the menu
			* Can select food they want to order
			* Can remove items from their order
			* Can view the total price of all the food they ordered
				* Do not need to worry about tax. The total price is just the summation of all the selected food items.
			* Can enter payment and contact information when ready to purchase the selected items.
			* Can see how many people/orders are in line ahead of them
				* A list of orders can be pre-populated into the application, by either hard-coding it, or using some storage system (.txt, .csv, .xml, etc)
			* Can see the expected time their order will be completed
		* A frequent customer
			* Can do the same things as a guest customer.
			* Can create an account to save their contact and payment information.
			* After account is created, can log into the application
			* Can view coupons they might have
			* These users can use coupons when paying for their order.
		* An administrator
			* Someone who works for the restaurant.
			* Can log into the application
				* Only need one administrative account setup
			* Can add/edit menu items.
			* Give coupons to frequent customers.
* How do we calculate the expected time for when an order will be completed?
	* This is a summation of the expected cook time of all the selected food items in all orders.
		* For example, customer A ordered two food items. The first item takes 5 minutes to make. The second item takes 3 minutes to make. This means customer A’s order will take 8 minutes to prepare.
This means, customer A’s order will be completed in ( 15 + 1 + 27 + 8 ) = 51 minutes.
* How do we build the application using the class diagram?
	* Building UML Sequence diagrams might help if you are unsure how all the objects are supposed to communicate with each other.
	* It can help everyone see what input needs to be read from the GUI, which function/objects should the input be passed to, and what does each function/object return.




