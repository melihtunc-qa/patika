package oop.movie;

public class User {

    private String name;
    private String email;
    private String password;
    private boolean isSubscriber;
    private double accountBalance;

    public User(String name, String email, String password, boolean isSubscriber, double accountBalance) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isSubscriber = isSubscriber;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSubscriber() {
        return isSubscriber;
    }

    public void setSubscriber(boolean subscriber) {
        isSubscriber = subscriber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


}
