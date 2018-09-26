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
