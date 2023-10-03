Feature: search and place the order for products
@OfferPage
Scenario Outline:Search Experience for product search in both home and offers page

Given User is on Greencart Landing page
When User  searched  with Short name <Items> and extracted actual name of product
Then User searched for <Items> shortname in offers page
And validate product name in offers page matches with landing page

Examples:
| Items|
| Tom  |
| Beet |  