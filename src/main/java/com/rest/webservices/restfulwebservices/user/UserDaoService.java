package com.rest.webservices.restfulwebservices.user;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users =new ArrayList<>();

    private static int usersCount=3;

    static {
        users.add(new User("Adam1",1,new Date()));
        users.add(new User("Adam2",2,new Date()));
        users.add(new User("Adam3",3,new Date()));

    }

    public List<User> findAll()
    {
        return users;

    }

    public User save(User user)
    {
        if(user.getId()==null)
            user.setId(++usersCount);
        users.add(user);
        return user;

    }

    public User findUser(int id)

    {
        for(User user:users)
        {
            if(user.getId()==id)
                return user;
        }
        return null;
    }


}
