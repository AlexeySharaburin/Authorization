package ru.netology.authorization.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorization.Authorities;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


@Repository
public class UserRepository {

    final Map<List<String>, List<Authorities>> userAuthoritiesList = new ConcurrentHashMap<>();

    public List<Authorities> getUserAuthorities(String user, String password) {

        List<String> user1 = Arrays.asList("John", "123");
        List<String> user2 = Arrays.asList("Smith", "555");
        List<Authorities> authorizatedUser1 = new ArrayList<>();
        List<Authorities> authorizatedUser2 = new ArrayList<>();

        authorizatedUser1.add(Authorities.DELETE);
        authorizatedUser1.add(Authorities.READ);
        authorizatedUser2.add(Authorities.WRITE);

        userAuthoritiesList.put(user1, authorizatedUser1);
        userAuthoritiesList.put(user2, authorizatedUser2);

        for (Map.Entry<List<String>, List<Authorities>> userAuthoritiesEntry : userAuthoritiesList.entrySet()) {

            if ((userAuthoritiesEntry.getKey().contains(user)) && (userAuthoritiesEntry.getKey().contains(password))) {

                return userAuthoritiesEntry.getValue();
            }
        }

        return Collections.emptyList();
    }
}


