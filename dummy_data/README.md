# Instructions on how to add dummy data

Here is the design of the database. 
![](https://raw.githubusercontent.com/thecoducer/REST-API-Library-Management-System/master/images/db_design.jpg)

### Google sheets link
https://docs.google.com/spreadsheets/d/17cnJ7LSDGSBPJsUlVcwPotb_ZUbOiXiI1e9KSBiayPg/edit?usp=sharing

## Student
- Add only five data columns
- `roll_no` field must only have digits. It can hold big numbers. You can enter our university roll no too.
- `dob` stands for date of birth. The date format is YYYY-MM-DD. Example: 1996-12-03
- `yoa` stands for year of admission. The date format is YYYY-MM-DD. Example: 2016-07-15
- `year` means which year the student currently is. Example: 4
- `dept` stands for department. Must be in full form. Example: Computer Science and Engineering
- `course` Example: BTech or MTech or BCA
- `phone` field must only have digits and the length of the field must not exceed 10. You can also insert a landline no.
- `address` insert whatever you think it to be the best

## Teacher
- Add only five data columns
- `dob` stands for date of birth. The date format is YYYY-MM-DD. Example: 1996-12-03
- `yoap` stands for year of appointment. The date format is YYYY-MM-DD. Example: 2016-07-15
- `dept` stands for department. Must be in full form. Example: Computer Science and Engineering
- `phone` field must only have digits and the length of the field must not exceed 10. You can also insert a landline no.
- `address` insert whatever you think it to be the best

## Books
- `isbn` can be either 13 or 10 digits. Google a book title and get its ISBN. This is a bigint field in DB so don't enter hyphens. Only digits.
- `title` is the book title
- `category` Google book title and get to know its category. The genre also goes into this field. Example: Fiction, Horror or Non-Fiction
- `pub_date` is the published date. Same date format.
- `publisher`
- `arrival` is a date field that stores date info about when a book arrived in the library
- `copies` No. of copies of a book we have
- `price` is float field

## Authors
- For each book, fill its corresponding author info here in this table
- `isbn` field must match the isbn value of that book in `Books`  table for which you're adding author info
- `name1` Name of first author
- `name2` Name of second author, if any
- `name3` Name of second author, if any

## Periodicals
Magazines, newspapers and journals all fall under the periodicals category. It's hard to find info about periodicals. So for dummy data purposes you can enter any random name and values to following fields.
- `issn` is 8 digits in length. This is a bigint field in DB so don't enter hyphens. Only digits.
- `title` 
- `type` Example: Newspaper/Magazine/Journal
- `category` Example: Science, Photography, Chemistry or News
  - News category is for newspaper and other categories can be assigned to kind of magazine/journal you add.
- `pub_date` is the published date. Same date format.
- `publisher`
- `arrival` is a date field that stores date info about when a periodical arrived in the library
- `copies` No. of copies of a book we have
- `price` is float field
