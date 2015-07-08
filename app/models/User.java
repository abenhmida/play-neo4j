package models;

import java.util.Set;

class User {
    String login;
    String name;
    String password;
    Set<Rating> ratings;
    Set<User> friends;
    Rating rate(Movie movie, int stars, String comment) {
        return null;
    }
    void befriend(User user) { }
}