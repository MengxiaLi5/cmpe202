#The list of CRC cards:
class name: customer
responsibility:1.Sign-up on a wait list. 2. Provide customer information(name, telephone number and the number of people in their party). 3.Reply the confirmation message to "confirm" or "leave".
collaboration:message

class name: table
responsibility:1.check the number of available seats. 2.Deal with customers' confirmation(if customer replys "leave", then the free table is given to the next party.
collaboration: message

class name: message
responsibility:1.sent to the phone once registered on a wait list. 2.send to customer to "confirm" or "leave" the wait list.
collaboration:customer, table

#Observer Pattern
When customers reply the message to restaurant, the tables' status is going to be changed: if customers reply "confirm", the status of table is occupied; if customers reply "leave", the status of table is vacant.

#State Pattern
When a table is available, the restaurant is sending message to customer, and customer chooses confirm or leave. Then the status of table will change. Therefore, the RestaurantManager class should be context in the state pattern.
