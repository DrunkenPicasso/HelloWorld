package ch.sandbox.HelloWorld;

public class HelloCountry {
    public static void main(String[] args) {
        Country countryselection = new Country();
        countryselection.name = Country.Countryname.Swiss;
        System.out.println("The following country was selected: " + countryselection.name);
    }
}

class Country {
    enum Countryname {Swiss, Germany, Austria}
    Countryname name;
}

