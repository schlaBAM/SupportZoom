### Data Modelling Practice Q2

Consider the E-R schema for the Movies database in the figure given below. Assume that Movies is a populated database. 
Actor is used as a generic term and includes actresses. Given the constraints shown in the E-R schema, respond to the 
following statements with True, False, or Maybe. Assign a response of Maybe to statements that, while not explicitly 
shown to be True, cannot be proven False based on the schema as shown. Justify each answer.

Diagram:
![](https://screenshot.click/jw4xu-02-10_23-11-chef7.png)

There are no actors in this database that have been in no movies.
- True, the double line indicates total participation so all actors have been in a movie

There are some actors who have acted in more than ten movies.
- Maybe, there's no finite limit established for cardinality for that relationship.

Some actors have done a lead role in multiple movies.
- Maybe, they're able to based on cardinality / participation.

A movie can have only a maximum of two lead actors.
- True, based on the `2` cardinality.

Every director has been an actor in some movie.
- False, the single line from `Director` to `Directs` indicates partial participation.

No producer has ever been an actor.
- Maybe, but it is possible based on the diagram.

There are movies with more than a dozen actors.
- Maybe, there's no finite limit for number of actors but there might not be any movie over that limit

Most movies have one director and one producer.
- Maybe - while it's true for a director but producer's cardinality is set to `M`, there's no way to tell how many 
producers there usually are

Some movies have one director but several producers.
- True, as for the reasons in the answer above

There are some actors who have done a lead role, directed a movie, and produced some movie.
- Maybe, it's possible based on the diagram but not a guarantee

No movie has a director who also acted in that movie.
- False, it's definitely possible. 