# Electricity Billing

A Java-based billing system that asks for each customer's name, house number, and units of electricity used. 
Based on  unit slabs (e.g. 10 units = Rs. 100, 20 units = Rs. 250, etc.), the program calculates the total bill for each customer. After processing 3–5 houses, it prints the bill for each total amount and customer name with the house number and identifies the highest paying customer along with their house number.

| Units    |      Cost      |
|:---------|:--------------:|
| 1 to 10  |    Rs. 100     |
| 10 to 20 |    Rs. 250     |
| above 20 | Rs. 2 per unit |


## Features
- model.Customer ko detail record {name, house number, kati electricity used}
- Should be able to provide the units consumed
- Calculation as per the unit slabs
- Bill calculation for every customer
- Preview a terminal bill
- Highest paying customer with house number with the amount paid
