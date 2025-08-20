public interface StrongFilter <T> {
    public boolean getFilterResult(T obj);
    public <U extends T> void example(U obj); //just an example for how it should be written
    public StrongFilter or(StrongFilter stronger){
        //what is the first fiilter???
        //how do i access the second filter's results
        //and if it dosent stand for the if, what should i return

    }
    public StrongFilter and(StrongFilter stronger){

    }
}
