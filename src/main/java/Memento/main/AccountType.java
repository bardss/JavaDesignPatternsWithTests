package Memento.main;

public enum AccountType {
    STUDENT("Student"),
    BUSINESS("Business"),
    STANDARD("Standard"),
    PENSIONARY("Pensionary");

    private String title;

    AccountType(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
