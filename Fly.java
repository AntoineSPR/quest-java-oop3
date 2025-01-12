public interface Fly {

    void takeOff();

    int ascend(int meters);
    
    default String glide() {
        return "glides into the air";
    };
    
    int descend(int meters);
    
    void land();
}
