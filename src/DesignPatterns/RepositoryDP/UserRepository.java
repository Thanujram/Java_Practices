package DesignPatterns.RepositoryDP;

// repository interface
public interface UserRepository {

    // Declaring the method for retrieving password for a given username

    public String getPassword(String username);
}
