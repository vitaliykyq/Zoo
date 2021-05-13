package edu.coursework.zoo.data;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    FakeData
    @version:    1.0.0
    @since:    14.04.2021
*/

import edu.coursework.zoo.model.Administration;
import edu.coursework.zoo.model.Feed;
import edu.coursework.zoo.model.Provider;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.*;

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

    private List<Provider> providerList = new ArrayList<>(
            Arrays.asList(
                    new Provider("1", "Jhon", "Manager", "London", "2020-05-06",
                            "2020-05-06"),
                    new Provider("2", "Milon", "Head", "London", "2020-05-06",
                            "2020-05-06"),
                    new Provider("3", "Dudas", "Manager", "London", "2020-05-06",
                            "2020-05-06"),
                    new Provider("4", "Loli", "Manager", "London", "2020-05-06",
                            "2020-05-06"),
                    new Provider("5", "Nina", "Worker", "London", "2020-05-06",
                            "2020-05-06"),
                    new Provider("6", "Masha", "Manager", "London", "2020-05-06",
                            "2020-05-06"),
                    new Provider("7", "Katya", "Head", "London", "2020-05-06",
                            "2020-05-06"),
                    new Provider("8", "Lora", "Manager", "London", "2020-05-06",
                            "2020-05-06"),
                    new Provider("9", "Vara", "Worker", "London", "2020-05-06",
                            "2020-05-06"),
                    new Provider("10", "Oleg", "Manager", "London", "2020-05-06",
                            "2020-05-06")));

    private List<Feed> feedList = new ArrayList<>(
            Arrays.asList(
                    new Feed("1", "Apple", "2020-05-06", 3, 10000, providerList.get(0)),
                    new Feed("2", "Mango", "2020-05-06", 5, 10000, providerList.get(0)),
                    new Feed("3", "Meat", "2020-05-06", 7, 12000, providerList.get(0)),
                    new Feed("4", "Water", "2020-05-06", 9, 6000, providerList.get(0)),
                    new Feed("5", "Potato", "2020-05-06", 5, 10000, providerList.get(0)),
                    new Feed("6", "Tomato", "2020-05-06", 6, 15000, providerList.get(0)),
                    new Feed("7", "Bread", "2020-05-06", 4, 10000, providerList.get(0)),
                    new Feed("8", "Orange", "2020-05-06", 6, 19000, providerList.get(0)),
                    new Feed("9", "Papaya", "2020-05-06", 3, 1000, providerList.get(0)),
                    new Feed("10", "Pineapple", "2020-05-06", 6, 10000, providerList.get(0))));

    public List<Administration> getAdministrations() {
        return administrations;
    }

    public void setAdministrations(List<Administration> administrations) {
        this.administrations = administrations;
    }

    public List<Provider> getProviderList() {
        return providerList;
    }

    public void setProviderList(List<Provider> providerList) {
        this.providerList = providerList;
    }

    public List<Feed> getFeedList() {
        return feedList;
    }

    public void setFeedList(List<Feed> feedList) {
        this.feedList = feedList;
    }
}
