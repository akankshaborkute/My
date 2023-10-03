
Feature: Buy more quantity of same item
@PlaceOrder 
 Scenario Outline: buying items and proceeding to checkout page

Given User is on Greencart Landing page
When User  searched  with Short name <Item> and extracted actual name of product
And Added "3" items of the selected product to cart
Then User proceeds to checkout and validate the <Item> in checkout page
And verify User has ability to enter promo code and place the order

 Examples: 
 | Item  | 
 | Tom   | 
 
