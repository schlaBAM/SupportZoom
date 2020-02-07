## The Relational Model

What is a relation? How is it related to a table?
- A relation is a formal term for table

What are attributes?
- Column of data in the table (characteristic)

What is a tuple?
- A row of data / ordered set of attribute values

What is a type/domain?
- A data type for a value / attribute in the table

What is an instance?
- The actual contents of the table at a point in time

Are NULL values allowed in a database? Why are they dangerous?
- Yes, because you can't test on those values / return values you might expect to be returned

What’s an example of a query that doesn't return what you might expect, due to NULL values?
- `Select` * `from` Student `where` GPA is > 3.5 `or` GPA <= 3.5 (a query you'd expect to return all rows) where a table 
has null values will not return the tuples that have `null` as a value under GPA.

What is a key? Why are they necessary?
- An attribute of a relation where every value of that attribute is unique. They're necessary to identify / establish 
relationships between tables, and also to uniquely identify any record or row of data inside a table 


#### Querying relational databases

What steps will a user typically take to set up a database?
- Design schema / DDL, load initial data, execute queries and modifications on the database

How does a user interact with the database?
- Through some sort of app or website

What does it mean that a query language is high-level?
- The query says what we want from the database, but not how to get it - there's a level of abstraction that makes
 writing queries easier

What does it mean for a query to be ‘ad-hoc’?
- Posing a query that you didn't think of in advance

Can users ask the database questions directly or do they always have to go through an application?
- Users can query the database directly if they'd like

Are the queries that are easiest to pose the ones that are easiest to retrieve from the database?
- Generally no, posing a query and executing/retrieving are not correlated.

Do queries have closure, and what does that mean?
- Yes, it's when you get back the same type of object that you query

Are queries composable, and what does that mean?
- Yes - running another query on top of the previous query's result 