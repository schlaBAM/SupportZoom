## Constraints

### Primary keys

1. All are valid except tuple 3 and 5 - 3 has a null id, 5 has a duplicate id(2)

2. The first 3 tuples are valid. 4 has a null name, 5 has a null state, and 6 has a duplicate name/state

3. 
- Customer - `cust_id`
- Rent - `rent_id` 
- Car `reg_no` 

4. Done on the cardinality diagram - [Model image here]()

### Foreign keys

1. Only tuple 1 is valid. We can assume `student_id` is the foreign key for Student,
and College has two foreign keys (`college_name` and `college_state`).  Tuple 2 has all null values, tuple 3 is missing a student_id, 4 has a student_id that doesn't exist, 5 doesn't have a
college_name, 6 is missing a college_state, and 7 has a college name/state combo that doesn't exist in the college table.

2. 

