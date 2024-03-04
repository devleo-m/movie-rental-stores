# movie-rental-stores


## requirements:

1. **Movie Registration:**
   - Allow registration of new movies into the system.
   - Essential fields may include title, genre, release year, director, etc.

2. **Movie Query:**
   - Allow users to query the list of available movies.
   - Query options may include by title, genre, director, year, etc.

3. **Movie Reservation:**
   - Allow users to reserve available movies.
   - There should be a control to prevent already reserved movies from being reserved again.

4. **Movie Rental:**
   - Allow users to rent available movies.
   - Maintain a record of rentals, including rented movie, customer, pickup date, and return date.

5. **Movie Return:**
   - Allow users to return rented movies.
   - Update the rental record to reflect the return.

6. **Customer Registration:**
   - Allow registration of new customers into the system.
   - Essential fields may include name, address, phone number, etc.

7. **Customer Query:**
   - Allow users to query the list of registered customers.
   - Query options may include by name, phone number, etc.

8. **Report Generation:**
   - Allow generation of reports, such as most popular movies, most frequent customers, etc.

9. **Inventory Management:**
   - Maintain inventory control of movies available for rental.

10. **Late Returns and Fines Management:**
    - Implement a system to handle late returns of movies and calculate fines, if applicable.

11. **Terminal User Interface:**
    - Create a user-friendly interface in the terminal for users to interact with the system.
    - Use clear menus and options to facilitate navigation.



## Simplified example of how the terminal output of the movie rental system might look like:

```
Welcome to Movie Rental

1. Movie Registration
2. Movie Query
3. Movie Reservation
4. Movie Rental
5. Movie Return
6. Customer Registration
7. Customer Query
8. Reports
9. Exit

Choose an option: 2

--- Movie Query ---

1. The Godfather - Drama - 1972
2. Interstellar - Science Fiction - 2014
3. Forrest Gump - Drama - 1994
4. Avengers: Endgame - Action - 2019
5. The Matrix - Science Fiction - 1999

Choose an option:
```



## Example of how the movie rental interface:

```
Choose an option: 4

--- Movie Rental ---

Enter the movie number you wish to rent:
2

Selected Movie: Interstellar - Science Fiction - 2014

Enter your name: John Doe
Enter your phone number: 123456789
Enter the pickup date (dd/mm/yyyy): 04/03/2024

Movie rented successfully! Return date: 11/03/2024

Press Enter to continue...
```

-   [ ] Generate a custom movie identifier for the movies - using a pattern of two letters and 3 numbers, e.g.: "AA-000"
