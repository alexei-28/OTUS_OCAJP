package ru.otus.ocajp.webinar23.pond.inland;

import ru.otus.ocajp.webinar23.pond.shore.Bird;

public class BirdWatcherFromAfar {

    public void watchBird() {
        Bird bird = new Bird();
        // bird.floatInWater(); // compile error - protected method "floatInWater()" not access from another package
        // System.out.println(bird.text); // compile error - protected property "text" not access from another package
    }
}
