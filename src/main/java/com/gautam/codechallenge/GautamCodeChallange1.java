package com.gautam.codechallenge;

import com.gautam.codechallenge.loader.DataLoader;
import com.gautam.codechallenge.model.GENDER;
import com.gautam.codechallenge.model.Person;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Person has 5 Attributes Age ,Salary , Location , Gender , Name
 *
 * Create Sufficient amount of Person Data to meet following Requirements
 *
 * 1. Average Salary of Persons who meet following criterion
 * - Age > 25
 * - Salary > 25000
 * - Location = Hyderabad
 * - Gender = Female
 * - Name starting with "R"
 *
 * 2. Segregate the Persons based on Locations
 *
 *  output : Hyderabad
 *                    Sai
 *                    Srinu
 *                    Rakshita
 *                    Reena
 *           Bangalore
 *                    vishnu
 *                    ram
 *           Chennai
 *                    Selvam
 * Note : Use on Java 8 features like STreams,Lamda , Method reference , optional , Functional Interface etc
 *
 */
public class GautamCodeChallange1 {

    public static void main(String[] args) {
        //load emp data
        final DataLoader loader = new DataLoader();
        final List<Person> personList = loader.loadEmpData();
        System.out.println(personList);
        if (personList !=null) {
            // Rule 1. Average Salary of Persons who meet following criterion
            final OptionalDouble average = personList.stream()
                    .filter(p -> p.getAge() > 25)
                    .filter(p -> p.getSalary() > 25000)
                    .filter(p -> p.getLocation().equalsIgnoreCase("Hyderabad"))
                    .filter(p -> p.getGender().equals(GENDER.FEMALE))
                    .filter(p -> p.getName().startsWith("R"))
                    .mapToDouble(Person::getSalary)
                    .average();
            // avgSalaryRule1
            System.out.println("AvgSalaryRule1: "+average);

            // Rule 2. Segregate the Persons based on Locations
            // group by location
            final Map<String, List<Person>> groupByLocation = personList.stream()
                    .collect(Collectors.groupingBy(Person::getLocation));
            System.out.println("GroupByLocation: " + groupByLocation);

            // group by location, uses 'mapping' to convert List<Person> to Set<String>
            final Map<String, Set<String>> result = personList
                    .stream()
                    .collect(
                            Collectors.groupingBy(Person::getLocation,
                                    Collectors.mapping(Person::getName, Collectors.toSet())));
            System.out.println("Result-2: " + result);

        }

    }


}
