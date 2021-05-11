package edu.coursework.zoo.data;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    FakeData
    @version:    1.0.0
    @since:    14.04.2021
*/

import edu.coursework.zoo.model.Administration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeData {

    private List<Administration> administrations = new ArrayList<>(
            Arrays.asList(
                    new Administration("1", "Head", "All Zoo"),
                    new Administration("2", "Coordinator", "All Zoo"),
                    new Administration("3", "Director", "The first sector"),
                    new Administration("4", "Manager", "All Zoo"),
                    new Administration("5", "Specialist", "All Zoo"),
                    new Administration("6", "Director", "The second sector"),
                    new Administration("7", "Director", "The third sector"),
                    new Administration("8", "Director", "The fourth sector"),
                    new Administration("9", "Support Manager", "The first and second sectors"),
                    new Administration("10", "Support Manager", "The third and fourth sectors")));

    public List<Administration> getAdministrations() {
        return administrations;
    }

    public void setAdministrations(List<Administration> administrations) {
        this.administrations = administrations;
    }
}
