package oop.a5static;

public class Friend {
    
    static int numOfFriend;

    String name;

    public Friend(String name){
        this.name = name;
        numOfFriend++;
    }

    public void ShowFriend(){
        System.out.println("You have " + numOfFriend + " total friends");
    }
}
