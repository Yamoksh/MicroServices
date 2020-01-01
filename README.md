# MicroServices

## Project: Favourite Movies List with thier ratings

 In this project, I created three microservices.
### 1. Movie Catalog MicroService:
      Fetches the list of movies by userId and find their corresponding rating & movie information from remaing two different services.       Eventually this service call another two microservices and aggregate the result and return to the user.

### 2. Rating MicroService:
    Provide the ratings of movie by movieId and provides the list of user ratings by userId

### 3. Movie Info MicroService: 
    Provide movie information by movieId.

#### For Service Discovery I created Eureka Server which runs on port 8761 and remaining microservices are the Eureka Clients which are running on port 8081, 8082, and 8083.


## Tech Stack:
  1. Spring Boot
  2. Spring Cloud (Eureka)
  3. RX JAVA ( Commented code in Movie Catalog)
