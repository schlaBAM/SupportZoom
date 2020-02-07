Add cardinality to the relationships in your E-R diagram for the Unicorn profiles.
- [Model image here (same as previous)](https://screenshot.click/rqzp3-02-06_13-55-i02hq.png)
Cardinality often dictates the detailed design of a database. The cardinality depends on the real-world meaning of the entity types involved and is defined by the specific application. For the binary relationships below, suggest cardinality (one-one, one-many, many-one, many-many). Clearly state any assumptions you make.


|      Entity1      | Cardinality |        Entity2       |                               Assumption                               |
|:-----------------:|:-----------:|:--------------------:|:----------------------------------------------------------------------:|
|      Student      |  one - one  | Social Security Card |          if they've got multiple cards damn they're in trouble         |
|      Student      | many - many |        Teacher       | a student has multiple teachers, the same can be said for the opposite |
|     Classroom     |  one - many |         Wall         |                    a classroom needs multiple walls                    |
|      Student      | many - many |         Class        |   each student can be in multiple classes that have multiple students  |
|       Class       |  many - one |      Instructor      |                  an instructor can teach many classes                  |
|     Instructor    |  one - one  |        Office        |                        one office per instructor                       |
|       Course      |  one - many |       Textbook       |                  a course can have multiple textbooks                  |
|     OrderItem     |  many - one |         Order        |            multiple order items can be assigned to an order            |
| eBay auction item |  one - many |       eBay bid       |           generally one auction item will have multiple bids           |
|      Country      |  one - one  |   Current president  |                        one president per country                       |