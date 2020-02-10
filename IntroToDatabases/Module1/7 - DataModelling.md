## Visual Data Modelling

How and why are higher-level design languages used to design databases?
- Database designer uses these languages to describe / depict the database in an easier way to understand for the user

What are examples of high-level database design languages that exist?
- ER / UML

What is UML?
- Unified Modelling Language is a database design language consisting of 5 concepts:
1. Classes
1. Associations
1. Association classes
1. Subclasses
1. Composition & Aggregation

What is a class in UML and how is it drawn?
- A class is the same as an Entity in an ERD. In a box, the name is labelled on top, followed by attributes and then
methods in separate sections underneath.

How do you indicate attributes in UML?
- Underneath the class name, in the same box

How do you indicate a primary key in UML?
- adding (PK) to an attribute

What is an association in UML and how is it drawn? Where is its name captured?
- Association is applying a relationship between two classes, it's drawn / stated along the line connecting two entities

How are directionality and multiplicity captured in UML?
- Directionality uses an arrow, multiplicity uses one of the association relationships such as 1..5 or 1..**

What does the * mean when indicating a multiplicity? What other abbreviations are possible with UML multiplicities?
- It means many - no upper bounds. A variable name like M or N etc can also be used, as well as whole numbers for finite bounds

How are 1:1, 1:many, and many:many relationships represented in UML?
- 1..1 or 1 on both sides |1 on left,  1..* on right | a variation using * on both sides

What is an association class in UML and how is it drawn?
- Allows us to put attributes on the association and is drawn like a normal class

What is impossible to model in UML but was previously possible in the E-R diagrams we’ve seen?
- UML cant describe the possibility or having more than one association between two objects, an association can only
assume a relationship between two objects across the two classes

What multiplicity on a relationship that has an association class can lead to eliminating that association class entirely? What would it be replaced with?
- For associations with a 0..1 or 1..1 multiplicity, we could instead add the attributes to the class instead

Are self-associations possible? If so, what multiplicities are allowed on such associations?
- Yes, you just draw a circular line back to the class, any multiplicities can be used

What are subclasses in UML and how are they drawn?
- Subclasses are drawn like a regular class, connecting / pointing an unfilled arrow to its parent class

Can a subclass be empty of additional attributes? What can that accomplish?
- Yes, to accomplish the subclass having separate associations to classes specific to the subclass

What is generalization?
- UML superclasses

What is specialization?
- UML subclasses

What is a complete subclass relationship? Incomplete (partial)?
- Complete if every object in the superclass belong to at least one subclass, incomplete is the opposite

What is a disjoint subclass relationship? Overlapping?
- Disjoint if every object is in at most one subclass, overlapping is if objects can be in multiple subclasses

What is composition in UML and how is it drawn?
- Composition is where objects of one class belong to objects of another class, drawn by putting a solid diamond on the
line of association

What is aggregation in UML and how is it drawn?
- Drawn with an empty diamond, aggregation is where objects of a class may or may not belong to objects of another class

## Translating Diagrams into Relations

What is a regular class?
- A class with a primary key and some attributes

What one provision must regular classes adhere to, in order for the translation process to work?
- Every regular class must have a key

How do you translate classes (entity sets) into the relational model?
- Classname(Attribute1, attribute2, etc)

How do you translate attributes into the relational model?
- Shown above

How do you translate primary keys into the relational model?
- Underline the attribute that's designated as the PK

How do you translate an association into the relational model?
- An association looks like a class but has the class' PKs as attributes - Association(pk_class1, pk_class2)

What is the key for a relation generated from an association?
- Default to both keys, but depends on multiplicity

For * to *?
- Use both keys

For 0..1 to *?
- Take the key from the * side

For 1..1 to *?
- Same as above (* side)

How can you fold a relation generated from an association into one of the class relations?
- Add the key from the 0..1 / 1..1 side to the other side

^ When is this appropriate?
- When the relationship is 0..* or 1..*

^ Does the primary key of the class relation change because of the folding?
- No

How do you translate an association class into the relational model?
- Take the keys from both sides of the association

In UML, can there be more than one entry in the association class relation for the relationship?
- No, at most one

Is an association class a regular class?
- No, an association class doesn't need a key

Can you fold a relation generated from an association class into one of the other class relations? When? How?
- Yes, it works the same as associations

How do you translate self-associations into the relational model?
- Change the PK attribute name so you can have two (PK1, PK2)

What is the key for a relation generated from a self-association?
- Same answer as regular associations, depending on their multiplicity

What are the three ways to translate a subclass relationship into relations?
1. Subclass relations contain superclass key + specialized attributes (SuperclassPK, subclassAttribute)
1. Subclass relations contain all attributes (Superclass + subclass)
1. One relation containing all superclass + subclass attributes (Combine all attributes into one)

^ When is it appropriate to use each one?
1. Incomplete relationship
1. Disjoint + complete properties in a relationship (and no superclass relation)
1. Heavy overlapping subclass relationship

Are subclasses regular classes?
- No, subclasses don't need a primary key

How do you translate a composition into the relational model?
- Have the component-side class of the relationship add the other sides primary key to itself

Is the component-side class of the composition a regular class?
- No, the component-side class doesn't require a key.

How do you translate an aggregation into the relational model?
- Same design as above, but the added key from the non-component side needs to have a `NOT NULL` capability

1. Convert your E-R diagram for Unicorn profiles into relations.

Employee(eid(PK), name, job_title, discipline, slack_name, location, email, join_date, phone_number)
Unicorn(uid(PK), description, boops)
Receives(eid(PK), uid(PK))
Achievement(aid(PK), name, count, level, eid)
Team(tid(PK), name, team_lead, eid)
Project(pid(PK), name, description, tid)
WorkingOn(eid(PK), pid(PK))


