package Singleton.main.Countries;

public enum CountryType{
    POLAND ("Poland"),
    GERMANY ("Germany"),
    SPAIN ("Spain"),
    ITALY ("Italy");

    private String name;

    CountryType(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
