# Store Management

## User
Two types of users
* Store administrator
* Buyer

Fields:
- username
- password 
- e-mail

## Product
three types of products:
- Groceries
- Chemicals
- Clothes

Fields:
- product number (uniques identifies the product)
- product name
- product cost 
- product price

## Store
keeps products {quantity, Product}
- Activities of user administrator
    - Add product
    - Delete product
    - Modify it
- Activities of user buyer
   - List products
   - See Details of specific product
   - Buy it