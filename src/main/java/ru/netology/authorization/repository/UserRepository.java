package ru.netology.authorization.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorization.Authorities;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

//@Repository
public class UserRepository {

    final Map<List<String>, List<Authorities>> userAuthoritiesList = new ConcurrentHashMap<>();




    public List<Authorities> getUserAuthorities(String user, String password) {

        List<String> user1 = Arrays.asList("John", "123");
        List<Authorities> authorizatedUser1 = new ArrayList<>();
        userAuthoritiesList.put(user1,authorizatedUser1);

        for (Map.Entry<List<String>, List<Authorities>> userAuthoritiesEntry : userAuthoritiesList.entrySet()) {

            if ((userAuthoritiesEntry.getKey().contains(user)) && (userAuthoritiesEntry.getKey().contains(password))) {
                return userAuthoritiesEntry.getValue();
            }
        }

        return Collections.emptyList();
    }
}
