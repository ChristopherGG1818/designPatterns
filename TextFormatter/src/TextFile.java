import java.util.ArrayList;
import java.util.Random;

public class TextFile {
    private ArrayList<String > filecontent;
    private IFormat format;

    public TextFile(){
        filecontent = new ArrayList<>();

    }
    public TextFile(ArrayList<String> data ){
        filecontent = data;

    }
    public void printPlainText(){
        for( int i= 0; i < filecontent.size(); i++)
            System.out.println(filecontent.get(i));
    }
    public void printMarkdown (){
        String [] options = {"**", "#", "***", "~~~", "_"};
        Random rng  = new Random();
        System.out.println("#"  + filecontent.get(0));
        System.out.println("<head>");
        for( int i= 0; i < filecontent.size(); i++) {
            int number = rng.nextInt(options.length);
            String option = options[number];
            System.out.println(option + filecontent.get(i) + option);
        }
    }
    public void printHTML (){
        System.out.println("</head>");
        System.out.println("</hmtl>");

        for( int i= 0; i < filecontent.size(); i++) {
            System.out.println("<text=" + filecontent.get(i) + ">");
        }
        System.out.println("");
        System.out.println("");
    }
    public void setFormat(IFormat format) {
        this.format = format;
    }
    public void printFormatted(){
        format.format(filecontent);
    }

}
