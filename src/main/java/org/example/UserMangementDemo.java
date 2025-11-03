package org.example;

import java.util.*;

public class UserMangementDemo {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User(true, "Alice", new HashSet<>(Arrays.asList("ADMIN", "USER"))));
        users.add(new User(false, "Bob", new HashSet<>(Arrays.asList("USER"))));
        users.add(new User(true, "Charlie", new HashSet<>(Arrays.asList("Manager"))));

        // Remove inactive users
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().isActive()) {
                iterator.remove();
            }
        }

        // Print active users only once
        System.out.println("Active users:");
        for (User user : users) {
            System.out.println(user.getName());
        }
        //count users per role
        Map<String,Integer> roleCount=new HashMap<>();
        for(User user:users)
        {
            for(String role:user.getRoles())
            {
                roleCount.put(role,roleCount.getOrDefault(role,0)+1);
            }
        }
        System.out.println("All users");
        for(Map.Entry<String,Integer> entry: roleCount.entrySet()){
            System.out.println(entry.getKey()+" ; "+entry.getValue());
        }
    }
}
