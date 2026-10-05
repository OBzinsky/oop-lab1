
Lab 4
5/10/26
Oliver Brzezinski

Notes:

#1. Lab 4 changes LibraryService from working wih a single supplied book to owning a list<book>

#2. list<book> can tell the compiler the book by title alone

#3. final doesnt freeze the list, it still allows adding and removing books, it only prevents code assigning a different list to the field later.

#4. the enhanced for loop variable represents the title of the book

#5. findBookByTitle returns either the title of the book if its known or a null if its unknown

#6. why create another search loop if findBook already exists

#7. Main creates objects,calls LibraryService and prints results,
    LibraryService owns the list, finds books and checks the loan durations
    Book protects its own fields and decides whether borrowing or returning is allowed

#8. maven build was successful & the final count is 2, no ai assistance was used.

