import java.util.Random;

public class MarkdownFormat  implements IFormat{
    @Override
    public void printMarkdown (){
        String [] options = {"**", "#", "***", "~~~", "_"};
        Random rng  = new Random();
        System.out.println("#"  + data.get(0));
        System.out.println("<head>");
        for( int i= 0; i < data.size(); i++) {
            int number = rng.nextInt(options.length);
            String option = options[number];
            System.out.println(option + data.get(i) + option);
        }
    }

}
