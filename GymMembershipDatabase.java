package com.gla.jbbc;
import java.util.*;

class Member {
    int id;
    String name;
    String type;   // "Premium" or "Basic"
    int months;    // validity

    Member(int id, String name, String type, int months) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.months = months;
    }
}

public class GymMembershipDatabase {

    static ArrayList<Member> members = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE (Add members)
        members.add(new Member(1, "Rahul", "Premium", 6));
        members.add(new Member(2, "Amit", "Basic", 0));
        members.add(new Member(3, "Neha", "Premium", 3));

        // READ (Premium members only)
        System.out.println("Premium Members:");
        for (Member m : members) {
            if (m.type.equalsIgnoreCase("Premium")) {
                System.out.println(m.id + " | " + m.name + " | " + m.type + " | " + m.months + " months");
            }
        }

        // UPDATE (extend membership months)
        int updateId = 3;
        int extendMonths = 6;

        for (Member m : members) {
            if (m.id == updateId) {
                m.months += extendMonths;
                System.out.println("Extended membership for " + m.name + ": " + m.months + " months");
            }
        }

        // DELETE (remove expired/cancelled members)
        members.removeIf(m -> m.months <= 0);

        // Final List
        System.out.println("\nFinal Member List:");
        for (Member m : members) {
            System.out.println(m.id + " | " + m.name + " | " + m.type + " | " + m.months + " months");
        }
    }
}

