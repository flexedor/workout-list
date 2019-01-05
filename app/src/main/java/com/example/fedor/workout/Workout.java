package com.example.fedor.workout;

public class Workout {

private String name ;
private String description;

public static final Workout[] workouts={
        new Workout("The limb Loosener","5 Nand stands push-ups\n10 1-legged squats\n15 pull-ups"),
        new Workout("Core Agony","100 pull-ups\n100 Push-ups\n100 sit-ups\n100 Squats"),
        new Workout("The Wimp Special","5 Pull-ups\n10 Push-ups\n15 Squats"),
        new Workout("strength and Length","500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
};
private Workout(String name,String description){
    this.name=name;
    this.description=description;
}
public String getDescription (){
    return description;
}
public String getName(){
    return name;
}
public String toString(){
    return this.name;
}
}
