package generics.StoryCharacters;

public class Guy {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + getClass().getSuperclass().getSimpleName();
    }
}
