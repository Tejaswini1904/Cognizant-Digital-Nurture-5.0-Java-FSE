package com.cognizant.springcore;

import java.util.List;

public class CountryService {

    private List<Country> countries;

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public void displayCountries() {

        System.out.println("List of Countries");
        System.out.println("-------------------------");

        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
