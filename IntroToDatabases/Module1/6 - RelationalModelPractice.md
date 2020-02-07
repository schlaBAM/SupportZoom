## Relational Model Practice

#### True or False

1. In ER diagrams, a relationship set can exist between an entity set and itself. (True)

1. Given the table R(a,b,c), the following is a valid relation definition for S(d, e, a) where a is a foreign key 
referencing R. (True - assuming the first attribute is the PK)

1. The primary key of a table is made up columns x and y. In a given row, either x or y can be null, but not both. (False)

1. The columns of a relation are sometimes called "tuples." (False - tuples are rows)

1. A weak entity is an entity that cannot exist in the database without (and is logically dependent upon) another 
type of entity also existing in the database. (True)

1. In the relational model, cardinality is referred to as the number of attributes in a relation. (False - degree)

1. In the case of entity integrity, the primary key can be null. (false)

#### Movie schema practice

What is the key of relation Movies? 
- `mID`

Change the instance of relation Artists in a way that violates its key constraint.
- Add a tuple that uses one of the already used `aID`s 

According to the schema, is there any limit on the number of directors a movie can have?
- Yes, you wouldn't be able to do so without having multiple names in one value/cell or by adding an extra tuple with the
same data, but because `mID` is a key this can't be done.

According to the schema, can exactly the same movie title be used for two different movies?
- Yes, it's not a primary key

Change the instance of the database so that the constraint Roles[aID] ⊆ Artists[aID] is violated.
- Update `aID`[1] in `Artists` to [5], which would cause violations for `Roles` with `aID`[1]. 

Does any actor show up in relation Roles twice with same mID?
- No

According to the schema, can an actor show up in relation Roles twice with same mID?
- it's possible, there's nothing preventing an Actor showing up in the same `mID`.
