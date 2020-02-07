## Constraints

### Primary keys

1. All are valid except tuple 3 and 5 - 3 has a null id, 5 has a duplicate id(2)

2. The first 3 tuples are valid. 4 has a null name, 5 has a null state, and 6 has a duplicate name/state

3. Customer (`cust_id`), Rent (`rent_id`), Car (`reg_no) 

4. Done on the cardinality diagram - [Model image here](https://screenshot.click/rqzp3-02-06_13-55-i02hq.png)

### Foreign keys

1. Only tuple 1 is valid. We can assume `student_id` is the foreign key for Student,
and College has two foreign keys (`college_name` and `college_state`).  Tuple 2 has all null values, tuple 3 is missing a student_id, 4 has a student_id that doesn't exist, 5 doesn't have a
college_name, 6 is missing a college_state, and 7 has a college name/state combo that doesn't exist in the college table.

2. Inserting (11111, 'name', 'English', 10000) into `Instructor` would cause issues as `Department` does not have
an `English` value under the `name` attribute. Deleting any of the tuples from `Department` would cause constraints to 
`Instructor` as each value under `name` is being used in the `dept_name` attribute.

3.  In the instance of the Instructor relation above, no two instructors have the same name. From this, can we conclude 
that the attribute name can be used as a primary key of Instructor?
- No, we can't make the assumption that no two instructors will ever share the same name so it wouldn't be a safe choice.

4. Design a schema with appropriate primary and foreign keys for an (extremely) light-weight version of Instagram. 
Include the ability to have photos, comments, commenters, and hashtags, but no need to go overboard with dozens of 
attributes per entity or per relationship.

### Post

| id (PK) | user_id (FK) |                caption                | likes_count |      url     |
|:-------:|:------------:|:-------------------------------------:|:-----------:|:------------:|
|    1    |      11      |              'so pitted'              |      50     |  google.com  |
|    2    |      22      |           'just hanging out'          |      30     |   google.ca  |
|    3    |      33      | 'another solid weekend with the boys' |     321     | google.co.nz |

### Comment

| id (PK) | post_id (FK) | user_id (FK) |       message      | likes |
|:-------:|:------------:|:------------:|:------------------:|:-----:|
|    1    |       1      |      11      |     'nice foot'    |   0   |
|    2    |       1      |      22      |      'send it'     |   3   |
|    3    |       2      |      33      |        'lol'       |  142  |
|    4    |       2      |      33      | 'that's hilarious' |   0   |
|    5    |       3      |      22      |      'comment'     |   0   |


### User

| id (PK) |       name       |    profile_img    | post_count | followers | following |
|:-------:|:----------------:|:-----------------:|:----------:|:---------:|:---------:|
|    11   |       'TIM'      |   'yo.com/a.jpg'  |     16     |  10009911 |   14214   |
|    22   |  'John Sanders'  | 'hello.com/b.jpg' |     249    |   928412  |     7     |
|    33   | 'Marshall Boone' |   'yo.com/c.jpg'  |      1     |     15    |    491    |


